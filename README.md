# Client API Test em Springboot


#### Build Status
[![Maven Package](https://github.com/HelloWar75/springboot-client-test/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/HelloWar75/springboot-client-test/actions/workflows/maven-publish.yml)

### ETAPA 1: Como configurar o projeto
Para configurar o projeto precisa-se primeiramente editar o arquivo "application.properties" que se encontra em 
"src/main/resources/application.properties", configurando corretamente o banco de dados exemplo de arquivo 
configurado a seguir:

    ## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
    spring.datasource.url=jdbc:mysql://localhost:3306/NOME_DE_SEU_BANCO_DE_DADOS_MYSQL?useSSL=false
    spring.datasource.username=USUARIO_DE_SEU_BANCO_DE_DADOS
    spring.datasource.password=SENHA_DE_DEU_BANCO_DE_DADOS
    
    # Dialeto SQL melhorar o SQL gerado pelo Hibernate
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
    spring.jpa.hibernate.ddl-auto=update

### ETAPA 2: Criar o banco de dados
No meu exemplo usei o nome de springboot_api para o banco de dados mas você pode usar o nome que desejar, o comando
para criar o banco de dados no mysql ou mariadb é o seguinte:

    CREATE DATABASE springboot_api;

### ETAPA 3: Compilar e Empacotar o código
Para executar está etapa você precisa ter o JDK 11 instalado e Maven para efetuar o seguinte comando:

    mvn clean package

### ETAPA 4: Executar o JAR
Agora este passo é final para executar o jar você deve procurar a pasta "target" dentro do projeto e lá você ira 
encontrar o arquivo "clients-api-test-0.0.1-SNAPSHOT.jar" e executar o seguinte comando:

    java -jar clients-api-test-0.0.1-SNAPSHOT.jar

### ETAPA 5: Acessar o projeto
A partir deste momento o projeto está acessivel pelo seu navegador ou o insomnia a partir da URL http://localhost:8080

### Arquivos adicionais
Arquivo do Insomnia: springboot-api-Insomnia_2022-01-14.json

Link do vídeo de teste: https://youtu.be/xTdyrHSvIdY