package modelo;

// Inimigos do jogo (Goblin, Dragao). Todo inimigo possui defesa mágica.
public abstract class Inimigo extends Combatente {

    private int defesaMagica;

    public Inimigo(String nome, int hp, int ataque, int defesa, int defesaMagica) {
        super(nome, hp, ataque, defesa);
        this.defesaMagica = defesaMagica;
    }

    @Override
    public int getDefesaMagica() {
        return defesaMagica;
    }

    @Override
    protected void exibirBasico() {
        super.exibirBasico();
        System.out.println("Defesa Magica: " + defesaMagica);
    }
}
