import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      int conta ;
      String agencia ;
      String nome ;
      double saldo ;
      Scanner sc1 = new Scanner(System.in);
      Scanner sc2 = new Scanner(System.in);
      Scanner sc3 = new Scanner(System.in);
      Scanner sc4 = new Scanner(System.in);
 
     System.out.println("Digite o número da conta: ");
     conta = sc1.nextInt();
      
     System.out.println("Digite o número da agencia: ");
     agencia = sc2.nextLine();
     
     System.out.println("Digite o saldo: ");
     saldo = sc3.nextDouble();
      
     System.out.println("Digite o nome: ");
     nome = sc4.nextLine();
     
     System.out.println("Conta criada!!");
     System.out.println("Conta: "+conta);
     System.out.println("Agencia: "+agencia);
     System.out.println("Nome: "+nome);
     System.out.println("Saldo da conta: "+saldo);

    }
}
