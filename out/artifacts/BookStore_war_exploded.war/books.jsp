<%@ page import="ru.test.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Books</title>
  </head>
  <body>
  <ul>
  <c:forEach items="${bookList}" var="book">
    <li>Id: ${book.id}, Name: ${book.name} </li>
  </c:forEach>
  </ul>
<p>${smString}</p>
  </body>
</html>
