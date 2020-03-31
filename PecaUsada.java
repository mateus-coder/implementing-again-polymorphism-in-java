package util;

public class PecaUsada extends Peca{
   private int desgaste;
   
   public PecaUsada(int garantia, int desgaste, float preco){
      super(garantia, preco);
      this.setDesgaste(desgaste);
   }
   
   public void setDesgaste(int desgaste){
      while(desgaste < 0 || desgaste > 80){
         desgaste = Leitor.readDesgaste();
      }
      this.desgaste = desgaste;
   }
   
   public int getDesgaste(){
      return this.desgaste;
   }
   
   @Override
   public float getPreco(){
      return super.getPreco() - ( ( this.desgaste / 100.0F ) * super.getPreco() );
   }
   @Override
   public int getGarantia(){
      return (this.desgaste > 50) ? 0 : 1;
   }
   @Override
   public String toString(){
      return super.toString() + "\n"
           + "Desgaste : " + this.desgaste + " %";
   }
}