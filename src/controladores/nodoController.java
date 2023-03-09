package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Lista;
import vistas.frmAgregarPacientes;
import vistas.frmPrincipal;
import vistas.frmListarPacientes;


public class nodoController implements ActionListener {
    frmPrincipal vistaPrincipal;
    frmAgregarPacientes vistaNodos;
    frmListarPacientes vistaListado;
    Lista listaGOD;
    
    
    public nodoController( frmPrincipal vistaPrincipal, frmAgregarPacientes vistaNodos, frmListarPacientes vistaListado, 
            Lista listaGOD){
    this.vistaPrincipal = vistaPrincipal;
    this.vistaNodos = vistaNodos;
    this.vistaListado = vistaListado;
    this.listaGOD = listaGOD;    
    
    this.vistaPrincipal.btnAgregar.addActionListener(this);
    this.vistaPrincipal.btnListar.addActionListener(this);
    
    this.vistaPrincipal.setLocationRelativeTo(null);
    this.vistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== this.vistaPrincipal.btnAgregar){
           //Abre la vista nodos
           //Poner a la escucha los botones
           this.vistaNodos.btnApilar.addActionListener(this);
           //Levantar formulario
           this.vistaNodos.setLocationRelativeTo(null);
           this.vistaNodos.setVisible(true);
    }
       if(e.getSource() == this.vistaNodos.btnApilar){
        //this.listaGOD.Apilar(Integer.parseInt(this.vistaNodos.txtDato.getText())); 
        //this.vistaNodos.txtLista.setText(this.listaGOD.ListarNodos());
    }
       if(e.getSource() == this.vistaPrincipal.vistaListado){
           
           this.vistaListado.setLocationRelativeTo(null);
           this.vistaListado.setVisible(true);
    }
     //hola
    }
}