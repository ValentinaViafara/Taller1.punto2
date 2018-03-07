
package edu.unal.poo.ejercicio1.relaciones;


public class Motor {
    
  private String tipo;
  private String marca;

    public Motor(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


  
}
