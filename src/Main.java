import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        //fazer cadastro da pessoa
        //fazer uam mine tela si a pessoa é veterinario ou cliente
        //ver como o cadastro do nome do cliente ja vai ficar armazenado com o pet

        int clienteEscolha = 1;
        int veterinarioEscolha = 2;

switch (clienteEscolha){

    case 1: System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        //guardar no objeto:
        cliente.setNome(nome);

    case 2: System.out.println("digite a raça do pet");
        String tipo = sc.nextLine();
        cliente.setNome(tipo);
    break;

    case 3: System.out.println("digite a idade do pet");
        String idade = sc.nextLine();
        cliente.setNome(idade);
}


    }
}