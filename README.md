# EM PRODUÇÃO 🛠️
# ⚔️ BleachBattleSimulator

Simulador de batalha por turnos em **Java puro**, inspirado no universo de *Bleach*. O projeto explora modelagem orientada a objetos e máquina de estados — sem depender de frameworks como Spring.

## 🎯 Sobre o projeto

Diferente de um simulador simplório que só sorteia um vencedor, neste projeto a vitória não é por acaso: cada personagem tem vida (HP), energia espiritual (Reiatsu) e um conjunto de habilidades com custo e cooldown próprios. O combate é resolvido turno a turno, com um log detalhado de cada ação.

## 🧱 Arquitetura

O projeto segue uma separação de responsabilidades inspirada em convenções comuns de frameworks, adaptada para Java puro:

```
src/
├── model/      → Personagem, Habilidade e demais classes de domínio
├── engine/     → Motor de batalha e loop de turnos
└── Main.java   → Ponto de entrada da aplicação
```

## ✨ Funcionalidades

- [ ] Modelagem de `Personagem` (HP, Reiatsu, habilidades)
- [ ] Motor de batalha por turnos (Camada 1)
- [ ] Sistema de habilidades com custo e cooldown (Camada 2)
- [ ] Máquina de estados para transformações (Selado → Shikai → Bankai)
- [ ] Aleatoriedade controlada (esquiva, variação de dano)
- [ ] Interface gráfica em JavaFX (fase futura, após validar a lógica no console)

## 🚀 Como rodar

1. Clone o repositório
2. Abra o projeto no IntelliJ (ou sua IDE de preferência) com um JDK configurado
3. Execute a classe `Main`

## 🛠️ Tecnologias

- Java puro (sem frameworks) — foco em orientação a objetos e modelagem de estado

## 📌 Status

Projeto em desenvolvimento. 
Fase atual: construção do motor de batalha básico (Camada 1) antes de adicionar habilidades, transformações e interface gráfica.

## 📄 Licença

Este é um projeto pessoal de estudo e portfólio.
