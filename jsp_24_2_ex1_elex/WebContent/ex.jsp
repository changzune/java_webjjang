<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="varName" value="varValue"/>
	varName :<c:out value ="${varName}"/> <br />
	
	<c:remove var="varName"/>
	varName :<c:out value ="${varName}"/>


	<c:forEach var="fe" begin="0" end="100" step="5">
	${fe}<br />
	</c:forEach>
	


</body>
</html>