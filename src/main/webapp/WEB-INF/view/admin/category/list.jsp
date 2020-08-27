<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body id="page-top">
	<%
		int i = 1;
	%>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${category.list}" var="cate">
				<tr>
					<td>${cate.id}</td>
					<td>${cate.name}</td>	
					<td><a href='<c:url value="/quan-tri/chinh-sua?id=${cate.id}"/>'>Chỉnh sửa</a></td>
				</tr>
				
			</c:forEach>
		</tbody>
	</table>
	<form id="page" method="get">
		<input type="hidden" id="currentPage" name="currentPage" /> <input
			type="hidden" id="limit" name="limit" />
	</form>
	<div class="myPages"></div>
	<script type="text/javascript">
		var currentPage = ${category.currentPage};
		var totalPage = ${category.totalPage};
		$(function() {
			$(".myPages").pxpaginate({
				align : 'center',
				maxBtnCount: 0,
				currentpage : currentPage,
				totalPageCount : totalPage,
				callback : function(pagenumber) {
					$('#limit').val(2);
					$('#currentPage').val(pagenumber);
					$("#page").submit();
				}
			});
		});
	</script>
</body>
</html>