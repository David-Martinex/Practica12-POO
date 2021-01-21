/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author David Martinez
 */
public class Hilos {
    
    public static void main(String[] args) {
        /*
        HiloTheread hilo = new HiloTheread("Primer Hilo Thread");
        hilo.start();
        new HiloTheread("Segundo hilo Thread").start();
        System.out.println("Termina el hilo principal");
        */
        new Thread(new HiloRunnable(), "Primer Hilo Runnable").start();
        new Thread(new HiloRunnable(), "Segundo Hilo Runnable").start();
        System.out.println("Termina hilo Principal");
        
    }
}
