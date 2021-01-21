/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *  Objeto llamado HilloRunnale que implementa de Runnable para ahorrarse el contructor y que simula un objeto de tipo Hilo
 * @author David Martinez
 */
public class HiloRunnable implements Runnable{
    
    /**
     * La funcion run() tiene como objetivo ejecutar un ciclo 10 veces e indicar desde que hilo se esta imprimiendo.
     * AL finalizar indicara que su hilo a Terminado e imprimira su nombre.
     */
    @Override
    public void run() {
        for( int i = 0; i < 10; ++i ){
            System.out.println("Interación " + i + " de " + Thread.currentThread().getName() );
        }
        System.out.println("Terminina el " + Thread.currentThread().getName() );
    }
    
}
