# Desafio - Java 11

## 📌 Descrição
Este projeto é um desafio implementado em **Java 11** e **Maven**. Ele contém soluções para os seguintes problemas:

1. **Cálculo de soma** de uma sequência numérica.
2. **Verificação de número na sequência de Fibonacci**.
3. **Análise de faturamento diário** de uma distribuidora.
4. **Cálculo do percentual de faturamento por estado**.
5. **Inversão de strings sem funções prontas**.

## 🚀 Tecnologias Utilizadas
- **Java 11**
- **Maven** (Gerenciamento de dependências)
- **JUnit 5** (Testes unitários)

## 📂 Estrutura do Projeto
```
challenge/
├── src/
│   ├── main/
│   │   ├── java/com/fmcamara/
│   │   │   ├── App.java
│   │   │   ├── service/
│   │   │   │   ├── ChallengerSolverService.java
│   ├── test/
│   │   ├── java/com/fmcamara/
│   │   │   ├── ChallengerSolverServiceTest.java
│
├── pom.xml
└── README.md
```

## Como Executar
### Pré-requisitos:
Certifique-se de ter **Java 11** e **Maven** instalados:
```sh
java -version
mvn -version
```


### 1️ Clonar o Repositório
```sh
git clone https://github.com/seu-usuario/challenge.git
cd challenge
```

### 2️ Compilar e Executar
```sh
mvn clean compile
mvn exec:java -Dexec.mainClass="com.fmcamara.App"
```

Alternativamente você poderia utilizar o Docker para ver o projeto:

``` sh
docker build -t challenge-tests .
docker run --rm challenge-tests

```

### 3️ Rodar Testes
```sh
mvn test
```

### 4️ Gerar e Rodar o JAR
```sh
mvn package
java -jar target/challenge-1.0-SNAPSHOT.jar
```

## Requisitos do Challenge
### 1️ Cálculo de Soma
O programa calcula a soma dos números de 1 até 13

### 2️ Sequência de Fibonacci
O programa verifica se um número pertence à sequência de Fibonacci.


### 3️ Análise de Faturamento
O programa analisa um vetor de faturamento diário e retorna:
- Menor faturamento do mês.
- Maior faturamento do mês.
- Quantidade de dias em que o faturamento foi superior à média mensal.

### 4️ Percentual de Faturamento por Estado
Valores de faturamento mensal:
- **SP** – R$67.836,43
- **RJ** – R$36.678,66
- **MG** – R$29.229,88
- **ES** – R$27.165,48
- **Outros** – R$19.849,53

O programa calcula o percentual de cada estado em relação ao total.

### 5️ Inversão de String
O programa inverte uma string sem usar funções prontas:


## Licença
Este projeto é open-source e está disponível sob a licença [MIT](LICENSE).

