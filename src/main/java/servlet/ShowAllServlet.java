package servlet;

import dao.AdditiveDAO;
import domain.Additive;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAllServlet", urlPatterns = "ShowAll")
public class ShowAllServlet extends HttpServlet {

    @Inject
    private AdditiveDAO additiveDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Additive> additives = additiveDAO.showAll();

        request.getSession(true).setAttribute("additives", additives);

        request.getRequestDispatcher("showAll.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
