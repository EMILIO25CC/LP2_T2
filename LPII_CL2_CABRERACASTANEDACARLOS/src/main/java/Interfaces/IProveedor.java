package Interfaces;

import java.util.List;
import model.TblProveedorcl2;


public interface IProveedor {

	void RegistrarProveedor(TblProveedorcl2 proveedorcl2);
	void ActualizarProveedor(TblProveedorcl2 proveedorcl2);
	void EliminarProveedor(TblProveedorcl2 proveedorcl2);
	
	List<TblProveedorcl2>ListarProveedor();
	
	TblProveedorcl2 BuscarProveedor(TblProveedorcl2 proveedorcl2);
}
