# Sistema de Agendamento de serviços de embarcações náuticas, disponibilizado no formato WEB.

Tarefas: se encontram no https://trello.com/b/ROCHCbiw/nkmarina-projeto

Cliente:
Uma marina com mais de 50 embarcações de pequeno, médio e de grande porte;

Contato: joao.nickler@catolicasc.edu.br

Motivação do projeto: Auxiliar marinas espalhadas pelo país, referente à agendamentos, cortando erros de comunicação, o sistema preza por alinhar pontos que devem ter verificação e manutenção antes da embarcação ir à água.

Identicação do Problema: Atualmente quando um cliente da marina precisa da embarcação ele faz uma ligação ou envia um WhatsApp solicitando. Com isto, o funcionário durante a semana faz uma verificação detalhada visada entre salvatagem, mecânica e estrutural, caso solictado. Muitas vezes o funcionário realiza apenas o que foi solicitado e o cliente acaba tendo problemas em alto mar que poderiam ser verificados anteriormente.

Oportunidade: Melhorar o serviço de agendamento e checagem dos itens das embarcações antes da saída para a viagem.

Necessidade:
Marina precisa de um sistema WEB para realizar a organização dos processos do dia-a-dia para futuras viagens dos seus clientes

Requisitos Funcionais:

Deve permitir inserção de clientes e vincular embarcações;
Deve permitir o registro de uma agenda para uma determinada embarcação do cliente;
Inserção automática de CheckList da embarcação que foi agendada;
Em todas as interações : Inclusao, Exclusao e Edição;
Administração dos Usuarios, sendo atualmente possivel registrar um novo usuário;
Requisitos Não Funcionais:

Sistema de fácil utilização;
Tempo de resposta rápido nas operações ou imediato;
Ser apto à mudanças de regras de negócio ou design;
Parte Técnica:
image

Link Documentação API : http://localhost:8080/swagger-ui/index.html

Local Sonar : https://sonarcloud.io/organizations/joaonickler/projects

Local do Monitoramento: Jaeger ( Localhost )

Banco de Dados: PostgreSQL

![image](https://github.com/joaonickler/nkmarina/assets/90014083/9de95845-e32d-4035-9fc5-65e55012dd1d)


Cloud: FrontEnd : https://vercel.com/joao-nicklers-projects/nkmarinafront

BackEnd e Banco Postgres : https://dashboard.render.com/

Local da Aplicação : https://nkmarinafront.vercel.app/


