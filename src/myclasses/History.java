/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Reader reader;
    private Book book;
    private Date givendate;
    private Date returnedDate;

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getGivendate() {
        return givendate;
    }

    public void setGivendate(Date givendate) {
        this.givendate = givendate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "reader=" + reader 
                + ", book=" + book 
                + ", givendate=" + givendate 
                + ", returnedDate=" + returnedDate 
                + '}';
    }
    
}
