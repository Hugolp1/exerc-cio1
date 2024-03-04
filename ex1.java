import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var nome = leitor.nextLine();
        System.out.println("Digite sua matricula: ");
        var mat = leitor.nextDouble();
        System.out.println("Digite a nota 1: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = leitor.nextDouble();

        var media = (nota1 + nota2) / 2;

        System.out.println("Matricula: " + mat);
        System.out.println("Nome: " + nome);
        if (media >= 6) {
            System.out.println("Aprovado: (X)Sim  ()Nao");
        } else {
            System.out.println("Aprovado: ()Sim  (X)Nao");
        }

        System.out.println("Nota final: " + media);

        leitor.close();
    }
}
