package util;

public class Pedido{
   private Fatura fatura;
   private NotaFiscal notaFiscal;
   
   public Pedido(Servico [] servicos){
      this.fatura = new Fatura(servicos);
      this.notaFiscal = new NotaFiscal(servicos);
   }
   
   public Fatura getFatura(){
      return this.fatura;
   }
   public NotaFiscal getNotaFiscal(){
      return this.notaFiscal;
   }
   
   public void setFatura(Fatura fatura){
      this.fatura = fatura;
   }
   public void setNotaFiscal(NotaFiscal notaFiscal){
      this.notaFiscal = notaFiscal;
   }
   
   @Override
   public String toString(){
      return "========================== Fatura ========================\n" + this.fatura + "\n"
           + "=========== Nota Fiscal ==============\n" + this.notaFiscal;
      
   }
}