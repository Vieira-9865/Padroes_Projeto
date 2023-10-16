class Main {
    public static void main(String[] args) {
        PersonagemBuilder builder = new PersonagemBuilderImpl();
        Director director = new Director();

        Personagem guerreiro = director
            .construirPersonagem(builder
                .construirNome("Guerrilson")
                .construirClasse("Guerreiro")
                .construirNivel(10)
                .construirArma("Espada"));

        Personagem mago = director
            .construirPersonagem(builder
                .construirNome("Mágico Maluco")
                .construirClasse("Mago")
                .construirNivel(5)
                .construirArma("Varinha"));

        System.out.println(guerreiro);
        System.out.println(mago);
    }
}
