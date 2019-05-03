/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ostp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bureau
 */
public class OSTP extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///*Voici un sénario quand il arrive 4 thread et il ne nous reste q'un seul chariot
                Bascket bascket = new Bascket();
Thread bas[] = new Thread [90];
 for(int i=0;i<5;i++){
     bas[i]=new Thread(new JobBascket(bascket),"Thread : "+i);
              
 }

      for(int i=0;i<5;i++){
          //t[i].setPriority(5);
          bas[i].start();
    }
    //pour utiliser le reader 
      QrCodeReader qrdd = new QrCodeReader();
       
 Thread lecteur[] = new Thread [90];
 for(int i=10;i<16;i++){
     lecteur[i]=new Thread(new JobQr(qrdd),"Thread : "+i);
              
 }

      for(int i=10;i<16;i++){
          //t[i].setPriority(5);
          lecteur[i].start();
    }
    


        ///* Pour utiliser une imprimente 
        Print print = new Print();
 Thread printer[] = new Thread [90];

  for(int i=100;i<106;i++){
     printer[i]=new Thread(new Job(print),"Thread : "+i);
              
 }

      for(int i=10;i<16;i++){
          //t[i].setPriority(5);
          printer[i].start();
    }}}



