import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Hello", urlPatterns = "/hello")
public class Hello extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
            throws IOException, ServletException {
//        servletResponse.getWriter().println("Hello World peace duke!");

//        Enumeration e = servletRequest.getParameterNames();
//        while (e.hasMoreElements())
//            System.out.println(e.nextElement());
//                System.out.println(e.nextElement().toString());

        System.out.println(servletRequest.getQueryString());



        servletRequest.getRequestDispatcher("/WEB-INF/page.jsp").forward(servletRequest, servletResponse);

//        Writer writer = servletResponse.getWriter();




    }

}