package ru.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books=new ArrayList<>();
        books.add(new Book(1L,"First book"));
        books.add(new Book(2L,"Second book"));
        books.add(new Book(3L,"Third book"));

        String x="some string";

        req.setAttribute("bookList",books);
        req.setAttribute("smString",x);

        /*Настройка для сервлета*/
        getServletContext().getRequestDispatcher("/books.jsp").forward(req,resp);
    }
}
