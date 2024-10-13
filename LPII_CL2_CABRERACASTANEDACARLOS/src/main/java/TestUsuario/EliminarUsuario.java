package TestUsuario;

import DaoImp.UsuarioImp;
import model.TblUsuariocl2;

public class EliminarUsuario {

	public static void main(String[] args) {
		TblUsuariocl2 tbUsu= new TblUsuariocl2();
		UsuarioImp usuImp= new UsuarioImp();
		
		tbUsu.setIdusuariocl2(2);
		
		usuImp.EliminarUsuario(tbUsu);
		
	}
	
	
}
