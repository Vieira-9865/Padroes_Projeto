public class Main {
    public static void main(String[] args) {
        
        Administrador admin = new Administrador("Admin Name", "admin@example.com", "Admin");

      
        Administrador adminClone = admin.clone();

        
        System.out.println("Admin Original: " + admin.getNome() + ", " + admin.getEmail() + ", " + admin.getCargo());
        System.out.println("Admin Clone: " + adminClone.getNome() + ", " + adminClone.getEmail() + ", " + adminClone.getCargo());
    }
}
