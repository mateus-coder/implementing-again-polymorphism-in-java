package util;

public class Oficina{
   public static void usarEquipamentos(int tempoDeReparo){
      Thread thr1 = Thread.currentThread();
      try { Thread.sleep(tempoDeReparo * 60); } catch (InterruptedException ex) {
          System.out.println ("Reparo Finalizado com SUCESSO!!!");
      }
   }
}