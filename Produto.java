package util;
import java.text.NumberFormat;

public class Produto{
   private float preco;
   
   public Produto(float preco){
      this.setPreco(preco);
   }
   public void setPreco(float preco){
      this.preco = preco;
   }
   public float getPreco(){
      return this.preco;
   }

   public static float precoConjuntoDeProdutos(Produto [] produtos){
      float preco = 0;
      for(Produto produto : produtos){
         if(produto != null){
            preco += produto.getPreco();
         }
      }
      return preco;
   }
   public static String retornaProdutos(Produto [] produtos){
      String saida = "";
      for(Produto produto : produtos){
         if(produto != null){
            saida += produto + "\n --------------------------\n";
         }
      }
      return saida;
   }
   public static Produto [] retornaProdutosValidos(Produto [] produtos){//produtos válido são produtos em estoque
      int indiceProdutoValido = 0;
      Produto [] produtosSelecionadosValidos = new Produto[produtos.length];
      Produto [] estoqueComBaixas = Estoque.getProdutos();
      for(int i = 0; i < produtos.length; i++){
         for(int j = 0; estoqueComBaixas[j] != null && j < estoqueComBaixas.length; j++){
            if(produtos[i].equals(estoqueComBaixas[j])){
               produtosSelecionadosValidos[indiceProdutoValido++] = produtos[i];
               Concessionaria.removeProduto(estoqueComBaixas[j]);
            }
         } 
      }
      return produtosSelecionadosValidos;
   }
   @Override
   public String toString(){
      NumberFormat reais = NumberFormat.getCurrencyInstance();
      return "-> " + reais.format(this.getPreco());
   }
}