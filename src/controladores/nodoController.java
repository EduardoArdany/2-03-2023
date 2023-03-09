
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Lista;
import vistas.frmAgregarPacientes;
import vistas.frmListarPacientes;
import vistas.frmPrincipal;

public class nodoController implements ActionListener {
    frmPrincipal vistaPrincipal;
    frmAgregarPacientes vistaAgregar;
    frmListarPacientes vistaListar;
    Lista listaGOD;
    
    public nodoController( frmPrincipal vistaPrincipal, frmAgregarPacientes vistaAgregar,frmListarPacientes 
            vistaListar, Lista listaGOD){
    
    this.vistaPrincipal = vistaPrincipal;
    this.vistaAgregar = vistaAgregar;
    this.vistaListar = vistaListar;
    this.listaGOD = listaGOD;    
    
    this.vistaPrincipal.btnAgregar.addActionListener(this);
    
    this.vistaPrincipal.setLocationRelativeTo(null);
    this.vistaPrincipal.setVisible(true);
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== this.vistaPrincipal.btnAgregar){
           //Abre la vista nodos
           //Poner a la escucha los botones
           this.vistaAgregar.btnApilar.addActionListener(this);
           this.vistaAgregar.btnEncolar.addActionListener(this);
           //Levantar formulario
           this.vistaAgregar.setLocationRelativeTo(null);
           this.vistaAgregar.setVisible(true);
    }
       if(e.getSource() == this.vistaAgregar.btnApilar){
        this.listaGOD.Apilar(Integer.parseInt(this.vistaAgregar.txtDato.getText())); 
        this.vistaAgregar.txtLista.setText(this.listaGOD.ListarNodos());
    }
    }
}
