# Automação com Selenium e Java 21

Este projeto demonstra como configurar e executar testes de automação web utilizando Selenium com Java 21.

## 📋 **Pré-requisitos**

Certifique-se de ter os seguintes itens instalados no seu ambiente:

- **Java 21:** [Download](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- **Maven:** [Download](https://maven.apache.org/download.cgi)
- ***Usaremos o webManager para gerenciar os Drivers.***

## 🚀 Como baixar e executar o projeto

**1. Clone este repositório**

   ```
   git clone https://github.com/rafaellopezsouza/capgemini.git
   ```

**2. Compile e execute os testes**  
Instale as dependências e compile o projeto. Na raiz do projeto correr o comando:

   ```
   mvn clean install
   ```
**3.Executar os Testes**
Correr via IDE, selecionar current file no *featureFile.feature*, e executar o *Run*.

## 🛠 Estrutura do projeto
src/main/java: Código principal.  
src/test/java/resources/features: Ficheiros FeatureFile.  
src/screenshots: Capturas de tela geradas pelos testes.

## 📂 Onde encontrar os resultados?
As capturas de tela dos testes serão salvas automaticamente no diretório src/screenshots/.  
***Configurar HTML Exports Alure (Faltando)***