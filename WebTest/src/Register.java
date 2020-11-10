import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");
        String e = request.getParameter("userEmail");
        String c = request.getParameter("userCountry");
        String d = request.getParameter("expiration");
        String g = request.getParameter("title");


        out.println("<html><body>");
        out.println(n+p+e+c+d+g);
        out.println("</html></body>");

        System.out.println(">>>>>>>>>>>");
        System.out.println(n + "\n");
        System.out.println(p);
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);
        System.out.println(">>>>>>>>>>");

//        // ServletConfig
//        ServletConfig config=getServletConfig();
//        String driver = config.getInitParameter("driver");
//        String user = config.getInitParameter("username");
//        String password = config.getInitParameter("password");


        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root","V@mp1r330");
            System.out.println("DB connected.........");
            PreparedStatement ps = con.prepareStatement(
                    "insert into web.user11 values(?,?,?,?,?,?)");

            ps.setString(1,n);
            ps.setString(2,p);
            ps.setString(3,e);
            ps.setString(4,c);
            ps.setString(5,d);
            ps.setString(6,g);

            int i = ps.executeUpdate();
            if(i>0)
                out.print("You are successfully registered...");

        }catch(Exception ee){System.out.println(ee);}

        out.close();
    }
}
