<div class="modal fade" id="agregarPacienteModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Paciente</h5>
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
             <form action="${pageContext.request.contextPath}/ServletController?accion=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">nombre</label>
                        <input type="text" class="form-control" name="nombre" required>
                       
                    </div>
                    <div class="form-group">
                        <label for="apellidos">apellidos</label>
                        <input type="text" class="form-control" name="apellidos" required>
                        
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">guardar</button>
                </div>
            </form>
            
        </div>
    </div>
</div>