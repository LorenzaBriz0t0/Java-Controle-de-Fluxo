public class CaixaEletronico {
    public static void main(String[] args){

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo){
            saldo = saldo -valorSolicitado;

            System.out.println("Seu saldo atual é:\nR$" + saldo + "\n Valor do último saque:\nR$" + valorSolicitado);
        }else
            System.out.println("Saldo insuficiente");



    }
    
}
