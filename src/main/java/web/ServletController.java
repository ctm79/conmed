/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import data.PacienteDao;
import domain.Paciente;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author tron
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarPaciente(request, response);
                    break;
                case "eliminar":
                    this.eliminarPaciente(request, response);
                    break;
                default:
                    this.actionDefault(request, response);
            }
        } else {
            this.actionDefault(request, response);
        }
    }

    private void actionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Paciente> pacientes = new PacienteDao().Listar();
        System.out.println("pacientes = " + pacientes);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("pacientes", pacientes);
        sesion.setAttribute("totalPacientes", pacientes.size());
        //request.getRequestDispatcher("pacientes.jsp").forward(request, response);
        response.sendRedirect("pacientes.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarPaciente(request, response);
                    break;
                    
                case "modificar":
                    this.modificarPaciente(request, response);
                    break;
                
                default:
                    this.actionDefault(request, response);
            }
        } else {
            this.actionDefault(request, response);
        }
    }

    private void insertarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // recuperamos los valores del form agregar paciente
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        // creamos el paciente(modelo)
        Paciente paciente = new Paciente(nombre, apellidos);
        
        // insertamos en la bd
        int registros = new PacienteDao().Insertar(paciente);
        
        //Redirigimos hacia accion por default
        this.actionDefault(request, response);
    }
    
    private void editarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
        
        Paciente paciente = new PacienteDao().Buscar(new Paciente(idPaciente));
        request.setAttribute("paciente", paciente);
        String jspEditar = "/WEB-INF/pages/paciente/editarPaciente.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);  
    }
    
    private void modificarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // recuperamos los valores del form agregar paciente
        int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        // creamos el paciente(modelo)
        Paciente paciente = new Paciente(idPaciente, nombre, apellidos);
        
        // insertamos en la bd
        int registros = new PacienteDao().Modificar(paciente);
        
        //Redirigimos hacia accion por default
        this.actionDefault(request, response);
    }
    
    private void eliminarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // recuperamos los valores del form agregar paciente
        int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
        
        
        // creamos el paciente(modelo)
        Paciente paciente = new Paciente(idPaciente);
        
        // insertamos en la bd
        int registros = new PacienteDao().Eliminar(paciente);
        
        //Redirigimos hacia accion por default
        this.actionDefault(request, response);
    }

}
