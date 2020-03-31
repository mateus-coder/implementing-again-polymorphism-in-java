package util;

import java.text.NumberFormat;

public class Servico{
   private float precoServico;
   private String tipo;
   
   public Servico(float precoServico){
      this.precoServico = precoServico;
   } 
   
   public void setPrecoServico(float precoServico){
      this.precoServico = precoServico;
   }
   public float getPrecoServico(){
      return this.precoServico;
   }
   public void setTipo(String tipo){
      this.tipo = tipo;
   }
   public String getTipo(){
      return this.tipo;
   }
   
   @Override
   public String toString(){
      NumberFormat reais = NumberFormat.getCurrencyInstance();
      return "Preco servico : " + reais.format(this.getPrecoServico());
   }
}