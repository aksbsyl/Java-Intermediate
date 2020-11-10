
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>fmt:timeZone Tag</title>
</head>

<body>
<c:set var="str" value="<%=new java.util.Date()%>" />
<table border="2" width="100%">
    <tr>
        <td width="100%" colspan="2" bgcolor="#FF7F50">
            <p align="center">
                <b>
                    <font color="#000000" size="6">Formatting:
                        <fmt:formatDate value="${str}" type="both"
                                        timeStyle="long" dateStyle="long" />
                    </font>
                </b>
            </p>
        </td>
    </tr>

    <c:forEach var="zone"
               items="<%=java.util.TimeZone.getAvailableIDs()%>">
        <tr>
            <td width="50%"  bgcolor="#C0C0C0">
                <c:out value="${zone}" />
            </td>
            <td width="50%" bgcolor="#FFEBCD">
                <fmt:timeZone value="${zone}">
                    <fmt:formatDate value="${str}" timeZone="${zn}"
                                    type="both"/>
                </fmt:timeZone>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
