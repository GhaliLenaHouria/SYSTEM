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
public class JobBascket implements Runnable {
    private Bascket bascket;

    public JobBascket(Bascket bascket) {
        this.bascket=bascket;
    }
    public void run(){
        
     System.out.println(Thread.currentThread().getName()+" Ce client va accéder au Chariot    ");
        try {
            bascket.baskcetJob(new Object());
        } catch (InterruptedException ex) {
            Logger.getLogger(Job.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println(Thread.currentThread().getName()+" Le chariot  est maintenant libérer merci pour votre attente  ");
    }
    
}
