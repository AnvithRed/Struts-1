<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <h2>User Summary</h2>
    <p>User Name: ${userForm.userName}</p>
    <p>User ID: ${userForm.userId}</p>
    <h3>Books Added</h3>
    <ul>
        <c:forEach var="book" items="${sessionScope.bookList}">
            <li>${book}</li>
        </c:forEach>
    </ul>
</body>
</html>
