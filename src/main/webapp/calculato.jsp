<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="get" action="Calculate">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>Số thứ 1: </td>
                <td><input name="soThuNhat" type="number"/></td>
            </tr>
            <tr>
                <td> phép tính: </td>
                <td>
                    <select name="toanTu">
                        <option value="+">+</option>
                        <option value="-">-</option>
                        <option value="*">*</option>
                        <option value="/">/</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Số thứ 2: </td>
                <td><input name="soThuHai" type="number"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Tính"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>