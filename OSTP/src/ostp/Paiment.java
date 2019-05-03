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
public class Paiment {
    private final Semaphore semaphorpay;

    public Paiment() {
        this.semaphorpay = new Semaphore(1);
        
    }
    public void printJob (Object document ) throws InterruptedException{
        try{
            semaphorpay.acquire();
            long duration=(long)(Math.random()*100);
            System.out.println(Thread.currentThread().getName()+" Payment    "+duration+" s");
            Thread.sleep(duration);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            semaphorpay.release();
        }
    }
    
}
