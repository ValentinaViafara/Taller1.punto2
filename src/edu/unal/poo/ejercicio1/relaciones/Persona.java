
package edu.unal.poo.ejercicio1.relaciones;

public class Persona {
    private String nombre;
    private Carro[] carros;

    
      public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean anadirCarro(Carro carro){
        int aux=0;
        boolean proceso=false;
        for(int i=0; i<10;i++){
            if(this.carros[i]==null){
                aux=i;
                proceso=true;  
                break;
                  
        }else{
                proceso=false;
            }
            carros[aux]=carro;
       
    }
        return proceso;
    }

  
    
    
    public Carro[] listarCarros(){
        return this.carros;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
    
    
    
}
