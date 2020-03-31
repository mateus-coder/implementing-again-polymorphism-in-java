package util;

import java.text.NumberFormat;

public class NotaFiscal{
   private Servico [] servicos;
   public NotaFiscal(Servico [] servicos){
      this.servicos = servicos;
   }
   public float precoTotal(){
      float soma = 0;
      for(Servico servico : this.servicos){
         if(servico != null){
            soma += servico.getPrecoServico();
         }
      }
      return soma;
   }
   @Override
   public String toString(){
      NumberFormat reais = NumberFormat.getCurrencyInstance();
      String saida = "";
      saida += "=====================================================\n";
      for(Servico servico : this.servicos){
         if(servico != null){
            saida += "|" + servico.getTipo()  + " -> " + reais.format(servico.getPrecoServico()) + "\n"; 
         }
      }
      saida += "===================- TOTAL -========================\n\n";
      saida += "Preço total : " + reais.format(this.precoTotal()) + "\n\n";
      saida += "===================---------========================\n\n";
      return saida;
   }
}