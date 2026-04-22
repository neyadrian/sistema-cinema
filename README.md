# 🎬 Sistema de Gerenciamento de Assentos de Cinema

## 📌 Contexto do Sistema
Este projeto tem como objetivo desenvolver um sistema simples para gerenciar os assentos de uma sala de cinema utilizando matrizes e conceitos de Programação Orientada a Objetos.

---

## 🧱 Estrutura do Projeto

```

src/
└── src/
├── Cinema.java
└── Main.java

```

---

## ⚙️ Funcionalidades

- Representação da sala de cinema com matriz 10x10  
- Assentos iniciam como livres ("-")  
- Reserva de assentos pelo usuário  
- Validação de assento ocupado  
- Exibição do mapa de assentos atualizado  

---

## 🧩 Requisitos do Sistema

### 1) Estrutura da Sala
- Utilizar uma matriz (10x10) de `char` ou `String`
- Assentos livres representados por "-"
- Assentos ocupados representados por "X"

---

### 2) Entrada do Usuário
- Utilizar `Scanner`
- Usuário informa:
  - Fileira
  - Poltrona

---

### 3) Regra de Negócio
- Se o assento estiver ocupado:
  - Informar ao usuário
  - Solicitar nova entrada
- Se estiver livre:
  - Marcar como ocupado ("X")

---

### 4) Orientação a Objetos

#### Classe Cinema
- Atributo:
  - `private char[][] sala`
- Métodos:
  - `reservar(int fileira, int cadeira)`
  - `mostrarMapa()`

---

### 5) Classe Principal
- Criar objeto da classe `Cinema`
- Permitir interação com o usuário
- Exibir mapa atualizado após reservas

---

## 🔐 Encapsulamento

- Matriz de assentos como atributo privado  
- Manipulação apenas através de métodos da classe  

---

## 🧠 Estruturas Utilizadas

- Matrizes (array bidimensional)  
- Scanner  
- Classe e objetos  

---

## 📚 Tecnologias Utilizadas

- Java  

---

## 👨‍💻 Autor
Ney Adrian

---
Projeto desenvolvido para fins acadêmicos.
