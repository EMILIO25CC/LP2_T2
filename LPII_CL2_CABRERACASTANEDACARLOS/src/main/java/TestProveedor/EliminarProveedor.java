package TestProveedor;

import DaoImp.ProveedorImp;
import DaoImp.UsuarioImp;
import model.TblProveedorcl2;
import model.TblUsuariocl2;

public class EliminarProveedor {

	public static void main(String[] args) {
		TblProveedorcl2 tbPro = new TblProveedorcl2();
		ProveedorImp proImp= new ProveedorImp();

		
		tbPro.setIdprooveedorcl2(2);
		
		proImp.EliminarProveedor(tbPro);
	}

}
