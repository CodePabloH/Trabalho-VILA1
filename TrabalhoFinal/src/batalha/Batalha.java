package batalha;

import modelo.Combatente;
import modelo.Inimigo;
import modelo.Personagem;

// Controla a batalha entre um personagem e um inimigo.
public class Batalha {

    private Personagem personagem;
    private Inimigo inimigo;

    public Batalha(Personagem personagem, Inimigo inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    public void iniciar() {
        System.out.println("##### BATALHA: " + personagem.getNome() + " VS " + inimigo.getNome() + " #####");
        System.out.println();

        int turno = 1;
        while (personagem.estaVivo() && inimigo.estaVivo()) {
            System.out.println("--- Turno " + turno + " ---");

            // Personagem ataca primeiro
            agir(personagem, inimigo, turno);

            // Inimigo só ataca se ainda estiver vivo
            if (inimigo.estaVivo()) {
                agir(inimigo, personagem, turno);
            }

            System.out.println();
            turno++;
        }

        if (personagem.estaVivo()) {
            System.out.println(">>> VENCEDOR: " + personagem.getNome() + "!");
        } else {
            System.out.println(">>> VENCEDOR: " + inimigo.getNome() + "!");
        }
        System.out.println();
    }

    // A cada 3 turnos usa a habilidade especial; nos outros, ataque básico.
    // Polimorfismo: funciona para qualquer tipo de Combatente.
    private void agir(Combatente atacante, Combatente alvo, int turno) {
        if (turno % 3 == 0) {
            atacante.usarHabilidade(alvo);
        } else {
            atacante.atacar(alvo);
        }
    }
}
