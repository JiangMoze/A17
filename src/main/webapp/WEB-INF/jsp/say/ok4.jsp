<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach items="${map}" var="m">
        ${m.key}
        ${m.value.username}

    </c:forEach>

    ${sessionScope.myname}
    ${sessionScope.pwd}
</body>
</html>
