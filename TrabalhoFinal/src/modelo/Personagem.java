package modelo;

// Personagens controlados pelo jogador (Guerreiro, Mago, Arqueiro).
public abstract class Personagem extends Combatente {

    public Personagem(String nome, int hp, int ataque, int defesa) {
        super(nome, hp, ataque, defesa);
    }
}
