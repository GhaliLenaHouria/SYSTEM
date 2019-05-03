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
public class Print {
    private final Semaphore semaphor;

    public Print() {
        this.semaphor = new Semaphore(1);
        
    }
    public void printJob (Object document ) throws InterruptedException{
        try{
            semaphor.acquire();
            long duration=(long)(Math.random()*100);
            System.out.println(Thread.currentThread().getName()+" l'imprimente  est maintenant ocuppée   pandant une duré de  "+duration+" s");
            Thread.sleep(duration);
                Thread.currentThread().getPriority();

        } catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            semaphor.release();
        }
    }
    
}
