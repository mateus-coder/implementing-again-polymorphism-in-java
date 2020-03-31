package util;

import javax.swing.*;

public class Concessionaria{
   private Cliente [] clientes = new Cliente[100];
   private int quantClientes;
   public static void addProduto(Produto produto){
      Produto [] produtos = Estoque.getProdutos(); 
      produtos[Estoque.getQuantProd()] = produto;
      Estoque.setQuantProd( Estoque.getQuantProd() + 1 );
   }
   public static void removeProduto(Produto produto){
      if(Estoque.getQuantProd() > 0){
         Produto [] produtosAux = new Produto[100];
         int i = 0;
         for(Produto prod : Estoque.getProdutos()){
            if(produto.equals(prod)){
               Estoque.setQuantProd( Estoque.getQuantProd() - 1 );
            }
            else{
               produtosAux[i++] = prod;
            }
         }
         Estoque.setProdutos(produtosAux);
      }
   }
   public static void replaceProduto(int pos, Produto produto){
      if(pos >= 0 && pos < Estoque.getQuantProd() && Estoque.getQuantProd() > 0){
         Produto [] produtos = Estoque.getProdutos();
         produtos[pos] = produto;
      }
   }
   public static Estoque getEstoque(){
      return new Estoque();
   }
   public static void main(String [] args){
      Concessionaria concessionaria = new Concessionaria();
      Automovel carroPopular = new Automovel("Red", "Gol", 2004, 44000.00F);
      Peca roda = new PecaUsada(2, 20, 100.0F);
      Peca motor = new PecaNova(4, 5000.0F);
      Peca freio = new PecaNova(1, 2222.0F);
      Peca freioUsado = new PecaUsada(1, 51, 2222.0F);
      Automovel carroDeLuxo = new Automovel("Black", "Lamborghini", 2010, 235820.00F);
      concessionaria.addProduto(carroPopular);
      concessionaria.addProduto(roda);
      concessionaria.addProduto(motor);
      concessionaria.addProduto(freio);
      concessionaria.addProduto(freioUsado);
      concessionaria.removeProduto(roda);
      concessionaria.addProduto(carroDeLuxo);
      concessionaria.replaceProduto(0, new Automovel("Orange", "Onix", 2014, 55789.00F));
      System.out.println(concessionaria.getEstoque());
      
      
      Cliente cliente = new Cliente("Ster");
      concessionaria.clientes[concessionaria.quantClientes++] = cliente;
      concessionaria.clientes[concessionaria.quantClientes++]  = new Cliente("Mateus");
      //System.out.println(concessionaria.clientes[concessionaria.quantClientes-1]);
      System.out.println("Gerou pedido ? " + cliente.gerouPedido());
      Automovel [] automoveis = {carroDeLuxo, new Automovel("White", "Bmw m1", 2016, 88456.08F)};
      Peca [] pecas = {motor, new PecaUsada(4, 51, 200.0F),freio, freioUsado };
      cliente.addServico(new VendaDePecas(pecas, 200.0F)); 
      cliente.addServico(new VendaAutomotiva(automoveis, 500.0F));
      cliente.addServico(new PrestacaoDeReparo(60, 250));
      cliente.addServico(new PrestacaoDeReparo(120, 367));
      cliente.removeServico(3);
      if(cliente.gerouPedido()){
         JTextArea textArea = new JTextArea(40, 70);
         textArea.setText(cliente.getPedido() + "\n");
         textArea.setEditable(false);
         JScrollPane scrollPane = new JScrollPane(textArea);
         JOptionPane.showMessageDialog(null, scrollPane);
      }
      System.out.println("Gerou pedido ? " + cliente.gerouPedido());
   }
   
}