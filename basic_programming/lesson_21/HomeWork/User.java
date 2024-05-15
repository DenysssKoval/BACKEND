 public class User {
     private String login; // логин
     private String password; // пароль
     private String email; // электронная почта

     public User(String login, String password, String email) {
         this.login = login;
         this.password = password;
         this.email = email;
     }

     // геттеры и сеттеры для полей класса
     public String getLogin() {
         return login;
     }

     public void setLogin(String login) {
         this.login = login;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     // метод для изменения пароля
     public boolean changePassword(String oldPassword, String newPassword) {
         // проверяем, что старый пароль введен верно
         if (!password.equals(oldPassword)) {
             System.out.println("Ошибка: неверный старый пароль!");
             return false;
         }

         // проверяем, что новый пароль соответствует требованиям безопасности
         // например, что его длина не менее 8 символов
         if (newPassword.length() < 8) {
             System.out.println("Ошибка: новый пароль слишком короткий!");
             return false;
         }

         // если все проверки прошли успешно, меняем пароль
         password = newPassword;
         System.out.println("Пароль успешно изменен!");
         return true;
         // метод для получения пароля
         private String getPassword() {
             return password;

         }

     public static void main(String[] args) {
         // Создаем объект класса User
         User user = new User("my_login", "my_password", "my_email@example.com");



             // Получаем значения полей объекта
         System.out.println("Логин: " + user.getLogin());
         System.out.println("Пароль: " + user.getPassword()); // пароль не доступен извне
         System.out.println("Email: " + user.getEmail());

         // Меняем пароль
         user.changePassword("my_password", "new_password"); // успешно
         user.changePassword("wrong_password", "new_password"); // ошибка
         user.changePassword("my_password", "short"); // ошибка

         // Получаем новое значение пароля
         System.out.println("Новый пароль: " + user.getPassword()); // пароль не доступен извне
     }



 }
