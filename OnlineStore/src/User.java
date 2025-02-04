public class User {

    // Поля, обозначающие логин и пароль
    protected String username;
    protected String password;
    protected String email;



    // Конструктор класса User
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Геттеры
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() { return email; }
    // Метод логина
    public void login() {
        System.out.println("Юзер '" + username + "' залогинился.");
    }

    /*
     * Обрати внимание на область видимости:
     * - Поля у нас protected, чтобы подклассы (наследники) могли их видеть.
     * - Если сделать private, то в AdminUser не будет прямого доступа.
     */
}
