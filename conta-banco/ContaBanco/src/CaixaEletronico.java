public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 2000.0;
        double valorSolicitado = 375;
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
            
        
    }
}
