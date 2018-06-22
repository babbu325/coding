<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <jsp:useBean id="u" scope='page' class="finallab.javalab10b" />
    
    
    <jsp:setProperty name="u" property="*"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="javalb10b.jsp" method="post">
<input type="text" name="miles">
<input type="submit" value="submit">

kilometer:<jsp:getProperty property="miles" name="u"/>
</form>

</body>
</html>