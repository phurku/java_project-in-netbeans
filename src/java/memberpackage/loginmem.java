/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memberpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 *
 * @author Phurkima
 */
public class loginmem extends HttpServlet {

    
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    service(request,response);
}
   //@Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    service(request,response);
}
    
    
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name =request.getParameter("name");
        String gender = request.getParameter("gender");
        String email =request.getParameter("email");
        String address =request.getParameter("address");
      //  String DOB=request.getParameter("DOB");
        String qualification =request.getParameter("qualification");
        String language=request.getParameter("language");
          try{
              Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/new_members","root","");
                   
                PreparedStatement ps;
                ps = (PreparedStatement) connect.prepareStatement("INSERT into members(name,gender,email,address,qualification,language) VALUES(?,?,?,?,?,?)");
                ps.setString(1,name);
                ps.setString(2,gender);
                ps.setString(3,email);
                ps.setString(4,address);
               // ps.setString(5,DOB);
                ps.setString(5,qualification);
                ps.setString(6,language);
                int i= ps.executeUpdate();
                if(i>0)
                    out.print("Registered sucessfully");
            }
          catch(Exception e){
              out.print(e);
          }
    }
                 
    }
