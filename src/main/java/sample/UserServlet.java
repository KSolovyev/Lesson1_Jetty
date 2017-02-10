package sample;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Solovyev on 09/02/2017.
 */
public class UserServlet extends HttpServlet {

    private UserHandler handler;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (handler == null) {
            handler = new UserHandler();
        }
        final String msg = req.getParameter("msg");
        handler.handle(msg, resp);
    }
}
