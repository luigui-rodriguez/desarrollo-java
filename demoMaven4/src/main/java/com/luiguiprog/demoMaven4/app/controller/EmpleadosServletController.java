package com.luiguiprog.demoMaven4.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luiguiprog.demoMaven4.app.facade.imp.Empleadoimp;
import com.luiguiprog.demoMaven4.app.model.Empleado;


/**
 * Servlet implementation class EmpleadosServletController
 */
public class EmpleadosServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Empleado> listEmpleado = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadosServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doProccess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doProccess(request,response);
	}

	protected void doProccess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 Empleadoimp empleaimp= new Empleadoimp();
		        
		        if (request.getParameter("action")!=null) {
		        String action=request.getParameter("action");
		        
		            if (action.equalsIgnoreCase("edit")) {
		                System.out.println("Editar");
		                long id =Long.parseLong(request.getParameter("id"));
		                Empleado empleado =empleaimp.listEmpleados(id);
		                request.setAttribute("empleado", empleado);
		                request.getRequestDispatcher("Empleados/editar.jsp").forward(request, response);
		                
		            }
		            else if (action.equalsIgnoreCase("actualizar")) {
		                try{
		                Empleado empleado = new Empleado();
		                empleado.setId(Long.parseLong(request.getParameter("id")));
		                empleado.setTipo_documento(request.getParameter("tipo_documento"));
		                empleado.setNumero_documento(Long.parseLong(request.getParameter("numero_documento")));
		                empleado.setNombres(request.getParameter("nombres"));
		                empleado.setApellidos(request.getParameter("apellidos"));
		                empleado.setDepartamento_id(Long.parseLong(request.getParameter("departamento_id")));
		                empleado.setDireccion(request.getParameter("direccion"));
		                empleado.setCorreo_electronico(request.getParameter("correo_electronico"));
		                empleado.setTelefono(Long.parseLong(request.getParameter("telefono")));
		                empleaimp.actualizarEmpleado(empleado);
		                System.out.println("list" + listEmpleado);	
		                }catch(Exception e){
		                	e.printStackTrace();
		                }
		        this.listEmpleado=empleaimp.findAll();
		        System.out.println("list"+ this.listEmpleado);
		        request.setAttribute("listEmp", this.listEmpleado);
		        request.getRequestDispatcher("Empleados/listEmpleados.jsp").forward(request, response);
		            }
		            else if (action.equalsIgnoreCase("add")) {
		                request.getRequestDispatcher("Empleados/agregar.jsp").forward(request, response);
		                
		            }
		            else if (action.equalsIgnoreCase("agregar")) {
		                 try{
		                Empleado empleado = new Empleado();
		                empleado.setTipo_documento(request.getParameter("tipo_documento"));
		                empleado.setNumero_documento(Long.parseLong(request.getParameter("numero_documento")));
		                empleado.setNombres(request.getParameter("nombres"));
		                empleado.setApellidos(request.getParameter("apellidos"));
		                empleado.setDepartamento_id(Long.parseLong(request.getParameter("departamento_id")));
		                empleado.setDireccion(request.getParameter("direccion"));
		                empleado.setCorreo_electronico(request.getParameter("correo_electronico"));
		                empleado.setTelefono(Long.parseLong(request.getParameter("telefono")));
		                empleaimp.add(empleado);

		                }catch(Exception e){
		                	
		                	e.printStackTrace();
		                }
		   
		        this.listEmpleado=empleaimp.findAll();
		        request.setAttribute("listEmp", this.listEmpleado);
		        request.getRequestDispatcher("Empleados/listEmpleados.jsp").forward(request, response);
		            }
		            else if (action.equalsIgnoreCase("eliminar")) {
		            	Long id = Long.parseLong(request.getParameter("id"));
		            	empleaimp.eliminar(id);
		               this.listEmpleado=empleaimp.findAll();
		        request.setAttribute("listEmp", this.listEmpleado);
		        request.getRequestDispatcher("Empleados/listEmpleados.jsp").forward(request, response);
		            }
		            else if (action.equalsIgnoreCase("regresar")) {
		        this.listEmpleado=empleaimp.findAll();
		        request.setAttribute("listEmp", this.listEmpleado);
		        request.getRequestDispatcher("Empleados/listEmpleados.jsp").forward(request, response);

		            }

		    }
		        
		        this.listEmpleado=empleaimp.findAll();
		        request.setAttribute("listEmp", this.listEmpleado);
		        request.getRequestDispatcher("Empleados/listEmpleados.jsp").forward(request, response);
		       
		}
		}
