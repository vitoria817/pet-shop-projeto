DESCRIÇÕES DE CASO DE USO

Descrições de Casos de Uso

CASO DE USO: Cadastrar Cliente

Identificador: UC-01  
Ator Principal: Atendente  
Atores Secundários: Cliente
Descrição: Permite cadastrar novos clientes no sistema, registrando o nome, o CPF e telefone.

Pré-condições: O sistema está em execução.
Fluxo Principal:
1. Atendente inicia o cadastro de cliente.
2. Sistema solicita o nome do cliente.
3. Atendente informa o nome.
4. Sistema solicita o CPF.
5. Atendente informa o CPF.
6. Sistema valida o CPF (formato e dígitos).
7. Sistema solicita o telefone.
8. Atendente informa o telefone.
9. Sistema confirma o cadastro e armazena os dados.
Fluxo Alternativo:
6a. Se o CPF for inválido, o sistema exibe mensagem de erro e retorna ao passo 4.
Pós condições: Um objeto 'Cliente' é criado e mantido na memória para o atendimento atual.
Exceções: sem

CASO DE USO: Cadastrar Pet

Identificador: UC-02  
Ator Principal: Atendente  
Atores Secundários: não posssui 
Descrição: Registra um pet associado ao cliente atual, com nome, tipo, porte e idade.
Pré-condições: Cliente já cadastrado.
Fluxo Principal:
1. Atendente inicia o cadastro do pet.
2. Sistema solicita o nome do pet.
3. Atendente informa o nome.
4. Sistema solicita o tipo do pet.
5. Atendente informa o tipo.
6. Sistema solicita o porte.
7. Atendente informa o porte.
8. Sistema solicita a idade.
9. Atendente informa a idade.
10. Sistema registra o pet associado ao cliente.
Fluxo Alternativo: sem 
Pós condições: Um objeto 'Pet' é criado e vinculado ao cliente.
Exceções: sem 

CASO DE USO: Registrar Banho

Identificador: UC-03  
Ator Principal: Atendente  
Atores Secundários: cliente 
Descrição: Registra um serviço de banho/tosa, incluindo o tipo de tosa escolhido pelo cliente, 
além do horário. O sistema automaticamente calcula o preço do serviço.
Pré-condições: Cliente e pet cadastrados.
Fluxo Principal:
1. Atendente seleciona a opção “Banho/Tosa” no menu.
2. Sistema exibe os tipos de tosa disponíveis: Tosa Higiênica, Tosa Racional, Tosa Estilizada, Tosa Completa.
3. Atendente informa o tipo de tosa.
4. Sistema registra o serviço de banho.
5. Sistema calcula o preço com base no tipo de tosa (UC-06 – Calcular Preço).
6. Sistema confirma o registro.
Fluxo Alternativo: sem  
Pós condições: Um objeto 'Banho' é adicionado à lista de serviços do atendimento.
Exceções: Se o tipo de tosa informado não corresponder a nenhuma das opções,
o preço calculado será R$ 0,00, mas o registro é mantido.

CASO DE USO: Registrar Consulta

Identificador: UC-04  
Ator Principal: Atendente  
Atores Secundários: cliente  
Descrição: Registra uma consulta veterinária, associando automaticamente um veterinário padrão, 
escolhendo um horário, o diagnóstico informado pelo cliente e a data atual do sistema. 
O preço é calculado automaticamente.
Pré-condições: Cliente e pet cadastrados.
Fluxo Principal:
1. Atendente seleciona a opção “Consulta Veterinária” no menu.
2. Sistema solicita o diagnóstico.
3. Atendente informa o diagnóstico.
4. Sistema associa automaticamente o veterinário padrão (Dr. Carlos, CRMV‑1234, especialidade Clínico Geral).
5. Sistema define a data atual como data do serviço.
6. Sistema registra a consulta.
7. Sistema calcula o preço (UC-06 – Calcular Preço): valor base R$ 100,00 + valor dos medicamentos, se houver.
8. Sistema confirma o registro.
Fluxo Alternativo: sem 
Pós condições: Um objeto 'Consulta' é adicionado à lista de serviços do atendimento.
Exceções: sem 

CASO DE USO: Finalizar Atendimento

Identificador: UC-05  
Ator Principal: Atendente  
Atores Secundários: não possui
Descrição: Encerra o atendimento atual, exibindo um resumo com todos os serviços realizados e o valor total a pagar.
Pré-condições: Pelo menos um serviço (banho ou consulta) foi registrado.
Fluxo Principal:
1. Atendente escolhe a opção “Finalizar” no menu.
2. Sistema exibe os dados do cliente (nome, CPF) e do pet (nome, tipo, porte, idade).
3. Para cada serviço registrado na lista:
   a. Sistema mostra o tipo de serviço (Banho ou Consulta).
   b. Se for consulta: exibe diagnóstico, nome do veterinário e especialidade.
   c. Se for banho: exibe o tipo de tosa.
   d. Sistema exibe o valor calculado do serviço.
4. Sistema exibe o valor total de todos os serviços.
5. Sistema encerra a execução.
Fluxo Alternativo:
3a. Se nenhum serviço foi registrado, o sistema exibe apenas os dados do cliente e do pet com valor total zero.
Pós condições: A aplicação é finalizada.
Exceções: sem
Relação <<include>>
Os casos de uso "Registrar Banho" (UC-03) e "Registrar Consulta" (UC-04) incluem o caso de uso "Calcular Preço" (UC-06),
que é executado automaticamente pelo sistema no passo 5 de UC-03 e no passo 7 de UC-04.







Relação <<include>>
Os casos de uso "Registrar Banho" (UC-03) e "Registrar Consulta" (UC-04) incluem o caso de uso "Calcular Preço" (UC-06), que é executado automaticamente pelo sistema no passo 5 de UC-03 e no passo 7 de UC-04.
