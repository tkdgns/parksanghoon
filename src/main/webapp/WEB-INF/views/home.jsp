<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ page contentType="text/htmL; charset=UTF-8" %> 
<html>
<head>
	<title>스프링</title>
</head>
<body>
<h1>
	Hello world!  박상훈 입니다.
</h1>
<p> <c:out value="${serverTime}"></c:out>
<P>  현재  서버의 시간은 ${serverTime} 입니다.. </P>
<script>alert('메롱 ${servertime}');</script>
</body>
</html>