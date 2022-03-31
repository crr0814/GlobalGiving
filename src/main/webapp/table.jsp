<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My table page will go here!!</title>
	</head>

	<body>
		<table border="1" cellpadding="5" cellspacing="5">
			<tr>
				<th>Title</th>
				<th>Summary</th>
				<th>Status</th>
				<th>Contact Name</th>
				<th>Contact Title</th>
				<th>Contact Address</th>
				<th>City</th>
				<th>State</th>
				<th>Postal Code</th>
				<th>URL</th>
			</tr>
		
			<c:forEach items="${projectList}" var="project" >
				<tr>
					<td>${project.title}</td>
					<td>${project.summary}</td>	
					<td>${project.status}</td>	
					<td>${project.contactName}</td>	
					<td>${project.contactTitle}</td>	
					<td>${project.contactAddress}</td>	
					<td>${project.contactCity}</td>	
					<td>${project.contactState}</td>	
					<td>${project.contactPostal}</td>	
					<td>${project.contactUrl}</td>		
		
				</tr>
		
			</c:forEach>
		
		</table>		


	</body>
</html>