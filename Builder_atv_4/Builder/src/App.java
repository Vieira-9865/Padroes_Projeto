public class App
{
    public static void main(String[] args) {
        PersonagemBuilder builder = new PersonagemBuilderImpl();

        Personagem guerreiro = new Director()
                .construirPersonagem(builder).construirNome("Guerreiro").construirClasse("Guerreiro")
                .construirNivel(5)
                .construirArma("Espada")
                .build();

        Personagem mago = new Director()
                .construirPersonagem(builder)
                .construirNome("Mago")
                .construirClasse("Mago")
                .construirNivel(3)
                .construirArma("Varinha")
                .build();

        System.out.println(guerreiro);
        System.out.println(mago);
    }
        }
        

    

