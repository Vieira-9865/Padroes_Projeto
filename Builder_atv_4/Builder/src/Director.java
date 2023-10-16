public class Director{
    public Personagem construirPersonagem(PersonagemBuilder builder){
        return builder.build();
    }
}