<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp 전체조회</title>
<style>
* {
	box-sizing: border-box;
	margin : 0 auto;
} 
h1 {
	text-align:center;
	padding : 10px;
}
table, tr, th, td {
	border : 1px solid black;
	border-collapse : collapse;
	padding : 5px;
}
thead {
	background-color : gold;
}
</style>
</head>
<body>
	<h1>EMP TABLE</h1>
	<button type="button" onclick="location.href='getEmp?employeeId=${employeeId}'">사원등록</button>
		<table>
			<thead>
				<tr>
					<th>employeeId</th>
					<th>firstName</th>
					<th>lastName</th>
					<th>email</th>
					<th>hireDate</th>
					<th>jobId</th>
					<th>salary</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="empList" items="${empList}">
					<tr onclick="location.href='getEmp?employeeId=${empList.employeeId}'">
						<td>${empList.employeeId}</td>
						<td>${empList.firstName}</td>
						<td>${empList.lastName}</td>
						<td>${empList.email}</td>
						<td>${empList.hireDate}</td>
						<td>${empList.jobId}</td>
						<td>${empList.salary}</td>
						<%-- <td><button type="button" onclick="location.href='/java/emp/deleteInfo/${emp.employeeId}'">삭제</button></td> --%>
						<td><button type="button" onclick="deleteInfo(${empList.employeeId}, event)">삭제</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
<script>
/* 사원삭제 방법2*/
function deleteInfo(id, event) {
	event.stopPropagation();
	location.href='deleteInfo/'+id;
}
</script>
</body>
</html>