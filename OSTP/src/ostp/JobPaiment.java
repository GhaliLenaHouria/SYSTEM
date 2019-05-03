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
public class JobPaiment  implements Runnable {
    private Paiment payy;

    public JobPaiment(Paiment paiment) {
        this.payy=payy;
    }
    public void run(){
        
     System.out.println(Thread.currentThread().getName()+" Ce client va accéder à la caisse    ");
         try {
            payy.printJob(new Object());
        } catch (InterruptedException ex) {
            Logger.getLogger(JobPaiment.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println(Thread.currentThread().getName()+"Le client a effectuer le paiment  ");
    }
    
}
