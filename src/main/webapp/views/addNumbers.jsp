<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Results</h1>
    <p>Sum: ${sum}</p>
    <c:if test="${not empty Multiplication}">
        <p>Multiplication: ${Multiplication}</p>
    </c:if>
</body>
</html>