public class GuestUser extends User{
    private String role;
    public GuestUser(String username, String password, String email) {
        super(username, "0", "0");
        this.role = "Guest";
    }
    @Override
    public void login() {
        // Используем логику родителя
        super.login();
        // Добавляем дополнительное поведение
        System.out.println("Пользователь зашел с гостевого аккаунта: " + username);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    /*
     * ДЗ 3 (творческое):
     * 1) Создай класс GuestUser (гость), наследующий User.
     *    У GuestUser может не быть пароля (придумай, как это обыграть в коде).
     * 2) Переопредели login(), чтобы выводить, что гость зашёл как временный пользователь.
     * 3) Продумай, стоит ли иметь отдельное поле "role" или, например, enum "UserRole" и т.д.
     */
}
