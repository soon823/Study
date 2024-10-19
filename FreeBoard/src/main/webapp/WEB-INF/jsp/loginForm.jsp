<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../includes/header.jsp"></jsp:include>
<h3>로그인화면(loginForm.jsp)</h3>
<form action="loginForm.do" method="POST">
<table class="table">
	<tr>
		<th>아이디</th>
		<td><input type="text" name="logId"></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="password" name="logPw"></td>
	</tr>
	<tr>
		<td colspan="2">
			<button type="submit">로그인하기</button>
		</td>
	</tr>
</table>
</form>

<jsp:include page="../includes/footer.jsp"></jsp:include>
