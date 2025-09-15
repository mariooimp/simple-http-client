# JavaSocketClient

Um cliente simples em Java que se conecta a um servidor via **Socket**, envia uma requisição HTTP básica e imprime a resposta recebida.

## 📌 Funcionalidades
- Solicita ao usuário um endereço (host) e porta.
- Conecta a um servidor através de **TCP/IP**.
- Envia um comando HTTP `GET /`.
- Lê e exibe a resposta linha por linha no console.

## 🛠 Tecnologias
- Java 8+
- Biblioteca padrão (`java.net.Socket`, `java.io.*`)
- `JOptionPane` para interação com o usuário

## ▶️ Como executar
1. Compile o projeto:
   ```bash
   javac principal.java
