<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Add Book</h2>
    <form action="addBook.do" method="post">
        Book Name: <input type="text" name="bookName"/><br/>
        Book ID: <input type="text" name="bookId"/><br/>
        <input type="submit" value="Add Book"/>
    </form>
</body>
</html>


