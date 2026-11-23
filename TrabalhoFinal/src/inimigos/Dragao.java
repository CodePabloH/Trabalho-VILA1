package inimigos;

import modelo.Combatente;
import modelo.Inimigo;

// Dragao: inimigo forte, muito HP e ataque de fogo.
public class Dragao extends Inimigo {

    private int poderDeFogo;  // atributo exclusivo

    public Dragao(String nome, int hp, int ataque, int defesa, int defesaMagica, int poderDeFogo) {
        super(nome, hp, ataque, defesa, defesaMagica);
        this.poderDeFogo = poderDeFogo;
    }

    // Habilidade: Sopro de Fogo (dano mágico, usa a defesa mágica do alvo)
    @Override
    public void usarHabilidade(Combatente alvo) {
        int dano = poderDeFogo - alvo.getDefesaMagica();
        aplicarDano(alvo, dano, "Sopro de Fogo");
    }

    @Override
    public void exibirDados() {
        System.out.println("=== DRAGAO ===");
        exibirBasico();
        System.out.println("Poder de Fogo: " + poderDeFogo);
        System.out.println();
    }
}
