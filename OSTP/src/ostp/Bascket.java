/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ostp;

import java.util.concurrent.Semaphore;



public class Bascket{
    private final Semaphore semaphor1;

    public Bascket() {
        this.semaphor1 = new Semaphore(1);
        
    }
    public void baskcetJob (Object document ) throws InterruptedException{
        try{
            semaphor1.acquire();
            long duration=(long)(Math.random()*10);
            System.out.println(Thread.currentThread().getName()+" Le client utilise maintenant le chariot  pandant une durée de    "+duration+" Munites ");
            Thread.sleep(duration);
                            Thread.currentThread().getPriority();

        } catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            semaphor1.release();
        }
    }


  
}