<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
  <form:select path="country">
  <form:options items="${student.countryOptions }"/>
  
  
  
  
  
  </form:select>		
	<br><br>	
Favourite Language: 
 JAVA <form:radiobutton path="favLang" value="JAVA"/>
 Ruby <form:radiobutton path="favLang" value="Ruby"/>
 Python <form:radiobutton path="favLang" value="Python"/>
 C# <form:radiobutton path="favLang" value="C#"/>


		<br><br>
	
	Operating Systems:
	<form:checkbox path="operatingSystems" value="linux"/> Linux
		<form:checkbox path="operatingSystems" value="Mac os"/> Mac Os
		<form:checkbox path="operatingSystems" value="Ms Window"/> Ms Windows
	
	
	<br><br>
		<input type="submit" value="Submit" />
	
	
	</form:form>


</body>

</html>