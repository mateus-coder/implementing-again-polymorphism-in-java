package util;

public class PecaNova extends Peca{
   
   public PecaNova(int garantia, float preco){
      super(garantia, preco);
   }
   
   @Override
   public float getPreco(){
      return super.getPreco() + ( ( 10 / 100.0F ) * super.getPreco() );
   }
   @Override
   public int getGarantia(){
      return super.getGarantia() + 5;
   }
   @Override
   public String toString(){
      return super.toString() + "\n";
   }
}