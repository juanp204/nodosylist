/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author juanp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(lista.head.getnext(), 9);
        Nodo n = lista.head;
        for (int i = lista.c; i>=1; i--) {
            System.out.println(n.getvalor());
            n=n.getnext();
        }
        
    }
    
}
