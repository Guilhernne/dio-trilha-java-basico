import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double agencia = 2781.1;
        int conta = 131921;
        int saldo = 73000;
        String cliente = "Luis";
        
        System.out.println("Por favor digite o número da Agência! ");
        System.out.println("Digite a sua Agência" );
        agencia = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
