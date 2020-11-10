<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 9/15/2020
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  welcome page
<%--  <form action = "./new" method = "post">--%>
<%--    Name:<input tupe=""text, name="name"><br>--%>
<%--    Address:<input tupe=""text, name="address"><br>--%>
<%--    <input type="submit", value="OK">--%>
<%--  </form>--%>

<%--  <%out.print("Hello jsp...");--%>
<%--  <%= new Date() %>--%>
<%--  <%! int a= 50;--%>
<%--  %>--%>
<%--  <% out.print(a); %>--%>


<%--......................process 1 for divide index.jsp..............--%>
<%--  <form action="process.jsp">--%>
<%--    No1:<input type="text" name="n1" /><br/><br/>--%>
<%--    No1:<input type="text" name="n2" /><br/><br/>--%>
<%--    <input type="submit" value="Divide"/>--%>
<%--  </form>--%>
  <%--......................process 1 for divide index.jsp........end......--%>


  <form action="process.jsp" method="post">
    Name:<input type="text" name="name"><br>
    Password:<input type="password" name="password"><br>
    Email:<input type="text" name="email"><br>
    <input type="submit" value="register">
  </form>

  </body>
</html>
