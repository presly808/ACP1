<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
    id : ${product}<br/>
    name : ${product.name}<br/> <%--(Product)request.getAttribute("product")).getName() --%>
    price : ${product.price}
</body>
</html>
