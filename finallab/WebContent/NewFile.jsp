<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%

Integer hitcount=(Integer)application.getAttribute("hitcounter");
if(hitcount ==null || hitcount ==0)
{
	out.println("welcome");
hitcount=1;
}
else {
	
	out.println("welcomr back");
	hitcount++;
}

application.setAttribute("hitcounter", hitcount);

%>
<centre><p> page visited times:
<%=hitcount %>
</p>>
</centre>
</body>
</html>