package TestUsuario;

import java.util.List;
import DaoImp.UsuarioImp;
import model.TblUsuariocl2;

public class ListarUsuario {

    public static void main(String[] args) {
        
        // TblCliente tblcli = new TblCliente();
        UsuarioImp usuImp = new UsuarioImp();
        
        List<TblUsuariocl2> listado = usuImp.ListarUsuario();
        
        // Aplicamos un bucle
        for (TblUsuariocl2 lis : listado) {
            // Imprimimos por pantalla
            System.out.print("\n Usuario: " + lis.getUsuariocl2() +
                             "\n Password: " + lis.getPasswordcl2() + "\n\n");
        }
    } 
} // Aquí se cierra la clase ListarUsuario