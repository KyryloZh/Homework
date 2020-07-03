package Task5;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Title title1 = new Title();
        Author author1 = new Author();
        Content content1 = new Content();

        Scanner title = new Scanner(System.in);
        System.out.print("Please enter the book title: ");
        String bookTitle = title.nextLine();

        title1.setTitle(bookTitle);

        Scanner author = new Scanner(System.in);
        System.out.print("Please enter the book author: ");
        String bookAuthor = author.nextLine();

        author1.setAuthor(bookAuthor);

        Scanner content = new Scanner(System.in);
        System.out.print("Please enter the book content: ");
        String bookContent = content.nextLine();

        content1.setContent(bookContent);

        author1.show();
        title1.show();
        content1.show();
    }
}






   /* Використовуючи IDEA, створіть проект c пакетом.
        Потрібно: Створити клас Book. Створити класи Title, Author і Content, кожен з яких повинен
        містити одне строкове поле і метод void show (). Реалізуйте можливість додавання в книгу
        назви книги, імені автора і змісту. Виведіть на екран за допомогою методу show () назву
        книги, ім'я автора та зміст.*/