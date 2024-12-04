<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.servertime.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Title</title></head>
<body>
<%
    List<User> listUser = new ArrayList<>();
    listUser.add(new User(1, "He", "hehe@gmail.com", "Ha noi", "https://st.quantrimang.com/photos/image/2020/06/19/Hinh-Nen-Meo-Ngao-38.jpg"));
    listUser.add(new User(2, "He", "hehe@gmail.com", "Ha noi", "https://st.quantrimang.com/photos/image/2020/06/19/Hinh-Nen-Meo-Ngao-38.jpg"));
    listUser.add(new User(3, "He", "hehe@gmail.com", "Ha noi", "https://st.quantrimang.com/photos/image/2020/06/19/Hinh-Nen-Meo-Ngao-38.jpg"));
    listUser.add(new User(4, "He", "hêh@gmail.com", "Hanoi", "https://st.quantrimang.com/photos/image/2020/06/19/Hinh-Nen-Meo-Ngao-38.jpg"));
    request.setAttribute("listUser", listUser);
%>
<table  border="1px">
    <tr>
        <td>Ma</td>
        <td>Ten</td>
        <td>Email</td>
        <td>Dia chi</td>
        <td>Anh</td>
    </tr>
    <c:forEach var="user" items="${listUser}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.address}</td>
            <td><img style="width: 100px; height: 100px" src="${user.urlImage}" alt="Image error"></td>
        </tr>
    </c:forEach>
</>
</body>
</html>
