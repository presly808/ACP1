<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="ua.artcode.entity.Product" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 16.08.2014
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    id : <%= ((Product)request.getAttribute("product")).getId()%><br/>
    name : <h>${requestScope.product1.name}</h>"<br/>
    price : <h>${requestScope.product1.price}</h>"

</body>
</html>
