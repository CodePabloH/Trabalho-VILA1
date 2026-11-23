package inimigos;

import modelo.Combatente;
import modelo.Inimigo;

// Goblin: inimigo rápido e fraco, ataca duas vezes.
public class Goblin extends Inimigo {

    private int agilidade;  // atributo exclusivo

    public Goblin(String nome, int hp, int ataque, int defesa, int defesaMagica, int agilidade) {
        super(nome, hp, ataque, defesa, defesaMagica);
        this.agilidade = agilidade;
    }

    // Habilidade: Ataque Duplo (dois golpes seguidos)
    @Override
    public void usarHabilidade(Combatente alvo) {
        for (int i = 1; i <= 2; i++) {
            if (alvo.estaVivo()) {
                int dano = getAtaque() + agilidade / 2 - alvo.getDefesa();
                aplicarDano(alvo, dano, "Ataque Duplo (golpe " + i + ")");
            }
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("=== GOBLIN ===");
        exibirBasico();
        System.out.println("Agilidade: " + agilidade);
        System.out.println();
    }
}
