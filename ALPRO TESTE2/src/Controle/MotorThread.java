/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.LinkedList;

/**
 *
 * @author Gustavo
 */
public class MotorThread implements Runnable{
    public MotorThread(){}
    private LinkedList numerosPerfeitos = new LinkedList();
    @Override
    public void run() {
     
    }
    public void run(int valorInicio,int valorFim) {

  
        for (int x = valorInicio; x <= valorFim; x++) {
            for (int y = valorInicio+1; y < x; y++) {
                if (x != y) {
                    if (isPerfectSquare(x - y)) {
                        if (isPerfectSquare(x + y)) {
                         //   System.out.println("X: " + x + " Y: " + y);
                            for (int z = 1; z < y; z++) {
                                if (x != z) {
                                    if (isPerfectSquare(x - z)) {
                                        if (isPerfectSquare(x + z)) {
                                            if (y != z) {
                                                if (isPerfectSquare(y - z)) {
                                                    if (isPerfectSquare(y + z)) {
                                                        Pacote pacote = new Pacote(x, y, z);
                                                        adicionaNaLista(pacote);
                                               //         System.out.println("x: " + x + " y: " + y + " z: " + z);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
     
     private boolean isPerfectSquare(long n) {
        if (n < 0) {
            return false;
        }
        long sqrt;
      
                    //Carmack hack gives incorrect answer for n >= 410881.
                    sqrt = (long) Math.sqrt(n);
                
                return sqrt * sqrt == n;



    }
 
    private void adicionaNaLista(Pacote pacote) {
        //   if (!op.jaTemNaLista(numerosPerfeitos, pacote.getResultado()))
        numerosPerfeitos.add(pacote);


    }   
    public LinkedList getNumeros(){
        return numerosPerfeitos;
    }
}
