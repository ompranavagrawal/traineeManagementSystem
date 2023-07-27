<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
	<h1>Enter Trainee Details</h1>
	<f:form action="add.obj" modelAttribute="trainee">
	
	Enter Trainee Id:
	<f:input path="traineeId"/>
	
	<br>Enter Trainee Name:
	<f:input path="traineeName"/>
	<f:errors cssStyle="color:red" path="traineeName"/><br/>
	
	<br>Enter Trainee location:
	<f:radiobutton path="traineeLocation" value="chennai"/>Chennai
	<f:errors cssStyle="color:red" path="traineeLocation"/>
	<f:radiobutton path="traineeLocation" value="bangalore"/>Banglore
	<f:errors cssStyle="color:red" path="traineeLocation"/>
	<f:radiobutton path="traineeLocation" value="pune"/>Pune
	<f:errors cssStyle="color:red" path="traineeLocation"/>
	<f:radiobutton path="traineeLocation" value="mumbai"/>Mumbai
	<f:errors cssStyle="color:red" path="traineeLocation"/><br/>
	
	
	<br>Enter Trainee Domain:
	<f:select path="traineeDomain">
	<f:option value="BI">BI</f:option>
	<f:option value="java">JAVA</f:option>
	<f:option value="java Cloud">JAVA CLOUD</f:option>
	<f:option value="python">PYTHON</f:option>
	
	</f:select>
	
	
	<input type="Submit" value="Add Trainee"/> 
	
	</f:form>
	
</body>
</html>