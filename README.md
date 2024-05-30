# Projeto de Estudo com Mentoria sobre Spring Boot

## Descrição
Este repositório foi criado para versionar um projeto de estudo sobre Spring Boot. O objetivo é aprender e aplicar os conceitos do framework com a orientação da mentora Thalita Mendes.

## Estrutura do Projeto
O projeto será desenvolvido em fases, abordando diferentes aspectos e funcionalidades do Spring Boot. Cada fase será documentada e versionada neste repositório.

## Mentoria
- **Mentora:** Thalita Mendes
- **Aprendiz:** Abimael Andrade

## Objetivos do Projeto
- Entender os conceitos básicos do Spring Boot
- Configuração de um projeto Spring Boot
- Criação de endpoints REST
- Conexão com bancos de dados
- Boas práticas no desenvolvimento com Spring Boot
- Testes automatizados

## Tecnologias Utilizadas
- Java
- Spring Boot
- Maven
- Banco de Dados (PostgreSQL)

## Estrutura do Repositório

## Como executar o projeto?
1 - Pré requisitos:
        - Tenha instalado/configurado em seu SO:

            - O java 17;
                    - Windows: https://www.youtube.com/watch?v=QekeJBShCy4
                    - Linux: https://www.youtube.com/watch?v=iHZ4b1twvlg
                    - MacOS: https://www.youtube.com/watch?v=SdKIBGnkhDY
                    - Vale salientar que há a possibilidade de ter que fazer manualmente a configuraçoes de variáveis de ambiente:
                        - https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26
            
            - Um IDE(Integrated Development Environment - Abiente de desenvolvimento integrado) de sua preferênciaeditor;
                    - VsCode: https://code.visualstudio.com/Download
                    - InteliJ: https://www.jetbrains.com/idea/download/?section=windows

            - O Git:
                    - https://git-scm.com/downloads/

2 - Após concluir os passos à cima, vamos clonar o repositório do projeto:
        
        - Obs: Existem várias formas de clonar um repositório git, vou dixar alguns links para lhe auxiliar caso tenha dificuldades:
            - https://docs.github.com/pt/repositories/creating-and-managing-repositories/cloning-a-repository
            - https://www.youtube.com/watch?v=WEPB5pDSEIg
            -    

        - Passos para clonar o repositório no Windows:
            - Escolha a pasta onde você deseja salvar o projeto;
            - Navegue até a pasta onde deseja clonar o projeto;
            - Clique com o botão direito do windows em um área vazia desta pasta;
            - No menu que se abriu, selecione a opção "Abrir no terminal", e com isso você abrirá o terminal PowerShell no caminho  "C:\Users\user\caminho até a pasta>";
            - Execute o comando "git clone git@github.com:AbimaelASilva/study-springboot.git";
            - Após executar o comando à cima com sucesso, a pasta do projeto "study-springboot" estrá criada.

3 - Com o repositório clonado na sua máquina, chegou a hora de abir o projeto em uma IDE, no meu caso vou dar o exemplo com a IDE VSCode;
        - Abra o VScode, vá até File/Arquivo;
        - Selecione a opção Open Folder/Abrir pasta;
        - Navegue até a pasta onde você clonou o repositório (item 2.2);
        - Dentro da pasta que você clonou o projeto deve esta a pasta "study-springboot", dê um clique para selecioná-la e clique no botão "Selecionar pasta", do lado inferiro direito;
        - Pronto, você agora esta com o projeto "study-springboot" aberto no VSCode;
        - Do lado esquerdo é possível ver a estrutura de pastas básicas de um projeto Springboot;

4 - Chegou a hora de rodar o projeto;
    
    - No VSCode, existem várias formas de "rodar/executar" o projeto. A forma mais prática é selecionar um arquivo, no nosso caso, com a extensão .java, e depois pressionar F5;
    - Na estrutura de pastas, do lado esquerdo, localize e vá brindo as pastar "src", "main" e depois "java";
    - Ao abrir a pasta "java", você deverá ver o arquivo "StudySpringbootApplication.java", dê um clique nele;
    - Agora com um arquivo de extensão .java selecionado você já consegue "rodar/executar" o projeto simplesmente pressionado a tecla F5.
    - Ainda com o arquivo de extensão .java selecionado, você consegue "rodar/executar" o projeto indo até o meni "Run/Rodar" e selecionar uma das duas primeiras opções: "Start debugging/Iniciar debug" "Run without debugging/Iniciar sem debug";
    -Para o Desafio 1 - Componentes e injeção de dependência,  tem uma função na classe StudySpringbootApplication.java que é iniciada automaticamente junto com o projeto, executando o cálculo com dados preestabelecidos. Para iserir novos dados de Pedido(Order), faça isso alterando os valores passados no constutor do objeto  "OrderDAO" que esta na linha 21 do arquivo StudySpringbootApplication.java. O resultado será exibido no console do terminal da aplicação.
    

