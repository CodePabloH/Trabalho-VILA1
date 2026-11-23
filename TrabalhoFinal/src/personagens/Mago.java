package personagens;

import modelo.Combatente;
import modelo.Personagem;

// Mago: pouco HP, boa defesa mágica e ataques mágicos.
public class Mago extends Personagem {

    private int mana;          // atributo exclusivo 1
    private int defesaMagica;  // atributo exclusivo 2

    public Mago(String nome, int hp, int ataque, int defesa, int mana, int defesaMagica) {
        super(nome, hp, ataque, defesa);
        this.mana = mana;
        this.defesaMagica = defesaMagica;
    }

    @Override
    public int getDefesaMagica() {
        return defesaMagica;
    }

    // Habilidade: Bola de Fogo (gasta 10 de mana, ignora a defesa comum e usa a defesa mágica do alvo)
    @Override
    public void usarHabilidade(Combatente alvo) {
        if (mana >= 10) {
            mana = mana - 10;
            int dano = getAtaque() * 3 - alvo.getDefesaMagica();
            aplicarDano(alvo, dano, "Bola de Fogo");
        } else {
            System.out.println(getNome() + " esta sem mana!");
            atacar(alvo);
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("=== MAGO ===");
        exibirBasico();
        System.out.println("Mana: " + mana);
        System.out.println("Defesa Magica: " + defesaMagica);
        System.out.println();
    }
}
