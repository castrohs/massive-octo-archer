/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author 09201801
 */
public class Hash {

    private LinkedList<ItemdaLista> lista = new LinkedList<>();

    public boolean adiciona(Pacote p) {
        boolean encontrei = false;
        for (ItemdaLista i : lista) {

            if (i.getNumero() == p.getValorB()) {
                encontrei = true;
               return false;
            }

        }
        if (encontrei == false) {
            lista.add(new ItemdaLista(p.getValorB(), p));
        }
        return true;
    }

    public LinkedList get() {

        return lista;
    }
    public int size() {

        return lista.size();
    }

}
