import Pessoa.*; // importando classe abstrata
import Serviços.*;// importando classe abstrata

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat; // formato de data

public class Main {
    public static void main(String[] args) {

        // Scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("\n========================================");
        System.out.println("         🐾 BYTE PET SHOP 🐾           ");
        System.out.println("========================================");
        System.out.println("     Sistema de Atendimento Pet         ");
        System.out.println("========================================");

        try {

            //CADASTRO DO CLIENTE
            Cliente cliente = new Cliente();//objeto


            System.out.println("📋 CADASTRO DO CLIENTE");
            System.out.println("----------------------------------------");
            System.out.print("👤 Nome: ");
            cliente.setNome(sc.nextLine()); // define o nome do cliente

            // Loop para garantir CPF válido
            while (true) {
                try {
                    System.out.print("🪪 CPF: ");
                    cliente.setCpf(sc.nextLine()); // pode lançar erro
                    break; // sai do loop se der certo
                } catch (IllegalArgumentException e) { //mostra o erro la na classe pessoa
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            System.out.print("📞 Telefone: ");
            cliente.setTelefone(sc.nextLine());

            // CADASTRO DO PET
            Pet pet = new Pet();
            System.out.println("🐶 CADASTRO DO PET");
            System.out.println("----------------------------------------");

            System.out.print("🐾 Nome do pet: ");
            pet.setNome(sc.nextLine());

            System.out.print("🐕 Tipo (Cachorro/Gato): ");
            pet.setTipo(sc.nextLine());

            System.out.print("📏 Porte (Pequeno/Médio/Grande): ");
            pet.setPetporte(sc.nextLine());

            System.out.print("🎂 Idade: ");
            pet.setIdade(sc.nextInt());
            sc.nextLine(); // limpa buffer

            // Veterinário fixo (simula funcionário do sistema)
            Veterinario vetPadrao = new Veterinario(
                    "Dr. Carlos",
                    "12345678910",
                    "41999999999",
                    "Clínico Geral",
                    "CRMV-1234"
            );
            System.out.println(vetPadrao.getDescricao());

            Atendente atendente = new Atendente(
                    "João",
                    "12345678901",
                    "41999999999",
                    "Manhã"
            );
            System.out.println(atendente.getDescricao());
            // Lista que armazena TODOS os serviços realizados
            // Aqui ocorre POLIMORFISMO (Banho e Consulta são Servico)
            ArrayList<Servico> servicos = new ArrayList<>();

            int opcao;

            //  MENU PRINCIPAL
            do {
                System.out.println("\n========================================");
                System.out.println("              📌 MENU                   ");
                System.out.println("========================================");
                System.out.println("1️⃣  - Banho / Tosa");
                System.out.println("2️⃣  - Consulta Veterinária");
                System.out.println("0️⃣  - Finalizar atendimento");
                System.out.println("========================================");
                System.out.print("👉 Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1: {

                        Banho banho = new Banho();

                        // Escolha do tipo de tosa
                        System.out.println("\n🛁 BANHO / TOSA");
                        System.out.println("----------------------------------------");
                        System.out.println("Tipos disponíveis:");
                        System.out.println("• Tosa Higiênica");
                        System.out.println("• Tosa Racional");
                        System.out.println("• Tosa Estilizada");
                        System.out.println("• Tosa Completa");

                        System.out.print("\n✂️  Escolha a tosa: ");

                        banho.setTosa(sc.nextLine());

                        servicos.add(banho); // adiciona na lista

                        System.out.println("✅ Serviço de banho registrado com sucesso!");
                        break;
                    }

                    case 2: {
                        System.out.println("\n🩺 CONSULTA VETERINÁRIA");
                        System.out.println("----------------------------------------");

                        Consulta consulta = new Consulta();

                        System.out.print("Diagnóstico: ");
                        consulta.setDiagnostico(sc.nextLine());

                        // Associação com veterinário
                        consulta.setVeterinario(vetPadrao);

                        // Define data atual automaticamente
                        consulta.setDataServico(new Date());

                        servicos.add(consulta);//add=adiciona a lita

                        System.out.println("👨‍⚕️ Veterinário: " + vetPadrao.getNome());
                        System.out.println("✅ Consulta registrada com sucesso!");
                        break;
                    }

                    case 0:
                        System.out.println("\nFinalizando atendimento...");
                        break;

                    default:
                        System.out.println("Opção inválida");
                }

            } while (opcao != 0);

            //  RESUMO FINAL
            System.out.println("\n========================================");
            System.out.println("           📊 RESUMO DO ATENDIMENTO       ");
            System.out.println("==========================================");

            System.out.println("👤 Cliente: " + cliente.getNome());
            System.out.println("🐾 Pet: " + pet.getNome());
            //seria bim colocar data aqui

            double total = 0;

            // Percorre todos os serviços realizados
            for (Servico s : servicos) {

                // Mostra o tipo da classe em tempo de execução
                System.out.println("\n----------------------------------------");
                System.out.println("🔧 Serviço: " + s.getClass().getSimpleName());

                // instanceof verifica o tipo real do objeto
                if (s instanceof Consulta) {
                    Consulta c = (Consulta) s;

                    System.out.println("Diagnóstico: " + c.getDiagnostico());
                    System.out.println("Veterinário: " + c.getVeterinario().getNome());
                    System.out.println("Especialidade: " + c.getVeterinario().getEspecialidade());
                }

                if (s instanceof Banho) {
                    Banho b = (Banho) s;
                    System.out.println("Tosa: " + b.getTosa());
                }

                // Polimorfismo: cada classe calcula seu próprio preço
                System.out.println("________________________________");
                double valor = s.calcularPreco();
                System.out.println("💰 Valor: R$ " + valor);
                System.out.println("________________________________");

                total += s.calcularPreco();
            }
            System.out.println("\n========================================");
            System.out.println("💵 TOTAL: R$ " + total);
            System.out.println("========================================");

        } catch (Exception e) {
            // Captura erro geral do sistema
            System.out.println("Erro no sistema: " + e.getMessage());
        }

        System.out.println("\nSistema encerrado.");
    }
}