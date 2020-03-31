package util;

public class Automovel extends Produto{
   private String cor;
   private String modelo;
   private int ano;
   private static final float PRECO_MAX_AUTOMOVEL = 500000.00F;
   private static final float PRECO_MIN_AUTOMOVEL = 20000.00F;
   
   public Automovel(String cor, String modelo, int ano, float preco){
      super(preco);
      this.cor = cor;
      this.modelo = modelo;
      this.ano = ano;
   }
   
   public String getCor(){
      return this.cor;
   }
   public String getModelo(){
      return this.modelo;
   }
   public int getAno(){
      return this.ano;
   }
   
   public void setCor(String cor){
      this.cor = cor;
   }
   public void setModelo(String modelo){
      this.modelo = modelo;
   }
   public void setAno(int ano){
      this.ano = ano;
   }
   @Override
   public void setPreco(float preco){
      while(preco > PRECO_MAX_AUTOMOVEL || preco < PRECO_MIN_AUTOMOVEL){
         preco = Leitor.readPreco();
      }
      super.setPreco(preco);   
   }
   
   @Override
   public String toString(){
      return "Tipo : Automóvel\n"
           + "Modelo : " + this.modelo + "\n"
           + "Cor : " + this.cor + "\n"
           + "Ano : " + this.ano + "\n"
           + "Preço veículo : " + super.toString();
   }
   
}