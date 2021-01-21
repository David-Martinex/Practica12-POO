/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *Objeto que simula un Hilo y tiene como extencio a Thread dandole acceso a sus metodos
 * 
 */
public class HiloTheread extends Thread{
    
    /**
     * @param nombre recibe una cadena que se le asignara como nombre a nuestro hilo
     */
    public HiloTheread( String nombre ) {
        super(nombre);
    }
    
    /**
     * Funcion run tiene como objetivo el ejecutar un cliclo que se repetira 10 veces e imprimira el numero de iteraciones
     * realizadas y el nombre del hilo desde el que se esta imprimiendo.
     * Para finalizar imprime que se termino el hilo al que pertenece.
     */
    @Override
    public void run(){
        for( int i = 0; i < 10; i++ ){
            System.out.println("Interación " + (i) + " del " + getName() );
        }
        System.out.println("Termina el hilo " + getName() );
    }
}
