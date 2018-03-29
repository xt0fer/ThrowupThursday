package com.example.throwupthursday.daos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//        "title":"\"MOST BLESSED OF THE PATRIARCHS\"",
//            "description":"A character study that attempts to make sense of Jefferson’s contradictions.",
//            "contributor":"by Annette Gordon-Reed and Peter S. Onuf",
//            "author":"Annette Gordon-Reed and Peter S Onuf",
//            "contributor_note":"",
//            "price":0,
//            "age_group":"",
//            "publisher":"Liveright",
//            "isbn10":"0871404427",
//            "isbn13":"9780871404428"

@Entity
public class Book {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String contributor;
    private String author;
    private String contributor_note;
    private String age_group;
    private String publisher;
    private String isbn10;
    private String isbn13;

    public Book() {}
    public Book(String title, String description, String contributor, String author, String contributor_note, String age_group, String publisher, String isbn10, String isbn13) {
        this.title = title;
        this.description = description;
        this.contributor = contributor;
        this.author = author;
        this.contributor_note = contributor_note;
        this.age_group = age_group;
        this.publisher = publisher;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributor_note() {
        return contributor_note;
    }

    public void setContributor_note(String contributor_note) {
        this.contributor_note = contributor_note;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }
}
