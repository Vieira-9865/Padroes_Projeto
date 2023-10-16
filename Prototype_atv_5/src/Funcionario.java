public class Funcionario extends Usuario {
    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    // Método de clonagem personalizado para Funcionario
    public Funcionario clone() {
        return new Funcionario(getNome(), getEmail(), cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
