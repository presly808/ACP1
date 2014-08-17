<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>

    id : ${product.id}<br/>
    name : ${product.name}<br/> <%--(Product)request.getAttribute("product")).getName() --%>
    price : ${product.price}<br/>
    <br/>

    Test scriplet for
    <% for(int i = 0; i < 10; i++) {%>
        <%= "iter " + i%>
    <%}%>


</body>
</html>
