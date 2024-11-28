package com.example.form;

import org.apache.struts.action.ActionForm;

public class BookForm extends ActionForm {
    private String bookName;
    private String bookId;

    // Getters and setters
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
