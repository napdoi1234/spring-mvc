<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="category">
		<form:hidden path="id"/>
		<form:input path="name"/>
		<form:input path="status"/>
	</form:form>
</body>
</html>