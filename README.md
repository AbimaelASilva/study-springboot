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
### 1. Pré-requisitos:
- Tenha instalado/configurado em seu SO:
    - **Java 17**:
        - [Windows](https://www.youtube.com/watch?v=QekeJBShCy4)
        - [Linux](https://www.youtube.com/watch?v=iHZ4b1twvlg)
        - [MacOS](https://www.youtube.com/watch?v=SdKIBGnkhDY)
        - Configuração manual de variáveis de ambiente: [Tutorial](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26)
    - **IDE de sua preferência**:
        - [VSCode](https://code.visualstudio.com/Download)
        - [IntelliJ](https://www.jetbrains.com/idea/download/?section=windows)
    - **Git**:
        - [Download](https://git-scm.com/downloads/)

### 2. Clonar o repositório do projeto:
- Existem várias formas de clonar um repositório Git, seguem alguns links úteis:
    - [Documentação GitHub](https://docs.github.com/pt/repositories/creating-and-managing-repositories/cloning-a-repository)
    - [Vídeo tutorial](https://www.youtube.com/watch?v=WEPB5pDSEIg)

#### Passos para clonar o repositório no Windows:
1. Escolha a pasta onde você deseja salvar o projeto.
2. Navegue até essa pasta.
3. Clique com o botão direito do mouse em uma área vazia da pasta e selecione "Abrir no terminal".
4. Execute o comando `git clone git@github.com:AbimaelASilva/study-springboot.git`.
5. Após executar o comando com sucesso, a pasta do projeto "study-springboot" será criada.

### 3. Abrir o projeto em uma IDE (Exemplo: VSCode):
1. Abra o VSCode e vá até `File/Arquivo`.
2. Selecione `Open Folder/Abrir pasta`.
3. Navegue até a pasta onde você clonou o repositório.
4. Selecione a pasta "study-springboot" e clique em `Selecionar pasta`.
5. Agora o projeto "study-springboot" está aberto no VSCode.
6. No lado esquerdo, você pode ver a estrutura básica de pastas de um projeto Spring Boot.

### 4. Rodar o projeto:
1. No VSCode, selecione um arquivo `.java` e pressione `F5`.
2. Navegue até `src/main/java`.
3. Abra o arquivo `StudySpringbootApplication.java`.
4. Com o arquivo `.java` aberto, você pode rodar o projeto pressionando `F5` ou indo em `Run/Rodar` e selecionando "Start debugging/Iniciar debug" ou "Run without debugging/Iniciar sem debug".
5. Para o Desafio 1 - Componentes e Injeção de Dependência, há uma função na classe `StudySpringbootApplication.java` que é iniciada automaticamente junto com o projeto, executando o cálculo com dados preestabelecidos. Para inserir novos dados de Pedido (Order), altere os valores no construtor do objeto `OrderDAO` na linha 21 do arquivo `StudySpringbootApplication.java`. O resultado será exibido no console do terminal da aplicação.
