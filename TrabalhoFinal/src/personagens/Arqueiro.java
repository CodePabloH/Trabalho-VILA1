package personagens;

import modelo.Combatente;
import modelo.Personagem;

// Arqueiro: ataque à distância, grande ataque e pouca defesa.
public class Arqueiro extends Personagem {

    private int flechas;  // atributo exclusivo 1
    private int alcance;  // atributo exclusivo 2

    public Arqueiro(String nome, int hp, int ataque, int defesa, int flechas, int alcance) {
        super(nome, hp, ataque, defesa);
        this.flechas = flechas;
        this.alcance = alcance;
    }

    // Habilidade: Tiro Certeiro (gasta 1 flecha e ignora a defesa do alvo)
    @Override
    public void usarHabilidade(Combatente alvo) {
        if (flechas > 0) {
            flechas = flechas - 1;
            int dano = getAtaque() + alcance;
            aplicarDano(alvo, dano, "Tiro Certeiro");
        } else {
            System.out.println(getNome() + " esta sem flechas!");
            atacar(alvo);
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("=== ARQUEIRO ===");
        exibirBasico();
        System.out.println("Flechas: " + flechas);
        System.out.println("Alcance: " + alcance);
        System.out.println();
    }
}
