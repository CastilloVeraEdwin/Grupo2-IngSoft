package Servlets;

import Entity.Empleado;
import Entity.ValidarEmpleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidarLogin extends HttpServlet {
    ValidarEmpleado val = new ValidarEmpleado();
    Empleado em = new Empleado();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            String Usuario=request.getParameter("Usuario");
            String Contraseña=request.getParameter("Contraseña");
            em=val.validar(Usuario, Contraseña);
            if(em.getUsuario()!=null){
                request.setAttribute("Usuario", em);
                request.getRequestDispatcher("Controlador?accion=Principal").forward(request, response);
            }else{
                request.getRequestDispatcher("index.xhtml").forward(request, response);
        }
        }else{
            request.getRequestDispatcher("index.xhtml").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
