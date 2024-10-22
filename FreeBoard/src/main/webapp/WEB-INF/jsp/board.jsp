<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.yedam.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../includes/header.jsp"></jsp:include> 
<h3>상세페이지(board.jsp)</h3>
<%
	BoardVO bvo = (BoardVO)request.getAttribute("boardvo");
	String pg = (String)request.getAttribute("page");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String wdate = sdf.format(bvo.getWriteDate());
%>

<table class="table">
	<tr>
		<th>글번호</th><td><%=bvo.getBoardNo() %></td><th>조회수</th><td><%=bvo.getViewCnt() %></td>
	</tr>
	<tr>
		<th>제목</th><td><%=bvo.getTitle() %></td>
		<th>작성자</th><td><%=bvo.getWriter() %></td>
	</tr>
	<tr>
		<th>내용</th><td colspan="3"><textarea class="form-control" id="exampleFormControlTextarea1" name="story" rows="5" cols="50" ><%=bvo.getContent() %></textarea>
	</td>
	</tr>
		<c:if test="${boardvo.img != null }">
	<tr>
		<th>이미지</th>
		<td colspan="3">
		<img src="images/${boardvo.img }" width="100px">
		</td>
	</tr>
		</c:if>
	<tr>
		<th>작성일시</th><td colspan="3"><%=wdate %></td>
	</tr>
	<tr>
			<td colspan="4" align="center">
				<input type="button" value="수정" class="btn btn-warning">
				<input type="button" value="삭제" class="btn btn-danger">
			</td>
		</tr>
	
</table>

<!-- 댓글관련 -->
<table id="replyList" class="table">
	<thead>
		<tr>
			<th>댓글번호</th><th>내용</th><th>작성자</th>
		</tr>
	</thead>
	<tbody>
	
	</tbody>
</table>

<jsp:include page="../includes/footer.jsp"></jsp:include> 


<script>
	document.querySelector('input[value="수정"]')//
	.addEventListener('click',function(e){
		location.href = 'modifyBoard.do?page=<%=pg %>&bno=<%=bvo.getBoardNo() %>';
	});
	document.querySelector('input[value="삭제"]')//
	.addEventListener('click',function(e){
		location.href = 'removeBoard.do?bno=<%=bvo.getBoardNo() %>';
	});
</script>

<script src="js/replyService.js"></script>
<script src="js/reply.js"></script>