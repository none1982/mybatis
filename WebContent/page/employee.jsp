<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/index" method="get">
	name:<input type="text" id="name" name="name"/>
	<input type="submit" value="submit"/>
	<input type="hidden" id="method" name="method" value="queryName"/>
</form>
<c:forEach items="${list}" var="item">
	${item.name}
</c:forEach>
</body>
</html>