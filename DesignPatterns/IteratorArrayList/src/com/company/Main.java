package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("test1"));
        bookShelf.appendBook(new Book("test2"));
        bookShelf.appendBook(new Book("test3"));
        bookShelf.appendBook(new Book("test4"));
        bookShelf.appendBook(new Book("test5"));
        Iterator iterator = (Iterator) new BookShelfIterator(bookShelf);
        while (iterator.hasNext()){

            Book book = (Book) iterator.next();
            System.out.println(book.getName());

        }

    }
}
