package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iempleadoable;
import modelo.TblEmpleado;

public class CrudEmpleadoImp implements Iempleadoable{

	@Override
	public void RegistrarEmpleado(TblEmpleado tblemp) {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(tblemp);
		emanager.getTransaction().commit();
		emanager.close();
	}

	@Override
	public void ActualizarEmpleado(TblEmpleado tblemp) {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.merge(tblemp);
		emanager.getTransaction().commit();
		emanager.close();
	}

	@Override
	public void EliminarEmpleado(TblEmpleado tblemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblEmpleado> ListadoEmpleado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblEmpleado BuscarEmpleadoCodigo(TblEmpleado tblemp) {
		// TODO Auto-generated method stub
		return null;
	}

}
