import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class First implements Servlet {
    ServletConfig config = null;

    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</html></body>");

    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }


    @Override
    public String getServletInfo() {
        return "copyright 2020";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet is destroyed...");
    }

}

