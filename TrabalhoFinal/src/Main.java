import batalha.Batalha;
import inimigos.Dragao;
import inimigos.Goblin;
import personagens.Arqueiro;
import personagens.Guerreiro;
import personagens.Mago;

// Classe principal: cria os objetos, mostra os dados e executa as batalhas.
public class Main {

    public static void main(String[] args) {

        // Personagens (nome, hp, ataque, defesa, exclusivo 1, exclusivo 2)
        Guerreiro guerreiro = new Guerreiro("Thor", 120, 18, 10, 8, 3);
        Mago mago = new Mago("Merlin", 70, 14, 4, 40, 12);
        Arqueiro arqueiro = new Arqueiro("Legolas", 85, 20, 5, 10, 15);

        // Inimigos (nome, hp, ataque, defesa, defesa magica, exclusivo)
        Goblin goblin = new Goblin("Goblin Verde", 60, 14, 4, 2, 6);
        Goblin goblinChefe = new Goblin("Goblin Chefe", 80, 16, 6, 4, 8);
        Dragao dragao = new Dragao("Dragao Vermelho", 120, 20, 12, 8, 28);

        // Exibição dos dados (cada objeto mostra suas características)
        System.out.println("########## PERSONAGENS ##########");
        System.out.println();
        guerreiro.exibirDados();
        mago.exibirDados();
        arqueiro.exibirDados();

        System.out.println("########## INIMIGOS ##########");
        System.out.println();
        goblin.exibirDados();
        goblinChefe.exibirDados();
        dragao.exibirDados();

        // Batalhas
        new Batalha(guerreiro, goblin).iniciar();
        new Batalha(mago, dragao).iniciar();
        new Batalha(arqueiro, goblinChefe).iniciar();
    }
}
