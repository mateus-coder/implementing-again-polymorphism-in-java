package util;

import java.util.Scanner;

public class Leitor{
   private static final Scanner LEITOR = new Scanner(System.in);
   
   public static float readPreco(){
      System.out.print("Digite um preço válido : ");
      float saida = LEITOR.nextFloat();
      LEITOR.nextLine();
      return saida;
   }
   public static int readDesgaste(){
      System.out.print("Digite o percentual do desgaste deta peça : ");
      int saida = LEITOR.nextInt();
      LEITOR.nextLine();
      return saida;
   }
   public static int readTempo(){
      System.out.print("Digite o tempo que levará para efetuar o reparo : ");
      int saida = LEITOR.nextInt();
      LEITOR.nextLine();
      return saida;
   }
   public static int readGarantia(){
      System.out.print("Digite um tempo de garantia entre 1 e 4 anos : ");
      int saida = LEITOR.nextInt();
      LEITOR.nextLine();
      return saida;
   }
}