<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
[[${user}]]
	<table border="1">
        <tr>
            <td>
            Id
            </td>
            <td>
            <input type="text" value="${user.id}">
            </td>
        </tr>
        <tr>
            <td>
            First name
            </td>
            <td>
            <input type="text" value="${user.firstName}">
            </td>
        </tr>
        <tr>
            <td>
            Last name
            </td>
            <td>
            <input type="text" value="${user.lastName}">
            </td>
        </tr>
        <tr>
            <td>
            Role
            </td>
            <td>
            <input type="text" value="${user.role}">
            </td>
        </tr>
        <tr>
            <td>
            Email
            </td>
            <td>
            <input type="text" value="${user.email}">
            </td>
        </tr>
        <tr>
            <td>
            Password
            </td>
            <td>
            <input type="text" value="${user.password}">
            </td>
        </tr>
	</table>
</body>
</html>