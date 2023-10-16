public class Administrador extends Usuario {
    private String cargo;

    public Administrador(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    // Método de clonagem personalizado para Administrador
    public Administrador clone() {
        return new Administrador(getNome(), getEmail(), cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}