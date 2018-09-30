<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center" width="50%">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.userId }</td>
				<td>${user.userName }</td>
				<td>
				<c:set var="ages" scope="session" value="${user.userAge }"/>
				<c:if test="${ages > 19}"> 
				 <c:out value="${ages}"/>
				</c:if>
				<c:if test="${user.userAge <= 19}"> 
				<c:out value="${user.userAge } + SSS"/>
				</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>