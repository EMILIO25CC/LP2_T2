package TestUsuario;

import DaoImp.UsuarioImp;
import model.TblUsuariocl2;

public class RegistraUsuario {

	public static void main(String[] args) {
		
		//Test Registrar Usuario
		 
		//Instanciamos  las respectivas clase
		TblUsuariocl2 tbUsu= new TblUsuariocl2();
			UsuarioImp usuImp= new UsuarioImp();
			
			//Asignamos valores que sean registrados en al BD
			tbUsu.setUsuariocl2("Daniel");
			tbUsu.setPasswordcl2("3030");
			
			//invocamos los m todos registrar
			usuImp.RegistrarUsuario(tbUsu);
			
			//emitimos mensaje por consola
			 System.out.print("\n \n \t Datos Registrados en la BD"); 
		
	}

}
