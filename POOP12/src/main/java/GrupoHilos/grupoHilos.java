/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrupoHilos;

/**
 *
 * @author David Martinez
 */
public class grupoHilos extends Thread{
    
    public grupoHilos( ThreadGroup g, String n ){
        super(g,n);
    }
    
    @Override
    public void run(){
        for( int i = 0; i < 10; ++i ){
            System.out.println( getName() + " iteración " + i );
        }
    }
    
    
}
