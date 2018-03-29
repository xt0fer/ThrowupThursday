package com.example.throwupthursday.config;

import com.example.throwupthursday.daos.Book;
import com.example.throwupthursday.daos.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BookLoader implements ApplicationRunner {
    private BookDAO book;

    @Autowired
    public BookLoader(BookDAO book) {
        this.book = book;
    }



    public void run(ApplicationArguments args) {

        Book[] books = new Book[]{
                new Book("\"MOST BLESSED OF THE PATRIARCHS\"",
                        "A character study that attempts to make sense of Jefferson’s contradictions.",
                        "by Annette Gordon-Reed and Peter S. Onuf",
                        "Annette Gordon-Reed and Peter S Onuf",
                        "", "", "Liveright", "",
                        "9780871404428")
        };

        for (Book book : books)
            this.book.save(book);

    }
}
