package com.constructor.level1;

class BookLibrary {

  
    public String ISBN;
    protected String title;
    private String author;

    // constructor
    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }

    // setter for author
    public void setAuthor(String author) {
        this.author=author;
    }

    // getter for author
    public String getAuthor() {
        return author;
    }
}
