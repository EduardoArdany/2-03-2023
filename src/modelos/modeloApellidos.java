
package modelos;

public class modeloApellidos {
    String dato;
    modeloApellidos siguiente;
     public modeloApellidos(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public String setDato(String dato) {
        this.dato = dato;
        return null;
    }

    public modeloApellidos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(modeloApellidos siguiente) {
        this.siguiente = siguiente;
    }
}
