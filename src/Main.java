import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fazer cadastro da pessoa
        // fazer uma mini tela se a pessoa é veterinário ou cliente
        // ver como o cadastro do nome do cliente já vai ficar armazenado com o pet
        // ainda escolher se é consulta ou banho

        //tem que fazer a parte de consulta ainda!!!!
        Scanner sc = new Scanner(System.in);
        //construtores
        Cliente cliente = new Cliente();
        Veterinario vet = new Veterinario();
        Banho banho = new Banho();

        System.out.println("========================================");
        System.out.println("               PET SHOP                 ");
        System.out.println("========================================");
        System.out.println("        Sistema de Atendimento          ");
        System.out.println("----------------------------------------");
        System.out.println("  1 - Cadastrar Cliente                 ");
        System.out.println("  2 - Cadastrar Veterinário             ");
        System.out.println("----------------------------------------");
        System.out.print("Escolha uma opção: ");


        int opcao = sc.nextInt();
        sc.nextLine(); // limpar buffer

        switch (opcao) {
         //cadastro de pessoa
            case 1: {
                System.out.print("Digite o nome: ");
                String nomeCliente = sc.nextLine();
                cliente.setNome(nomeCliente);

                System.out.print("Digite seu CPF: ");
                String cpfCliente = sc.nextLine();
                cliente.setCpf(cpfCliente);

                System.out.print("Digite seu telefone: ");
                String telefoneCliente = sc.nextLine();
                cliente.setTelefone(telefoneCliente);

                System.out.print("Digite seu email: ");
                String emailCliente = sc.nextLine();
                cliente.setEmail(emailCliente);



                //FAZER CADASTRO DO PET AQUI
                System.out.println("\nEscolha o serviço:");
                System.out.println("  1 - Banho/Tosa");
                System.out.println("  2 - Consulta Veterinária");
                System.out.print("Opção: ");
                String opcaoDoCliente = sc.nextLine();
                System.out.println("Cliente cadastrado com sucesso!");

                // se o cliente escolheu Banho/Tosa
                //loop para repetir si o user n digitar exatamente igual

                 while(true) {
                     if (opcaoDoCliente.equals("1")) {
                         System.out.println("Tipos de Tosa:");//o cliente tem que digitar igual
                         System.out.println("Tosa Higiênica");
                         System.out.println("Tosa Racional");
                         System.out.println("Tosa Estilizada");
                         System.out.println("Tosa Completa");
                         System.out.print("Digite o tipo: ");


                         System.out.println("digite igual o catalogo");
                         String tipoTosa = sc.nextLine();

                         // loop continua, usuário digita de novo

                         switch (tipoTosa) {
                             case "Tosa Higiênica":
                             case "Tosa Racional":
                             case "Tosa Estilizada":
                             case "Tosa Completa":
                                 banho.setTosa(tipoTosa);
                                 System.out.println("Tosa escolhida: " + banho.getTosa());
                                 System.out.println("Total a pagar: R$ " + banho.getPreco());//get pegando o valor
                                 //que foi digitado
                                 break;
                             default:
                                 System.out.println("Tosa inválida");
                                 continue;
                         }
                         break;
                     }
                 }
            }

            case 2: {
                System.out.print("Digite o nome do veterinário: ");
                String nomeVet = sc.nextLine();
                vet.setNome(nomeVet);

                System.out.print("Digite o CPF do veterinário: ");
                String cpfVet = sc.nextLine();
                vet.setCpf(cpfVet);

                System.out.print("Digite o telefone do veterinário: ");
                String telefoneVet = sc.nextLine();
                vet.setTelefone(telefoneVet);

                System.out.print("Digite a especialidade: ");
                String especialidadeVet = sc.nextLine();
                vet.setEspecialidade(especialidadeVet);

                System.out.print("Digite o CRMV: ");
                String crmvVet = sc.nextLine();
                vet.setCrmv(crmvVet);

                System.out.println("Veterinário cadastrado");
                break;
            }
        }

        sc.close();
    }
}