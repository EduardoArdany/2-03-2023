import controladores.nodoController;
import modelos.Lista;
import vistas.frmPrincipal;
import vistas.frmAgregarPacientes;
import vistas.frmListarPacientes;

public class main {

    public static void main(String[] args) {
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmAgregarPacientes vistaNodos = new frmAgregarPacientes(vistaPrincipal,true);
        frmListarPacientes vistaListado = new frmListarPacientes();
        Lista NuevaLista = new Lista();
        
        //LEVANTAR EL CONTROLADOR
        nodoController nuevoControlador = new nodoController(vistaPrincipal, frmAgregarPacientes, frmListarPacientes, NuevaLista);
    }
    
}