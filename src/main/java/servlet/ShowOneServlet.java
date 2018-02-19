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

@WebServlet(name = "ShowOneServlet", urlPatterns = "/ShowOne")
public class ShowOneServlet extends HttpServlet {

    @Inject
    private AdditiveDAO additiveDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getParameter("language") == null) {
            String numberE = "E" + request.getParameter("number");
            Additive additive = additiveDAO.read(numberE);

            request.setAttribute("additive", additive);

            request.getRequestDispatcher("foundByE.jsp").forward(request, response);
        } else {
            String language = request.getParameter("language");
            String name = request.getParameter("name");
            Additive additive = additiveDAO.readByName(language, name);

            request.setAttribute("additive", additive);

            request.getRequestDispatcher("foundByName.jsp").forward(request, response);
        }
    }
}