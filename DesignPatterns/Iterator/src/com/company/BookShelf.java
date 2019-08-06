package com.company;

/**
 * Created by xuxi on 2018/11/2.
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return (Iterator) new BookShelfIterator(this);
    }
}
