public interface PersonagemBuilder {
    PersonagemBuilder construirNome(String nome);
    PersonagemBuilder construirClasse(String classe);
    PersonagemBuilder construirNivel(int nivel);
    PersonagemBuilder construirArma(String arma);
    Personagem build();
}
