package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;
import model.TblUsuariocl2;

public class ProveedorImp implements IProveedor{

	public EntityManager em;
	public ProveedorImp(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CABRERACASTANEDACARLOS");
		em = emf.createEntityManager();
	}
	public void RegistrarProveedor(TblProveedorcl2 proveedorcl2) {
		try {
			//Iniciamos transaccion
			em.getTransaction().begin();
			
			em.persist(proveedorcl2);
			//Confirmamos la Transaccion
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		
		
	}

	public void ActualizarProveedor(TblProveedorcl2 proveedorcl2) {
		
		try {
			em.getTransaction().begin();
			
			em.merge(proveedorcl2);
			
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

	public void EliminarProveedor(TblProveedorcl2 proveedorcl2) {
		
		try {
			 em.getTransaction().begin();
			 TblProveedorcl2 eliminarPro = em.find(TblProveedorcl2.class,proveedorcl2.getIdprooveedorcl2());
			 if(eliminarPro !=null){
				 em.remove(eliminarPro);
				 
				 System.out.print("\n \n \t Proveedor Eliminado");
			 }else{
				 System.out.print("\n \n \t El Proveedor ya fue eliminado de la BD o no se encontro el ID ");
			 }
			 em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			//em.getTransaction().isActive() em.getTransaction().rollback();
			
		}finally {
			em.close();
		}
		
	}

	public List<TblProveedorcl2> ListarProveedor() {
		
		List<TblProveedorcl2> listado = null;
		
		try {
			//Iniciar la Transacci n
			em.getTransaction().begin();
			//Aplicamos consulta JPA (JAVA PERSISTENCE QUERY LANGUAGE )
			listado=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		
			//Confirmamos 
			em.getTransaction().commit();
			
		
		}catch(RuntimeException ex){
			ex.getMessage();
		}
		finally {
			em.close();
		}
		
		return listado;
	}

	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 proveedorcl2) {
		
		
		TblProveedorcl2  tblPro =null;
		try{
				//Iniciar Transacci n
				em.getTransaction().begin();
				//Recuperamos el ID del Cliente
				tblPro=em.find(TblProveedorcl2.class,proveedorcl2.getIdprooveedorcl2());
				if(tblPro !=null){
					System.out.print("     \t  \n ==== Proveedor encontrado ==== \n\n");
				}else{
					System.out.print("\n Proveedor NO encontrado :( ");
				}
				//Confirmamos Transacci n
				em.getTransaction().commit();
				
				//retornamos el cliente
				}catch(RuntimeException e){
					e.getMessage();
				}finally {
					//cerramos 
					em.close();
				}
				return tblPro;
		
	}

}
