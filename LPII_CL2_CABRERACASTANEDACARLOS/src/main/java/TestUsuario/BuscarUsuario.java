package TestUsuario;

import DaoImp.UsuarioImp;
import model.TblUsuariocl2;

public class BuscarUsuario {

	public static void main(String[] args) {
		
		
		TblUsuariocl2 tblUsu = new TblUsuariocl2();
		UsuarioImp usuImp = new UsuarioImp();
		
		tblUsu.setIdusuariocl2(1);
		TblUsuariocl2 usuariocl2=usuImp.BuscarUsuario(tblUsu);
		
		System.out.print("Usuario: "+usuariocl2.getUsuariocl2()+"\n"+"\n"+
				         "Password: "+usuariocl2.getPasswordcl2()+"\n"+"\n");

	}

}
