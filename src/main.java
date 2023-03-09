
import controladores.nodoController;
import modelos.Lista;
import vistas.frmPrincipal;
import vistas.frmAgregarPacientes;

public class main {

    public static void main(String[] args) {
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmAgregarPacientes vistaAgregar = new frmAgregarPacientes(vistaPrincipal,true);
        Lista NuevaLista = new Lista();
        
        //LEVANTAR EL CONTROLADOR
        nodoController nuevoControlador = new nodoController(vistaPrincipal, vistaAgregar, NuevaLista);
    }
    
}
