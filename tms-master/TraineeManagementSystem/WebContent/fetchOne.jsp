<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Details of Trainee</h1>
<table border="5px">

		<tr>
			<td>${trainee.traineeId}</td>
			<td>${trainee.traineeName}</td>
			<td>${trainee.traineeDomain}</td>
			<td>${trainee.traineeLocation}</td>
			
		</tr>
		
	</table>
	<a href="Menu.jsp">Back to Main Menu</a>
</body>
</html>