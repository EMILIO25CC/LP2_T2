package TestProveedor;

import java.util.List;

import DaoImp.ProveedorImp;
import model.TblProveedorcl2;


public class ListarProveedo {

	public static void main(String[] args) {
		TblProveedorcl2 tbPro = new TblProveedorcl2();
		ProveedorImp proImp= new ProveedorImp();
		
		 List<TblProveedorcl2> listado = proImp.ListarProveedor();
		 
		 for (TblProveedorcl2 lis : listado) {
	            // Imprimimos por pantalla
	            System.out.print("\n Nombre Provedor : " + lis.getNomproveecl2() +
	            				 "\n Ruc: " + lis.getRucproveecl2() + "\n\n"+
	            				 "\n RSonSocial: " + lis.getRsocialproveecl2() + "\n\n"+
	            				 "\n Email: " + lis.getEmailproveecl2()+ "\n\n"+
	            				 "\n FechaIngreso: " + lis.getFeingproveecl2() + "\n\n");
	        }
		

	}

}
