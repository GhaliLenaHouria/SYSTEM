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
public class JobQr implements Runnable {
    private QrCodeReader qrd;

    public JobQr(QrCodeReader qrd) {
        this.qrd=qrd;
    }
    public void run(){
        
     System.out.println(Thread.currentThread().getName()+" l'employé veut accéder au lecteur des codes barre svp    ");
        try {
            qrd.readJob(new Object());
        } catch (InterruptedException ex) {
            Logger.getLogger(Job.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println(Thread.currentThread().getName()+"  le lecteur des codes à barre est maintenant libérer  ");
    }
    

    
}
