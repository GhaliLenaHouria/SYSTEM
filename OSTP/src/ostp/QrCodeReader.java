/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ostp;

import java.util.concurrent.Semaphore;

/**
 *
 * @author USER
 */
public class QrCodeReader {
       private final Semaphore semaphorQrCodeReader;

    public QrCodeReader() {
        this.semaphorQrCodeReader = new Semaphore(2);
        
    }
    public void readJob (Object document ) throws InterruptedException{
        try{
            semaphorQrCodeReader.acquire();
            long duration=(long)(Math.random()*100);
            System.out.println(Thread.currentThread().getName()+" l'emplyé utilise un des deux  lecteurs de QR code maintenant  veillier attendre pandant    "+duration+" Secondes");
            Thread.sleep(duration);
                            Thread.currentThread().getPriority();

        } catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            semaphorQrCodeReader.release();
        }
    }


  
}
    

