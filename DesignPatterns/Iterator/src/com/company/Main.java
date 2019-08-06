package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days")); //环游世界80天
        bookShelf.appendBook(new Book("Bible"));//圣经
        bookShelf.appendBook(new Book("Cinderella"));//灰姑娘
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));//长腿爸爸
        bookShelf.appendBook(new Book("test5"));//长腿爸爸
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
