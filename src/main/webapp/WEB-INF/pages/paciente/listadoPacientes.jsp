<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
<ul>    
<c:forEach var="paciente" items="${pacientes}">
    <li>${paciente.id_paciente}  ${paciente.nombre} ${paciente.apellidos}
</c:forEach>
</ul>
-->


<section id="listaPacientes" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-10">
                <h4>Listado de Pacientes</h4>
                <table class="table table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>id</th>
                            <th>nombre</th>
                            <th>apellidos</th>
                            <th>${totalPacientes} pacientes</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="paciente" items="${pacientes}">
                            <tr>
                                <td>${paciente.id_paciente}</td>
                                <td>${paciente.nombre}</td> 
                                <td>${paciente.apellidos}</td>
                                <td><a href="${pageContext.request.contextPath}/ServletController?accion=editar&idPaciente=${paciente.id_paciente}" class="btn btn-success">Editar</a></td>
                            </tr>

                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <!-- Seccion lateral derecha 
            <div class="col-md-3>">
                <div class="card bg-warning">
                    <div claaa="card-body">
                        <h4>Total Pacientes</h4>
                        <h4></h4>
                    </div>
                    
                </div>
            </div>
            -->     
        </div>
    </div>
</section>