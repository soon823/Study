<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../includes/header.jsp"></jsp:include> 
<h3>등록화면(boardForm.jsp)</h3>

<c:if test="${msg != null }">
<p style="color: red;">${msg }</p>
</c:if>

<form action="addBoard.do" method="post" enctype="multipart/form-data">
	<input class="form-control" type="hidden" name="writer" value="${logId }">
	<table class="table">
		<tr>
			<th>제목</th><td><input class="form-control" type="text" name="title"></td>
		</tr>
		<tr>
			<th>내용</th><<td><textarea class="form-control" name="content" rows="3" cols="30" ></textarea></td>
		</tr>
		<tr>
			<th>이미지</th><td><input type="file" name="img" class="form-control"></td>
		</tr>
		<tr>
			<th>작성자</th><td>${logId }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input  class="btn btn-success" type="submit" value="저장">
				<input class="btn btn-warning" type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>

<jsp:include page="../includes/footer.jsp"></jsp:include> 