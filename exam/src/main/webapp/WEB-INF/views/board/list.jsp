<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
</head>
<body>
	<h3> 게시글 목록 </h3>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>저자</th>
				<th>내용</th>
				<th>이미지</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${boardList}" var="board"> <!-- ** items : 내가 Model로 넘긴 값 model.addAttribute("boardList", service.getAllBoardList())을 jstl로 기입 
																/ var : 그 items로 받아온 값을 forEach에서 쓸 변수명을 적어줌 **-->
				<tr>
					<td>${board.boardNo}</td>
					<td>${board.boardTitle}</td>
					<td>${board.boardWriter}</td>
					<td>${board.boardContent}</td>
					<!-- servlet-context.xml의 resources mapping= 쪽에서 설정해준 경로로 연결됨.-->
					<td><img alt="이미지" src="<c:url value='/resources/images/${board.boardImage}'/>" style="width:200px"></td>
					<!-- fmt:~로 default 포맷 = 실 데이터는 건드리지 않고 포맷만 바꿀 때 사용. 여기서는 기본형인'yyyy-MM-dd' 에서 'yyyy/MM/dd' 형태로 바꿔줄 것임-->
					<td><fmt:formatDate pattern="yyyy/MM/dd" value="${board.boardDate}"  /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>