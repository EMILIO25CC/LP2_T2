package TestUsuario;

import DaoImp.UsuarioImp;
import model.TblUsuariocl2;

public class ActualizarUsuario {

	public static void main(String[] args) {
		
		//Test Actualizar Usuario
		
		TblUsuariocl2 tbUsu= new TblUsuariocl2();
		UsuarioImp usuImp= new UsuarioImp();
				
		tbUsu.setIdusuariocl2(1);
		
		tbUsu.setUsuariocl2("Maria");
		tbUsu.setPasswordcl2("9999");
		
		usuImp.ActualizarUsuario(tbUsu);		
				
				System.out.print("\n \n \t Datos Actualizado en la BD");
		
	}

}
