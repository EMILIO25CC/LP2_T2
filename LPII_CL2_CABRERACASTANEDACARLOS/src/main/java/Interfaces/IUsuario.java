package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {

	void RegistrarUsuario(TblUsuariocl2 tblUsuariocl2);
	void ActualizarUsuario(TblUsuariocl2 tblUsuariocl2);
	void EliminarUsuario(TblUsuariocl2 tblUsuariocl2);
	
	List<TblUsuariocl2>ListarUsuario();
	
	TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblUsuariocl2);
	
}
