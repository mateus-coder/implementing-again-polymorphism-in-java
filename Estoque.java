package util;

public class Estoque{
   private static Produto [] produtos = new Produto[100];
   private static int quantProd = 0;
   
   public static void setProdutos(Produto [] prod){
      produtos = prod;
   }
   public static void setQuantProd(int newQuantProd){
      if(newQuantProd >= 0){
         quantProd = newQuantProd;
      }
   }
   public static Produto [] getProdutos(){
      return produtos;
   }
   public static int getQuantProd(){
      return quantProd;
   }
   
   @Override
   public String toString(){
      String saida = "";
      saida += "-----------------------Produtos-----------------------\n";
      for(int i = 0; this.produtos[i] != null && i < this.quantProd; i++){
         saida += this.produtos[i] + "\n\n";
      }
      return saida;
   }
}