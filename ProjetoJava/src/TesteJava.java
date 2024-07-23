import java.util.Scanner;

public class TesteJava {
    public static void main (String[] args){
    // Estou testando dúvidas que tive com o uso do Scanner
    Scanner scanner = new Scanner(System.in);
System.out.println("Digite uma linha:");
String linha = scanner.nextLine();
System.out.println("Você digitou: " + linha);

System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá," + nome +"!");
}

}
