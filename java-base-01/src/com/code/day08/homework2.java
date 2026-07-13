package com.code.day08;
//1、 设计一个`LibraryBook`类，它应该包含以下属性：
//
//- `title`（书名）
//- `author`（作者）
//- `isbn`（ISBN号）
//- `available`（是否可借阅）
//
//提供无参和有参构造
//
//2、在测试类的主方法中，分别用无参和有参构造创建2个对象，并打印它们的详细信息
public class homework2 {
    public class LibraryBook {
        public String title;
        public String author;
        public String isbn;
        public boolean available;

        public LibraryBook() {
        }

        public LibraryBook(String title, String author, String isbn, boolean available) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.available = available;
        }
    }
    public static void main(String[] args) {
        LibraryBook book1 = new homework2().new LibraryBook();
        book1.title = "Java Programming";
        book1.author = "John Doe";
        book1.isbn = "1234567890";
        book1.available = true;

        LibraryBook book2 = new homework2().new LibraryBook("Python Programming", "Jane Smith", "0987654321", false);

        System.out.println("Book 1: " + book1.title + ", " + book1.author + ", " + book1.isbn + ", " + book1.available);
        System.out.println("Book 2: " + book2.title + ", " + book2.author + ", " + book2.isbn + ", " + book2.available);
    }
}
