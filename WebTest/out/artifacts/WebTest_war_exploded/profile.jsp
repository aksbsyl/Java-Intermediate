<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/5/2020
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>

<form action ="./Mail" method="post">
Email: <input type="email" name="email" onclick="this.value=''"/><br/>
Subject: <input type="text" name="subject" onclick="this.value=''"/><br/>
Text: <textarea rows="9" cols=60" name="message"/> </textarea>
<input type="submit" value="register">
</form>

</body>
</html>
