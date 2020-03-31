package util;

public class Fatura{
   private Servico [] servicos;
   public Fatura(Servico [] servicos){
      this.servicos = servicos;
   }
   @Override
   public String toString(){
      String saida = "";
      for(Servico servico : this.servicos){
         if(servico != null){
            saida += (servico + "\n");
         }
      }
      return saida;
   }
}