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

## ⚡ Como Executar
### Pré-requisitos:
Certifique-se de ter **Java 11** e **Maven** instalados:
```sh
java -version
mvn -version
```

### 1️⃣ Clonar o Repositório
```sh
git clone https://github.com/seu-usuario/challenge.git
cd challenge
```

### 2️⃣ Compilar e Executar
```sh
mvn clean compile
mvn exec:java -Dexec.mainClass="com.fmcamara.App"
```

### 3️⃣ Rodar Testes
```sh
mvn test
```

### 4️⃣ Gerar e Rodar o JAR
```sh
mvn package
java -jar target/challenge-1.0-SNAPSHOT.jar
```

## 🛠 Funcionalidades
### 1️⃣ Cálculo de Soma
O programa calcula a soma dos números de 1 até 13:
```java
int INDICE = 13, SOMA = 0, K = 0;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
```
Saída esperada:
```
91
```

### 2️⃣ Sequência de Fibonacci
O programa verifica se um número pertence à sequência de Fibonacci.

Exemplo:
```sh
Entrada: 21
Saída: "O número 21 pertence à sequência de Fibonacci."
```

### 3️⃣ Análise de Faturamento
O programa analisa um vetor de faturamento diário e retorna:
- Menor faturamento do mês.
- Maior faturamento do mês.
- Quantidade de dias em que o faturamento foi superior à média mensal.

### 4️⃣ Percentual de Faturamento por Estado
Valores de faturamento mensal:
- **SP** – R$67.836,43
- **RJ** – R$36.678,66
- **MG** – R$29.229,88
- **ES** – R$27.165,48
- **Outros** – R$19.849,53

O programa calcula o percentual de cada estado em relação ao total.

Saída esperada:
```
SP representa 37.53% do faturamento total
RJ representa 20.29% do faturamento total
MG representa 16.17% do faturamento total
ES representa 15.03% do faturamento total
Outros representa 10.98% do faturamento total
```

### 5️⃣ Inversão de String
O programa inverte uma string sem usar funções prontas:

Entrada:
```sh
"Java Spring Boot"
```
Saída esperada:
```sh
"tooB gnirpS avaJ"
```

## 📄 Licença
Este projeto é open-source e está disponível sob a licença [MIT](LICENSE).

