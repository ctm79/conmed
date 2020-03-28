<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section id="listaPacientes" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-10">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Pacientes</h4>
                    </div>


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
                            <c:forEach var="paciente" items="${pacientes}" varStatus="status">
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
            </div>            
            <!-- Seccion lateral derecha --> 
            <div class="col-md-2">
                <div class="card bg-warning text-center">
                    <div class="card-body">
                        <h4>total pacientes</h4>
                        <h4 class="display-5">
                            <i class="fas fa-users"></i> ${totalPacientes}
                        </h4>
                    </div>

                </div>
            </div>

        </div>

    </div>
</section>
<!-- Agregar paciente modal -->
<jsp:include page="/WEB-INF/pages/paciente/agregarPaciente.jsp"/>