/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Calendar;
import java.util.GregorianCalendar;
import myclasses.Author;
import myclasses.Book;
import myclasses.History;
import myclasses.Reader;

/**
 *
 * @author pupil
 */
public class App {
    
    public void run(){
        Reader reader1 = new Reader();
        reader1.setFirstname("Petr");
        reader1.setLastname("Petrov");
        reader1.setPhone("538945612");
        
        Reader reader2 = new Reader();
        reader2.setFirstname("Olga");
        reader2.setLastname("Tamme");
        reader2.setPhone("569713286");
        
        Book book1 = new Book();
        book1.setBookName("Voina i mir");
        book1.setPublishedYear(2021);
        Author author1 = new Author();
        author1.setFirstname("Lev");
        author1.setLastname("Tolstoy");
        author1.setBirthYear(1828);
        Author[] authors = new Author[1];
        authors[0] = author1;
        book1.setAuthor(authors);
        
        Book book2 = new Book();
        book2.setBookName("Otci i deti");
        book2.setPublishedYear(2018);
        Author author2 = new Author();
        author2.setFirstname("Ivan");
        author2.setLastname("Turgenev");
        author2.setBirthYear(1818);
        Author[] authors1 = new Author[1];
        authors1[0] = author2;
        book2.setAuthor(authors1);
        
        History history1 = new History();
        history1.setBook(book1);
        history1.setReader(reader1);
        Calendar c = new GregorianCalendar();
        history1.setGivendate(c.getTime());
        System.out.println("history1 =" +history1.toString());
        
        History history2 = new History();
        history2.setBook(book2);
        history2.setReader(reader2);
        c = new GregorianCalendar();
        history2.setGivendate(c.getTime());
        System.out.println("history2 =" +history2.toString());
        c = new GregorianCalendar();
        history1.setReturnedDate(c.getTime());
        System.out.println("-------------------------");
        System.out.println("history1 =" +history1.toString());
    }

}