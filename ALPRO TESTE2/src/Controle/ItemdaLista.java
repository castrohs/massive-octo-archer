/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.LinkedList;

/**
 *
 * @author 09201801
 */
public class ItemdaLista {

    private long numero;
    private LinkedList<Pacote> lista;

    public ItemdaLista(long numero, Pacote p) {
        this.numero = numero;
        lista = new LinkedList<>();
        lista.add(p);
    }

    public void add(Pacote p) {
        lista.add(p);
    }

    public LinkedList get() {
        return lista;
    }

    public int size() {
        return lista.size();
    }

    public LinkedList<Pacote> getLista() {
        return lista;
    }

    public long getNumero() {
        return numero;
    }
}
