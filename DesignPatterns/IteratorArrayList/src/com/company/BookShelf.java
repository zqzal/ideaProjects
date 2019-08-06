package com.company;

import java.util.ArrayList;

/**
 * Created by xuxi on 2018/11/4.
 */
public class BookShelf implements Aggregate {

//    private Book[] books;
    private ArrayList<Book> booklist;
    private int last = 0;

    public BookShelf(int initialsize){
//        this.books = new Book[maxsize];
        this.booklist = new ArrayList(initialsize);
    }

    public Book getBookAt(int index){
//        return books[index];
        return booklist.get(index);
    }

    public void appendBook(Book book){
//        this.books[last] = book;
        booklist.add(book);
        last++;
    }

    public int getLength(){
        return booklist.size();
    }

    @Override
    public Iterator iterator() {
        return (Iterator) new BookShelfIterator(this);
    }
}
