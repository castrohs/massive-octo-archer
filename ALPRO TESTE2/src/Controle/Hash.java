/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author 09201801
 */
public class Hash {

    private ArrayList<ItemdaLista> lista = new ArrayList<>(2000000);

    public boolean adiciona(Pacote p) {
        boolean encontrei = false;
        for (ItemdaLista i : lista) {

            if (i.getNumero() == p.getValorB()) {
                encontrei = true;
               return false;
            }

        }
        if (encontrei == false) {
            if (p.getValorB()==420968)
                System.out.println("ADD");
            lista.add(new ItemdaLista(p.getValorB(), p));
        }
        return true;
    }

    public ArrayList get() {

        return lista;
    }
    public int size() {

        return lista.size();
    }

}
