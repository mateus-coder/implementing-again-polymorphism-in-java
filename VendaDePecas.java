package util;

public class VendaDePecas extends Servico{
   private Produto [] pecasSelecionadas;
   
   public VendaDePecas(Produto [] pecas, float precoServico){
      super(precoServico);
      this.setPecasSelecionadas(pecas);
      this.setTipo("Venda de peças");
   }
   public void setPecasSelecionadas(Produto [] pecas){
      if(pecas.length > 0){
         this.pecasSelecionadas = Produto.retornaProdutosValidos(pecas);
      }
   }
   @Override
   public float getPrecoServico(){
      return super.getPrecoServico() + Produto.precoConjuntoDeProdutos(this.pecasSelecionadas);
   }
   @Override
   public String toString(){
      String saida = "=================== Peças selecionadas ======================\n\n";
      saida += Produto.retornaProdutos(this.pecasSelecionadas) + "\n";
      saida += "================= Preço deste serviço ======================\n\n";
      saida += super.toString();
      saida += "\n\n============================================================\n";
      return saida;
   }
}