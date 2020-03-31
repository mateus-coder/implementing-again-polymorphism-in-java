package util;

public class Cliente{
   private Servico [] servicosSolicitados;
   private String nome;
   private Pedido pedido;
   private int quantServicos;
   
   public Cliente(String nome){
      this.servicosSolicitados = new Servico[100];
      this.nome = nome;
      this.quantServicos = 0;
   }
   
   public void addServico(Servico servico){
      this.servicosSolicitados[this.quantServicos++] = servico;
   }
   public void removeServico(int indice){
      if(indice >= 0 && indice < this.quantServicos && this.quantServicos > 0 ){
         Servico [] aux = new Servico[this.quantServicos-1];
         int j = 0;
         for(int i = 0; i < this.quantServicos; i++){
            if(i != indice){
               aux[j++] = this.servicosSolicitados[i];
            }
         }
         this.quantServicos--;
         this.servicosSolicitados = aux;
      }
   }
   public boolean gerouPedido(){
      if(this.quantServicos > 0){
         this.pedido = new Pedido(this.servicosSolicitados);
         return true;
      }
      return false;
   }
   public Pedido getPedido(){
      return this.pedido;
   }
   @Override
   public String toString(){
      return "Nome : " + this.nome;
   }
}