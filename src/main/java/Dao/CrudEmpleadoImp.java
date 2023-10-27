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
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		TblEmpleado elim = emanager.merge(tblemp);
		emanager.remove(elim);
		emanager.getTransaction().commit();
		emanager.close();
	}

	@Override
	public List<TblEmpleado> ListadoEmpleado() {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		List<TblEmpleado> listado = emanager.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
		emanager.getTransaction().commit();
		emanager.close();
		return listado;
	}

	@Override
	public TblEmpleado BuscarEmpleadoCodigo(TblEmpleado tblemp) {
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=conex.createEntityManager();
		emanager.getTransaction().begin();
		TblEmpleado buscar = emanager.find(TblEmpleado.class, tblemp.getIdempleado());
		emanager.getTransaction().commit();
		emanager.clear();
		return buscar;
	}

}
