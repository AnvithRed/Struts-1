package com.example.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.example.form.BookForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class BookAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        BookForm bookForm = (BookForm) form;

        // Retrieve the book list from session or initialize it if it doesn't exist
        List<String> books = (List<String>) request.getSession().getAttribute("bookList");

        if (books == null) {
            books = new ArrayList<>();
        }



        // Add the new book to the list
        books.add(bookForm.getBookName() + " (ID: " + bookForm.getBookId() + ")");

        // Store the updated book list back in the session
        request.getSession().setAttribute("bookList", books);
        

        // Forward to the summary page
        return mapping.findForward("success");
    }
}
