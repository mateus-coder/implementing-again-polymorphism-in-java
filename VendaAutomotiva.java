package util;

public class VendaAutomotiva extends Servico{
   private Produto [] automoveisSelecionados;
   
   public VendaAutomotiva(Produto [] automoveis, float precoServico){
      super(precoServico);
      this.setAutomoveisSelecionados(automoveis);
      this.setTipo("Venda automotiva");
   }
   public void setAutomoveisSelecionados(Produto [] automoveis){
      if(automoveis.length > 0){
         this.automoveisSelecionados = Produto.retornaProdutosValidos(automoveis);
      }
   }
   
   @Override
   public float getPrecoServico(){
      return super.getPrecoServico() + Produto.precoConjuntoDeProdutos(this.automoveisSelecionados);  
   }
   
   @Override
   public String toString(){
      String saida = "------------------ Automóveis selecionados -----------------\n\n";
      saida += Produto.retornaProdutos(this.automoveisSelecionados) + "\n";
      saida += "================= Preço deste serviço ======================\n\n";
      saida += super.toString();
      saida += "\n\n============================================================\n";
      return saida;
   }
}