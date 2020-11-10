import java.io.*;
import javax.servlet.*;

public class ServletTest extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res)
            throws IOException,ServletException{

        res.setContentType("text/html");
        PrintWriter out=res.getWriter();

        out.print("<html><body>");
        out.print("<b>hello generic servlet</b>");
        out.print("</body></html>");



    }
}