package controller.commands.impl;

import controller.commands.Command;
import dao.UserDAO;
import dao.impl.UserDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToMainCommand implements Command {
    private final UserDAO userDAO = UserDAOImpl.getInstance();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("users", userDAO.findAllUsers());
        request.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(request, response);
    }
}
