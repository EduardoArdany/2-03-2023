
package modelos;

import javax.swing.JOptionPane;

public class Lista {
    modeloApellidos primero;
    modeloApellidos Auxiliar;
    String cadena =" ";
    
    public void Apilar(){     
    }
   
    public void Apilar(String dato){
    modeloApellidos nodoNuevo = new modeloApellidos(dato);
    if(primero == null){
      primero = nodoNuevo;  
    }
    else {
        nodoNuevo.siguiente = primero;
        primero = nodoNuevo;
    }
    JOptionPane.showMessageDialog(null,"Nodo Apilado");
}
    public String ListarNodos(){
        Auxiliar = primero;
        while(Auxiliar!=null){
        cadena = cadena + Auxiliar.getDato();
        Auxiliar = Auxiliar.siguiente;
        }
        return cadena;
    }
}
