package net.perlasjp.juego;

public class Jugador {
    private String nombre;
    private int salud;
    private int fuerza;

    
    public void recibirDanio(int cantidad){
        salud = salud - cantidad;
        if (salud < 0) salud = 0;
    }

    public int atacar(){
        return fuerza;
    }
        
    public boolean estaVivo(){
        return salud > 0;
    }
     public Jugador (String nombre){
        this.nombre = nombre;
        this.salud = 100;
        this.fuerza= 10;

     }

     public void mostrarEstado(){
        System.out.println ("Jugador:"+nombre);
        System.out.println ("Salud:"+ salud);
        System.out.println ("Ataque:" + fuerza);
     }
    public String getNombre(){
        return nombre;
    }
    public int getSaludo(){
        return salud; 
    }
      
}
