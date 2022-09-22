<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo Header</title>
<link rel="stylesheet" href="./../css/todo.css">
</head>
<body>
	<div id="myDIV" class="header">
	  <h2>My To Do List</h2>
	  <input type="text" id="myInput" placeholder="Title...">
	  <span onclick="newElement()" class="addBtn">Add</span>
	</div>
</body>
</html>