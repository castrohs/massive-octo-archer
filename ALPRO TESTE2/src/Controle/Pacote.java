/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
public class Pacote implements Serializable{
    
    public Pacote(){}

    public Pacote(long valorA, long valorB,  long valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
        
    }
        public Pacote(long valorA, long valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
        
        
    }

      

    private long valorA;
    private long valorB;
    private long valorC;
    private long resultado;
    

    public long getValorA() {
        return valorA;
    }

    public long getValorB() {
        return valorB;
    }

    public long getValorC() {
        return valorC;
    }
    

    public long getResultado() {
        return resultado;
    }

    


    @Override
    public String toString (){
        return "X: "+valorA+" Y: "+valorB +" Z: "+valorC;
    }
    
    public double getNumeroRealqueGeraOResultado(){
    
    return Math.sqrt(resultado);
    }
        
    
    public boolean  equal(Pacote pacote){
        if (pacote.getValorB() == valorB)
            return true;
        return false;
    }
 
}
