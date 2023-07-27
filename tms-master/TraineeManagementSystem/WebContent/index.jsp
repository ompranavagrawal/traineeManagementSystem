<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateForm() {
	var unm=document.forms["loginForm"]["userName"].value;
	var pwd=document.forms["loginForm"]["password"].value;
	
	if(unm=="Pranav" && pwd=="Pranav"){
		
		return true;
	}
	else{
		
		alert("ENTER VALID NAME USERNAME AND PASSWORD!!!!!!")
		return false;
	}
} 

</script>

</head>
<body>

	<h1>WELCOME</h1>
	<Form name="loginForm" onsubmit="return validateForm()" action="Menu.jsp" method="post" >
	<table border="10px">
	<tr><td>UserName</td><td><input type="text" id="userName"></td></tr>
	<tr><td>Password</td><td><input type="password" id="password"></td></tr>
	<tr><td colspan="2"><input type="submit" value="submit"></td></tr>
	</table>
	</Form>
	
</body>
</html>