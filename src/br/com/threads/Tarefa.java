package br.com.threads;

public class Tarefa implements Runnable {
 
    private String recurso;

    public Tarefa(String recurso) {   // Construtor //
        this.recurso = recurso;
    }
    
    @Override
    public void run(){ // override é polimorfismo //
        System.out.println("Tarefa em execução:\t" + recurso);
}
}
