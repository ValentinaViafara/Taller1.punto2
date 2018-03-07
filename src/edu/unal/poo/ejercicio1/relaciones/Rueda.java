

package edu.unal.poo.ejercicio1.relaciones;


public class Rueda {
    
    private String marca;
    private String medida;
    

    public Rueda(String marca, String medida) {
        this.marca = marca;
        this.medida = medida;
        
        Rueda[] ruedas= new Rueda[4];
        
        for(int i=0; i<4;i++){
            ruedas[i]=new Rueda(this.marca, this.medida);
        }
    }

    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getMarca() {
        return marca;
    }

    public String getMedida() {
        return medida;
    }
    
    
    
    
    
    
    
}
