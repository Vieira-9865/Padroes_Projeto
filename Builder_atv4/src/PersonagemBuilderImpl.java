public class PersonagemBuilderImpl implements PersonagemBuilder {
    private String nome;
    private String classe;
    private int nivel;
    private String arma;

    

    @Override
    public PersonagemBuilder construirNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PersonagemBuilder construirClasse(String classe) {
        this.classe = classe;
        return this;
    }

    @Override
    public PersonagemBuilder construirNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    @Override
    public PersonagemBuilder construirArma(String arma) {
        this.arma = arma;
        return this;
    }

    @Override
    public Personagem build() {
        return new Personagem(nome, classe, nivel, arma);
    }
}
