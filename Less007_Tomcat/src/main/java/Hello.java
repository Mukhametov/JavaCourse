import ru.jcourse.jdbc.factory.Dao.PostDao;
import ru.jcourse.jdbc.factory.Dao.PostDaoImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Enumeration;

@WebServlet(name = "Hello", urlPatterns = "/hello")
public class Hello extends HttpServlet {
    @Resource(name = "jdbc/testDS")
    private DataSource ds;

    @Override
    public void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
            throws IOException, ServletException {
        PrintWriter out;
//        out = servletResponse.getWriter();
//        servletRequest.setCharacterEncoding ("UTF-8");
//        servletResponse.setCharacterEncoding("UTF-8");

        System.out.println(ds);

        PostDao pd = new PostDaoImpl();

        // Add to database
        if (servletRequest.getParameter("inp")!= null && !servletRequest.getParameter("inp").equals(""))
            pd.addRecord(servletRequest.getParameter("inp"));

        if (1 == 1){
            servletRequest.getRequestDispatcher("/WEB-INF/page.jsp").forward(servletRequest, servletResponse);
            return;
        }

//        Write prefix
        out.println("<%@ page language=\"java\" contentType=\"text/html; charset=utf-8\""+
                    "pageEncoding=\"utf-8\"%>"+
//        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>" +
                    "<html>" +
                    "<head>" +
                    "</head>" +
                    "<body>");

        //Write table
        out.println(pd.getRecordList());

        // Write suffix
        out.println("<h2>" +
                        "<form name=\"test\" method=\"get\" action=\"hello\">" +
                        "<p>" +
                        "<b>Ваше имя:</b><br>" +
                        "<input type=\"text\" size=\"40\" name=\"inp\">" +
                        "</p>" +
                        "<p>" +
                        "<input type=\"submit\" value=\"Отправить\">" +
                        "</p>" +
                        "</form>" +
                        "</h2>" +
                        "</body>" +
                        "</html>");
    }
}