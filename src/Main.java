import org.w3c.dom.CDATASection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // fazer uma mini tela se a pessoa é veterinário ou cliente
        // ver como o cadastro do nome do cliente já vai ficar armazenado com o pet


        //tem que fazer a parte de consulta ainda!!!!
        Scanner sc = new Scanner(System.in);
        //construtores
        Cliente cliente = new Cliente();
        Veterinario vet = new Veterinario();
        Banho banho = new Banho();
        Pet pet = new Pet();
        Consulta consulta= new Consulta();

        System.out.println("========================================");
        System.out.println("           bem-vindo ao                 ");
        System.out.println("========================================");
        System.out.println("           BYTE PET SHOP                ");
        System.out.println("========================================");
        System.out.println("        Sistema de Atendimento          ");
        System.out.println("----------------------------------------");

        System.out.print("Digite seu nome: "); //cliente
        String nomeCliente = sc.nextLine();
        cliente.setNome(nomeCliente);

        while (true) { //LOOP SI DER NO CATCH
            try {
                System.out.print("Digite seu CPF: ");
                String cpfCliente = sc.nextLine();

                if (cpfCliente.length() != 11) {
                    System.out.println("CPF inválido");
                    continue; // volta pro início do loop
                }

                cliente.setCpf(cpfCliente); // só salva se tiver 11 dígitos
                break; // SI DER CERTO ELE SAI DO LOOP

            } catch (Exception e) {
                System.out.println("Inválido, tente novamente");
            }
        } //FECHOU O WHILE

        System.out.print("Digite seu telefone: ");
        String telefoneCliente = sc.nextLine();
        cliente.setTelefone(telefoneCliente);

        System.out.print("Digite seu email: ");
        String emailCliente = sc.nextLine();
        cliente.setEmail(emailCliente);

        //FAZER CADASTRO DO PET AQUI
        System.out.println("digite o nome do pet");
        String Petnome = sc.nextLine();
        pet.setNome(Petnome);

        System.out.println("digite a raça do pet");
        String Pettipo = sc.nextLine();
        pet.setTipo(Pettipo);

        System.out.println("Digite o porte do animal");
        String Petporte = sc.nextLine();
        pet.setTipo(Petporte);

        System.out.println("digite a idade do pet");
        int idade = 0;
        boolean idadeValida = false;
        while (!idadeValida) { // LOOP PARA ENTRADA VALIDA
            if (sc.hasNextInt()) {
                idade = sc.nextInt();
                idadeValida = true;
            } else {
                System.out.println("Idade inválida");
                sc.next(); // limpar entrada inválida
            }
        }
        sc.nextLine(); //so pra limpar e não consumir o próximo
        pet.setIdade(idade);

        pet.setDono(cliente);

        System.out.println("Olá, " + nomeCliente + "");
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Banho/Consulta");
        System.out.println("2 - Cadastrar Veterinário");

        int opcao = sc.nextInt(); //do while para si quer banho ou consulta
        sc.nextLine(); // limpar buffer

        switch (opcao) {

            case 1: {
                //SERVIÇOS
                System.out.println("\nEscolha o serviço:");
                System.out.println("  1 - Banho/Tosa");
                System.out.println("  2 - Consulta Veterinária");
                System.out.print("Opção: ");

                String opcaoDoCliente = sc.nextLine();

                // loop para repetir si o user n digitar exatamente igual
                while (!opcaoDoCliente.equals("1") && !opcaoDoCliente.equals("2")) {
                    System.out.print(" Digite 1 ou 2: ");
                    opcaoDoCliente = sc.nextLine();
                }

                System.out.println("Cliente cadastrado com sucesso!");

                // se o cliente escolheu Banho/Tosa
                if (opcaoDoCliente.equals("1")) {
                    while (true) {
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

                break; // BREAK para não cair no case 2
            }


            case 2: {
                System.out.print("Digite o nome do veterinário: ");
                String nomeVet = sc.nextLine();
                vet.setNome(nomeVet);

                while (true) {
                    try {//pro cpf veterinario
                        System.out.print("Digite o CPF do veterinário: ");
                        String cpfVet = sc.nextLine();
                        vet.setCpf(cpfVet);
                    } catch (Exception e) {
                        System.out.println("CPF inválido, tente novamente");
                    }

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
                //FAZER CONSULTA

               // para a consulta, ver uma forma de colocar data automatico de fazer as perguntas
                    //e fazer as perguntas aqui!!
                    //depois os medicamentos

                break;

            }
            break;
        }
        }
    }
}