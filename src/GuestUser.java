public class GuestUser extends User{
    private String role;
    public GuestUser(String username, String email) {
        super(username, "0", email);
        this.role = "Guest";
    }
    @Override
    public void login() {
        // Используем логику родителя
        super.login();
        // Добавляем дополнительное поведение
        System.out.println("Пользователь зашел с гостевого аккаунта: " + getUsername());
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
