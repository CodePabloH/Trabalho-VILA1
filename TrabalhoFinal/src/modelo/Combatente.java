package modelo;

// Classe base: tudo que é comum a personagens e inimigos fica aqui (evita repetição).
public abstract class Combatente {

    // Encapsulamento: atributos privados, acesso só por métodos
    private String nome;
    private int hp;
    private int ataque;
    private int defesa;

    // Construtor
    public Combatente(String nome, int hp, int ataque, int defesa) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    // Por padrão, a defesa mágica é igual à defesa comum.
    // Mago e Inimigo sobrescrevem este método (polimorfismo).
    public int getDefesaMagica() {
        return defesa;
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    // Diminui o HP (nunca abaixo de zero) e devolve o dano realmente sofrido.
    // O Guerreiro sobrescreve este método por causa do escudo.
    public int receberDano(int dano) {
        if (dano < 0) {
            dano = 0;
        }
        hp = hp - dano;
        if (hp < 0) {
            hp = 0;
        }
        return dano;
    }

    // Aplica o dano em um alvo e mostra o resultado na tela.
    protected void aplicarDano(Combatente alvo, int dano, String acao) {
        if (dano < 0) {
            dano = 0;
        }
        int danoReal = alvo.receberDano(dano);
        System.out.println(nome + " usa " + acao + " em " + alvo.getNome()
                + " e causa " + danoReal + " de dano.");
        System.out.println(alvo.getNome() + " ficou com " + alvo.getHp() + " HP.");
    }

    // Ataque básico: dano = ataque do atacante - defesa do defensor
    public void atacar(Combatente alvo) {
        aplicarDano(alvo, ataque - alvo.getDefesa(), "Ataque Basico");
    }

    // Cada classe tem sua própria habilidade especial
    public abstract void usarHabilidade(Combatente alvo);

    // Cada classe mostra seus próprios dados
    public abstract void exibirDados();

    // Mostra os dados gerais (usado pelos exibirDados das classes filhas)
    protected void exibirBasico() {
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
    }
}
