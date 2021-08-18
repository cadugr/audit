# Audit Application

Aplicação de exemplo sobre como utilizar auditoria de dados com Spring Data JPA.
Documentação [Spring Boot](http://projects.spring.io/spring-boot/) 

## Requerimentos:

Para construir e executar o aplicativo, você precisa:

- [JDK 11](https://openjdk.java.net/projects/jdk/11/)
- [Maven 3](https://maven.apache.org)

## Executando a aplicação localmente

Existem várias maneiras de executar um aplicativo Spring Boot em sua máquina local. Uma maneira é executar o método principal na classe com.audit.AuditApplication da sua IDE.

Como alternativa, você pode usar o plugin Spring Boot Maven da seguinte maneira:

```shell
mvn spring-boot:run
```
## Testando:

Via client, como o postman, acessar o endpoint /clientes:

#### POST http://localhost:8080/clientes

Informar um payload no formato json na requisição, algo como:

{
  "nome": "Informe aqui o seu nome"
}

No fim, checar se os campos de auditoria foram persistidos corretamente na tabela cliente.
