package br.com.threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Aplicacao {
   
    public static void main(String[] args) { // psvm atalho //
        
        Tarefa t1 = new Tarefa("Job 1");  // CRTL + Espaco mostra construtores//
         Tarefa t2 = new Tarefa("Job 2");
          Tarefa t3 = new Tarefa("Job 3");
            
        Thread th = new Thread(t1);
        // th.setPriority(10); // prioridade maxima. Depende do S.O.
        th.start();
        
        try {
            th.join(); // Deve ser colocado após o start
        } catch (InterruptedException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        new Thread(t2).start();
        
        new Thread(new Tarefa("Job 3")).start();
          
        System.out.println("Fim de execucao do main");
        
    }
}
