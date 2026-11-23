# Trabalho Final - Técnicas de Programação (Java)

Sistema de jogo com personagens, inimigos e batalha.

## Estrutura de pastas

```
TrabalhoFinal/
├── src/
│   ├── Main.java                 -> programa principal (cria objetos e roda as batalhas)
│   ├── modelo/                   -> classes base (herança)
│   │   ├── Combatente.java       -> atributos e métodos comuns a todos
│   │   ├── Personagem.java       -> base dos personagens do jogador
│   │   └── Inimigo.java          -> base dos inimigos (adiciona defesa mágica)
│   ├── personagens/              -> Guerreiro, Mago, Arqueiro
│   ├── inimigos/                 -> Goblin, Dragao
│   └── batalha/
│       └── Batalha.java          -> sistema de batalha por turnos
├── docs/
│   └── Explicacao_do_Codigo.pdf  -> explicação do código para a apresentação
├── compilar_e_executar.bat       -> Windows
└── compilar_e_executar.sh        -> Linux / Mac
```

## Como executar

- **Windows:** dê dois cliques em `compilar_e_executar.bat`.
- **Linux/Mac:** `./compilar_e_executar.sh`
- **Manual** (dentro da pasta TrabalhoFinal):

```
mkdir out
javac -d out src/Main.java src/modelo/*.java src/personagens/*.java src/inimigos/*.java src/batalha/*.java
java -cp out Main
```

Precisa do JDK instalado (Java 8 ou superior).
Também funciona em IDEs (Eclipse, IntelliJ, VS Code): abra a pasta `src` como pasta de código-fonte e execute a `Main`.

## Desafio adicional escolhido

Desafio 1 - Habilidades especiais (a cada 3 turnos o combatente usa sua habilidade).
