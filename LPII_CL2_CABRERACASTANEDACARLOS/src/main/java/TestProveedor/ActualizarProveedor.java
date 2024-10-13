package TestProveedor;

import DaoImp.ProveedorImp;
import model.TblProveedorcl2;

public class ActualizarProveedor {

	public static void main(String[] args) {
		TblProveedorcl2 tbPro = new TblProveedorcl2();
		ProveedorImp proImp= new ProveedorImp();

		
		//Asignamos valores que sean registrados en al BD
		tbPro.setIdprooveedorcl2(2);
		tbPro.setNomproveecl2("FramaChile");
		tbPro.setRucproveecl2("R25");
		tbPro.setRsocialproveecl2("Nuevo");
		tbPro.setEmailproveecl2("jorge@gmail.com");
		tbPro.setFeingproveecl2(null);
		//invocamos los m todos registrar
		proImp.ActualizarProveedor(tbPro);
		
		System.out.print("\n \n \t Datos Actualizado en la BD");
		
	}

}
