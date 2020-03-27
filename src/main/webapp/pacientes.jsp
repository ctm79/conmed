<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pacientes</title>
    </head>
    <body>
        <h1>Listado de pacientes</h1>
        <ul>    
            <c:forEach var="paciente" items="${pacientes}">
                <li>${paciente.id_paciente}  ${paciente.nombre} ${paciente.apellidos}
            </c:forEach>
        </ul>
    </body>
</html>
