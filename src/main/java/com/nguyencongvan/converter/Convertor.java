package com.nguyencongvan.converter;

import java.lang.reflect.Field;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nguyencongvan.entity.AbstractEntity;


@Component
public class Convertor<D,T> {

	@Autowired
	private  ModelMapper modelMapper;
	
	public D convertToEntity(T dto , Class<D> entity) {
		D result= modelMapper.map(dto, entity);
		return result;
	}
	
	public T convertToDTO(D entity, Class<T> dto) {
		T result= modelMapper.map(entity, dto);
		try {
			Field fieldE;
			Field fieldR;
			Field[] fieldA=AbstractEntity.class.getDeclaredFields();
			for(Field field:fieldA) {
				fieldE=entity.getClass().getSuperclass().getDeclaredField(field.getName());
				fieldE.setAccessible(true);
				fieldR=dto.getSuperclass().getDeclaredField(field.getName());
				fieldR.setAccessible(true);
				fieldR.set(result, fieldE.get(entity));
			}	
		} catch (NoSuchFieldException|SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	

}
