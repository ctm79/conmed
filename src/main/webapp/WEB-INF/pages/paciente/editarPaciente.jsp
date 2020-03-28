<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet"  type="text/css"  href="/WEB-INF/styles/style.css">
        <script src="https://kit.fontawesome.com/c9690a898e.js" crossorigin="anonymous"></script>
        <title>Edición de Pacientes</title>
    </head>
    <body>
        <!-- Header -->
        <jsp:include page="/WEB-INF/pages/common/header.jsp"/>
        
        <form action ="${pageContext.request.contextPath}/ServletController?accion=modificar&idPaciente=${paciente.id_paciente}"
              method="POST" class="was-validated">
            <!-- Navigation -->
            <jsp:include page="/WEB-INF/pages/common/navigationEdition.jsp"/>        
            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <h4>Editar Paciente<h4>
                            </div>
                            <div class"card-body">
                                <div class="form-group">
                                    <label for="id">id</label>
                                    <input type="text" class="form-control" name="id" required value="${paciente.id_paciente}">

                                </div>
                                <div class="form-group">
                                    <label for="nombre">nombre</label>
                                    <input type="text" class="form-control" name="nombre" required value="${paciente.nombre}">

                                </div>
                                <div class="form-group">
                                    <label for="apellidos">apellidos</label>
                                    <input type="text" class="form-control" name="apellidos" required value="${paciente.apellidos}">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>
        
        
        <!-- Footer -->
        <jsp:include page="/WEB-INF/pages/common/footer.jsp"/>
        
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
</html>
