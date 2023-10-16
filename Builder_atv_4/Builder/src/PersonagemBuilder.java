public interface PersonagemBuilder {

    public PersonagemBuilder construirNome(String nome);
    public PersonagemBuilder construirClasse(String classe);
    public PersonagemBuilder construirNivel(int nivel);
    public PersonagemBuilder construirArma(String arma);
    public Personagem build();
}