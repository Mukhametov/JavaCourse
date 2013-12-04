<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

    <%= new ru.jcourse.jdbc.factory.Dao.PostDaoImpl().getRecordList() %>

    <h2>
        <form name="test" method="get" action="hello">
            <p>
                <b>????????? ?????????</b><br>
                <input type="text" size="40" name="inp">
            </p>
            <p>
                <input type="submit" value="?????????">
            </p>
        </form>
    </h2>
</body>

</html>
