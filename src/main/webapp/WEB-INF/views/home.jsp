<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ page contentType="text/htmL; charset=UTF-8" %> 
<html>
<head>
	<title>뀨뀨</title>
</head>
<body>
<h1>
	Hello world!  박상훈 입니다.
</h1>
<p> <c:out value="${TomcatserverTime}"></c:out>
<P>  현재  서버의 시간은 ${TomcatserverTime} 입니다.. </P>
</body>
</html>

