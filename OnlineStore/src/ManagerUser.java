public class ManagerUser extends User {
    private String role;

    public ManagerUser(String username, String password, String email) {
        super(username, password, email);
        this.role = "Manager";
    }

   /* public ManagerUser(String role) {
        this.role = role;
    }*/
    @Override
    public void login() {
        // Используем логику родителя
        super.login();
        // Добавляем дополнительное поведение
        System.out.println("Пользователь с ролью Manager залогинился: " + username);
        System.out.println("Его почта: " + email);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}