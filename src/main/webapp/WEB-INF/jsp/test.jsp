<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
	<title>JSP</title>
</head>
<body>
    <h1>JSP</h1>

    <form>
        <input type="text" value="${myModel.message}" name="message"/>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
