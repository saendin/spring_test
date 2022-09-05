<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp 단건조회</title>
<style>
	form {
		box-sizing: border-box;
		margin : 0 auto;
	}
	input {
		width: 200px;
	}
	.title {
		width: 150px;
	}
</style>
</head>
<body>
	<%--<c:if test= "${empty employeeId}">
		<form action="insertInfo" method="post">
	</c:if> --%>
	<form action="updateInfo" method="post">
		<div>
			<label>
				<span class="title">employeeId: </span>
				<input type="text" name="employeeId" value="${empInfo.employeeId}">
			</label>
		</div>
		<div>
			<label><span class="title">firstName: </span><input type="text" name="firstName"
				value="${empInfo.firstName}"></label>
		</div>
		<div>
			<label>lastName: <input type="text" name="lastName"
				value="${empInfo.lastName}"></label>
		</div>
		<div>
			<label>email: <input type="email" name="email"
				value="${empInfo.email}"></label>
		</div>
		<div>
			<label>hireDate: <input type="text" name="hireDate"
				value="${empInfo.hireDate}"></label>
		</div>
		<div>
			<label>jobId: <input type="text" name="jobId"
				value="${empInfo.jobId}"></label>
		</div>
		<div>
			<label>salary: <input type="text" name="salary"
				value="${empInfo.salary}"></label>
		</div>
		<div>
			<label>commissionPct: <input type="number" name="commissionPct"
				value="${empInfo.commissionPct}"></label>
		</div>
		<div>
			<label>managerId: <input type="text" name="managerId"
				value="${empInfo.managerId}"></label>
		</div>
		<div>
			<label>departmentId: <input type="text" name="departmentId"
				value="${empInfo.departmentId}"></label>
		</div>
		<div>
			<c:if test= "${empty empInfo}">
				<button type="submit">등록</button>
			</c:if>
			<c:if test= "${!empty empInfo}">
				<button type="submit">수정</button>
			</c:if>
			<button type="button">목록</button>	
				
		</div>
	</form>
	<script>
		
	</script>
</body>
</html>