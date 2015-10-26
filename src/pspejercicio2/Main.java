/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pspejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oquintansocampo
 */
public class Main extends Thread {

    public Main(String nom) {
        super(nom);
    }

    public static void main(String[] args) {

        new Main("Hilo1").start();
        new Main("Hilo2").start();
        new Main("Hilo3").start();
        new Main("Hilo4").start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Nombre: " + getName() + "\nNumero: " + i + "\n");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
}
