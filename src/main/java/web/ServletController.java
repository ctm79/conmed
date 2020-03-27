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
        List<Paciente> pacientes = new PacienteDao().Listar();
        System.out.println("pacientes = " + pacientes);
        request.setAttribute("pacientes", pacientes);
        request.setAttribute("totalPacientes", pacientes.size());
        request.getRequestDispatcher("pacientes.jsp").forward(request,response);
        
    }
}
