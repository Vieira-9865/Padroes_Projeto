public class PersonagemBuilderImpl implements PersonagemBuilder{
    Personagem p;
    public PersonagemBuilderImpl(){
        this.p = new Personagem();
            
    }
            @Override
            public PersonagemBuilder construirNome(String nome) {
                p.setNome(nome);
                return this;
            }

            @Override
            public PersonagemBuilder construirClasse(String classe) {
                p.setClasse(classe);
                return this;
            }

            @Override
            public PersonagemBuilder construirNivel(int nivel) {
                p.setNivel(nivel);
                return this;
            }

            @Override
            public PersonagemBuilder construirArma(String arma) {
                p.setArma(arma);
                return this;
            }

            @Override
            public Personagem build() {
                return p;
            }
        }



