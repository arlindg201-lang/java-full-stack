package com.code.day10;
//## 1、书籍类（抽象类与继承）
//
//（1）声明一个书籍`Book`类，抽象类
//
//- 包含属性：书名 `name`，价格 `price`，出版社 `publisher`
//- 包含无参和有参构造，get/set方法
//- 重写`hashCode`和`equals`方法
//- 重写`toString`方法，返回“名称：xx，价格：xx”
//
//（2）声明一个小说`Note`类
//
//- 新增属性： 类别 `type`，作者 `author`
//- 包含无参和有参构造，get/set方法
//- 重写`hashCode`和`equals`方法
//- 重写`toString`方法，返回“小说名称：xx，价格：xx，类别：xx，作者：xx”
//
//（3）声明一个杂志`Magazine`类
//
//- 包含属性：主题` title`，期号 `issueNumber` ，年份 `year`
//- 包含无参和有参构造，get/set方法
//- 重写`hashCode`和`equals`方法
//- 重写`toString`方法，返回 “杂志名称：xx，价格：xx，主题：xx，期号：xx，年份：xx”
//
//（4）测试类
//
//- 创建两个小说对象，输出小说对象，调用两个小说对象的equals方法
//- 创建两个杂志对象，输出杂志对象，调用两个杂志对象的equals方法
import java.util.Objects;

public class homework4 {
    public abstract class Book {
        private String name;
        private double price;
        private String publisher;

        public Book() {
        }

        public Book(String name, double price, String publisher) {
            this.name = name;
            this.price = price;
            this.publisher = publisher;
        }

        // Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Book book = (Book) o;

            if (Double.compare(book.price, price) != 0) {
                return false;
            }
            if (!Objects.equals(name, book.name)) {
                return false;
            }
            return Objects.equals(publisher, book.publisher);
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = name != null ? name.hashCode() : 0;
            temp = Double.doubleToLongBits(price);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "名称：《" + name + "》，价格：" + price;
        }
    }

    public class Novel extends Book {
        private String type;
        private String author;

        public Novel() {
        }

        public Novel(String name, double price, String publisher, String type, String author) {
            super(name, price, publisher);
            this.type = type;
            this.author = author;
        }

        // Getter and Setter methods
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }

            Novel novel = (Novel) o;

            if (!Objects.equals(type, novel.type)) {
                return false;
            }
            return Objects.equals(author, novel.author);
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (type != null ? type.hashCode() : 0);
            result = 31 * result + (author != null ? author.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "小说" + super.toString() + "，类别：" + type + "，作者：" + author;
        }
    }

    public class Magazine extends Book {
        private int issueNumber;
        private int year;

        public Magazine() {
        }

        public Magazine(String name, double price, String publisher, int issueNumber, int year) {
            super(name, price, publisher);
            this.issueNumber = issueNumber;
            this.year = year;
        }

        // Getter and Setter methods

        public int getIssueNumber() {
            return issueNumber;
        }

        public void setIssueNumber(int issueNumber) {
            this.issueNumber = issueNumber;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }

            Magazine magazine = (Magazine) o;

            if (issueNumber != magazine.issueNumber) {
                return false;
            }
            return year == magazine.year;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + issueNumber;
            result = 31 * result + year;
            return result;
        }

        @Override
        public String toString() {
            return "杂志" + super.toString() + "，期号：" + issueNumber + "，年份：" + year;
        }
    }

    public class TestBooks {
        public void main(String[] args) {
            Novel n1 = new Novel("西游记",28,"人民文学出版社","长篇小说","吴承恩");
            Novel n2 = new Novel("西游记",28,"人民文学出版社","长篇小说","吴承恩");
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n1.equals(n2));

            Magazine m1 = new Magazine("读者",16,"读者出版社",11,2024);
            Magazine m2 = new Magazine("读者",16,"读者出版社",12,2024);
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m1.equals(m2));
        }
    }

}
