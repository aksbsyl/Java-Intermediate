<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/1/2020
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Process</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>

<%--..............process1 for divide.................--%>
<%--<%--%>

<%--    String num1=request.getParameter("n1");--%>
<%--    String num2=request.getParameter("n2");--%>

<%--    int a=Integer.parseInt(num1);--%>
<%--    int b=Integer.parseInt(num2);--%>
<%--    int c=a/b;--%>
<%--    out.print("division of numbers is: "+c);--%>

<%--%>--%>
<%--..............process1 for divide..........end.......--%>

<jsp:useBean id="u" class="Admin.user"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

Record:<br>
<jsp:getProperty property="name" name="u"/><br>
<jsp:getProperty property="password" name="u"/><br>
<jsp:getProperty property="email" name="u" /><br>

</body>
</html>
