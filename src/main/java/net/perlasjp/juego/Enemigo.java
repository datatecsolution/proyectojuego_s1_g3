package net.perlasjp.juego;

public class Enemigo {
    
    private String nombre;
    private int salud;
    private int fuerza;

    public void recibirDanio(int cantidad){
        salud = salud-cantidad;
        if (salud <0) salud=0;
    }

    public int atacar(){
        return fuerza;

    }
    public boolean estarVivo(){
        return salud>0;
    }
    public Jugador(String nombre){
        this.nombre = nombre;
        this.salud = 100;
        this.fuerza =10;
    }
    public Enemigo (int salud, String n){

public void mostrarEstado(){
    System.out.println("Jugador:" + nombre);
     System.out.println("Salud:" + Salud);
      System.out.println("Ataque:" + fuerza);
}
    }
    public  String getNombre(){
        return nombre;
    }
    public int getSalud(){
        return salud;
    }
} 

