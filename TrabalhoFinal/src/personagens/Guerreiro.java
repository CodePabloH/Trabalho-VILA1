package personagens;

import modelo.Combatente;
import modelo.Personagem;

// Guerreiro: muito HP e muita defesa.
public class Guerreiro extends Personagem {

    private int forca;   // atributo exclusivo 1
    private int escudo;  // atributo exclusivo 2 (reduz todo dano recebido)

    public Guerreiro(String nome, int hp, int ataque, int defesa, int forca, int escudo) {
        super(nome, hp, ataque, defesa);
        this.forca = forca;
        this.escudo = escudo;
    }

    // O escudo diminui o dano que o Guerreiro recebe
    @Override
    public int receberDano(int dano) {
        return super.receberDano(dano - escudo);
    }

    // Habilidade: ataque com dano adicional (usa a força)
    @Override
    public void usarHabilidade(Combatente alvo) {
        int dano = getAtaque() + forca * 2 - alvo.getDefesa();
        aplicarDano(alvo, dano, "Golpe Poderoso");
    }

    @Override
    public void exibirDados() {
        System.out.println("=== GUERREIRO ===");
        exibirBasico();
        System.out.println("Forca: " + forca);
        System.out.println("Escudo: " + escudo);
        System.out.println();
    }
}
