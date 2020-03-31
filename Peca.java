package util;

public class Peca extends Produto{
   private int garantia;
   private static final float PRECO_MIN_PECA = 30.00F;
   private static final float PRECO_MAX_PECA = 5000.00F;
   
   public Peca(int garantia, float preco){
      super(preco);
      this.setGarantia(garantia);
   }
   @Override
   public void setPreco(float preco){
      while(preco > PRECO_MAX_PECA || preco < PRECO_MIN_PECA){
         preco = Leitor.readPreco();
      }
      super.setPreco(preco);
   }
   public void setGarantia(int garantia){
      while(garantia < 0 || garantia > 4){
         garantia = Leitor.readGarantia();
      }
      this.garantia = garantia;
   }
   public int getGarantia(){
      return this.garantia;
   }
   
   @Override
   public String toString(){
      return "Tipo : Peça\n"
           + "Garantia : " + this.getGarantia() + " ano(s)\n"
           + "Preço peça : " + super.toString();
   }
}