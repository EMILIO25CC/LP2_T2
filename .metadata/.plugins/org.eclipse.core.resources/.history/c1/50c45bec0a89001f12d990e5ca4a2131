package TestProveedor;

import model.TblProveedorcl2;

import DaoImp.ProveedorImp;


public class RegistrarProveedor {

	public static void main(String[] args) {
		
		//Test Registrar Usuario
		 
				//Instanciamos  las respectivas clase
		TblProveedorcl2 tbPro = new TblProveedorcl2();
		ProveedorImp proImp= new ProveedorImp();
					
					//Asignamos valores que sean registrados en al BD
					tbPro.setNomproveecl2("Jorge");
					tbPro.setRucproveecl2("R25");
					tbPro.setRsocialproveecl2("Nuevo");
					tbPro.setEmailproveecl2("jorge@gmail.com");
					tbPro.setFeingproveecl2(null);
					//invocamos los m todos registrar
					proImp.RegistrarProveedor(tbPro);
					
					//emitimos mensaje por consola
					 System.out.print("\n \n \t Datos Registrados en la BD"); 
				
		
	}

}
