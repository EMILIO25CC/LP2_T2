package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class UsuarioImp implements IUsuario {

	public EntityManager em;
	public UsuarioImp(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_CABRERACASTANEDACARLOS");
		em = emf.createEntityManager();
	}
	
	public void RegistrarUsuario(TblUsuariocl2 tblUsuariocl2) {
		try {
			//Iniciamos transaccion
			em.getTransaction().begin();
			
			em.persist(tblUsuariocl2);
			//Confirmamos la Transaccion
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		
	}//===========================================================================================

	public void ActualizarUsuario(TblUsuariocl2 tblUsuariocl2) {
		
		try {
			em.getTransaction().begin();
			
			em.merge(tblUsuariocl2);
			
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		
	}//===========================================================================================

	public void EliminarUsuario(TblUsuariocl2 tblUsuariocl2) {
		
		try {
			 em.getTransaction().begin();
			 TblUsuariocl2 eliminarUsu = em.find(TblUsuariocl2.class,tblUsuariocl2.getIdusuariocl2());
			 if(eliminarUsu !=null){
				 em.remove(eliminarUsu);
				 
				 System.out.print("Usuario Eliminado");
			 }else{
				 System.out.print("El Usuario ya fue eliminado de la BD o no se encontro el ID ");
			 }
			 em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			//em.getTransaction().isActive() em.getTransaction().rollback();
			
		}finally {
			em.close();
		}
		
		
	}//===========================================================================================

	public List<TblUsuariocl2> ListarUsuario() {
		
		List<TblUsuariocl2> listado = null;
		
		try {
			//Iniciar la Transacci n
			em.getTransaction().begin();
			//Aplicamos consulta JPA (JAVA PERSISTENCE QUERY LANGUAGE )
			listado=em.createQuery("select u from TblUsuariocl2 u",TblUsuariocl2.class).getResultList();
		
			//Confirmamos 
			em.getTransaction().commit();
			
		
		}catch(RuntimeException ex){
			ex.getMessage();
		}
		finally {
			em.close();
		}
		
		return listado;
	}//===========================================================================================

	
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblUsuariocl2) {
		
		
		TblUsuariocl2  tblUsu =null;
		try{
				//Iniciar Transacci n
				em.getTransaction().begin();
				//Recuperamos el ID del Cliente
				tblUsu=em.find(TblUsuariocl2.class,tblUsuariocl2.getIdusuariocl2());
				if(tblUsu !=null){
					System.out.print("     \t  \n ==== Usuario encontrado ==== \n\n");
				}else{
					System.out.print("\n Usuario NO encontrado :( ");
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
				return tblUsu;
		
		
	}//===========================================================================================

}//FIN
