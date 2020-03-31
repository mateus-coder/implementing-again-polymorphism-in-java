package util;

public class PrestacaoDeReparo extends Servico{
   private int tempoDeReparo;
   
   public PrestacaoDeReparo(int tempoDeReparo, float precoServico){
      super(precoServico);
      this.setTempoDeReparo(tempoDeReparo);
      this.setTipo("Prestação de reparo");
   }
   
   public void setTempoDeReparo(int tempoDeReparo){
      while(tempoDeReparo < 0){
         tempoDeReparo = Leitor.readTempo();
      }
      this.tempoDeReparo = tempoDeReparo;
   }
   public int getTempoDeReparo(){
      return this.tempoDeReparo;
   }
   
   public void efetuarReparo(){
      Oficina.usarEquipamentos(this.tempoDeReparo);
   }
   
   @Override
   public float getPrecoServico(){
      return super.getPrecoServico() + ( ( ( this.tempoDeReparo * 10 ) / 100.0F ) + ( ( super.getPrecoServico() * 5 ) / 100 ) );
   }
   
   @Override
   public String toString(){
      return "======================== Serviço de reparo =================\n\n"
           + "Tempo de reparo : " + this.tempoDeReparo + " minutos\n"
           + "================= Preço deste serviço ======================\n\n"
           + super.toString()  + "\n\n"
           + "============================================================";
   }
}