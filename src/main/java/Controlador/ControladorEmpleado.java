package Controlador;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudEmpleadoImp;
import modelo.TblEmpleado;

/**
 * Servlet implementation class ControladorEmpleado
 */
public class ControladorEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEmpleado() {
        //super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//AGREGAMOS DATOS NUEVOS PARA EL EMPLEADO
		TblEmpleado tblemp = new TblEmpleado();
		CrudEmpleadoImp crud = new CrudEmpleadoImp();
				// -------------- REGISTRAR -------------- //
		tblemp.setNombre("Dulce Laura");
		tblemp.setApellido("Garc�a Reyna");
		tblemp.setSexo("F");
		tblemp.setEmail("laura.garcia@gmail.com");
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		tblemp.setFechanac(fechasql);
		tblemp.setTel("999312124");
		tblemp.setDni("54262723");
		crud.RegistrarEmpleado(tblemp);
	}

}
