package code.HomeWork.Task6;

public class Book {
    private String author;
    private String title;
    private int numPages;
    private int catalogNumber;
    private boolean isOnShelf;

    // Конструктор для создания книги с автором и названием
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // Конструктор для создания книги со всеми параметрами
    public Book(String author, String title, int numPages, int catalogNumber, boolean isOnShelf) {
        this.author = author;
        this.title = title;
        this.numPages = numPages;
        this.catalogNumber = catalogNumber;
        this.isOnShelf = isOnShelf;
    }

    // Метод для редактирования книги
    public void editBook(int catalogNumber, int numPages, boolean isOnShelf) {
        this.catalogNumber = catalogNumber;
        this.numPages = numPages;
        this.isOnShelf = isOnShelf;
    }

    // Метод для вывода подробной информации о книге
    public void displayBookInfo() {
        System.out.println("Автор: " + author);
        System.out.println("Название: " + title);
        System.out.println("Количество страниц: " + numPages);
        System.out.println("Номер каталога: " + catalogNumber);
        System.out.println("Книга находится: " + (isOnShelf ? "в хранилище" : "на руках"));
    }

    // Статический метод для создания новой книги только с автором и названием
    public static Book createNewBook(String author, String title) {
        return new Book(author, title);
    }

    // Статический метод для создания новой книги со всеми параметрами
    public static Book createNewBook(String author, String title, int numPages, int catalogNumber, boolean isOnShelf) {
        return new Book(author, title, numPages, catalogNumber, isOnShelf);
    }

    public static void main(String[] args) {
        // Пример использования методов
        Book book1 = Book.createNewBook("Л. Толстой", "Война и мир");
        book1.editBook(12345, 1225, true);

        Book book2 = Book.createNewBook("Ф. Достоевский", "Преступление и наказание", 672, 24680, false);

        book1.displayBookInfo();
        System.out.println("-------------");
        book2.displayBookInfo();
    }

}
