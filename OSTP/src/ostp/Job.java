/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ostp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Job implements Runnable{
    private Print print;

    public Job(Print print) {
        this.print=print;
    }

    String S="la facture  est imprimée merci pour votre attente";
    public void run(){
        
     System.out.println(Thread.currentThread().getName()+" Cet employé veut utiliser l'imprimente  ");
        try {
            print.printJob(new Object());
        } catch (InterruptedException ex) {
            Logger.getLogger(Job.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println(Thread.currentThread().getName()+S);
    }
    }
    