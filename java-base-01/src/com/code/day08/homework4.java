package com.code.day08;
//1、 设计一个`LibraryBook`类，
//
//- 它应该包含以下属性：
//
//  - `title`（书名）
//
//  - `author`（作者）
//
//  - `isbn`（ISBN号）
//
//  - `available`（是否可借阅）
//
//
//- 提供无参和有参构造
//- 所有属性私有化
//- 提供get/set方法
//- 提供返回图书详细信息的getInfo方法
//- 提供方法来借书（`borrowBook`）和还书（`returnBook`），同时确保图书的状态正确更新。
//
//2、在测试类的主方法中，分别用无参和有参构造创建2个对象，并打印它们的详细信息，并尝试对其中一本书调用借书和还书的方法，并测试打印信息。
public class homework4 {
    public class LibraryBook {
        private String title;
        private String author;
        private String isbn;
        private boolean available;
        //构造器
        //无参构造
        public LibraryBook() {
        }

        //有参构造
        public LibraryBook(String title, String author, String isbn, boolean available) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.available = available;
        }
        //get/set方法
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        public boolean isAvailable() {
            return available;
        }
        public void setAvailable(boolean available) {
            this.available = available;
        }
        //返回图书详细信息的getInfo方法
        public String getBookInfo() {
            return "LibraryBook{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", available=" + available +
                    '}';
        }
        //提供方法来借书（`borrowBook`）和还书（`returnBook`），同时确保图书的状态正确更新。
        public void borrowBook() {
            if (available) {
                available = false;
                System.out.println("You have borrowed the book.");
                //可以借阅
            } else {
                //书不可借阅
                System.out.println("The book is not available.");
            }
        }
        public void returnBook() {
            available = true;
            //可以还书
            System.out.println("You have returned the book.");
        }
        public void printBookInfo() {
            System.out.println("图书名称: " + title);
            System.out.println("作者: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("是否可借阅: " + available);
        }
    }
    public static void main(String[] args) {
        LibraryBook b1 = new homework4().new LibraryBook();
        b1.setTitle("《剑指Java》");
        b1.setAuthor( "尚硅谷");
        b1.setIsbn("978-7-121-48021-8");
        b1.setAvailable(true);
        System.out.println("b1对象信息：" + b1.getBookInfo());
        System.out.println("借书后....");
        if (b1.isAvailable()) {
            System.out.println("借书成功.");
        }else {
            System.out.println("借书失败");
            System.out.println("b1对象信息：" + b1.getBookInfo());
        }
        System.out.println("还书后...");
        b1.returnBook();
        System.out.println("b1对象信息：" + b1.getBookInfo());

        LibraryBook b2 = new homework4().new LibraryBook("java从入门到放弃", "詹姆斯.高斯林", "978-7-121-48021-9", true);
        System.out.println("b2对象信息：" + b2.getBookInfo());
    }

}
