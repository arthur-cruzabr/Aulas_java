package contas;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
       ContaConrrente cc = new ContaConrrente();
       Scanner ler  = new Scanner(System.in);
       System.out.println("Digite Seu NOME: ");
       cc.nome = ler.next();
       System.out.println("DIGITE SEU SALDO: ");
       cc.deposito(ler.nextFloat());
       System.out.println(cc.Saldo());

    }
     
}
