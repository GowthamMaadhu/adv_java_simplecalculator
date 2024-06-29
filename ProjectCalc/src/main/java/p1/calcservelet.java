package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcservelet
 */
@WebServlet("/calcservelet")
public class calcservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
	int fst=Integer.parseInt(request.getParameter("fno"));
		int sec=Integer.parseInt(request.getParameter("sno"));
		String opt=request.getParameter("option");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>calculator result</title></head>");
		pw.println("<link rel='stylesheet' href='css/bootstrap.css'>");
		pw.println("<body class='bg-light'>");
		pw.println("<header class='bg-primary text-center text-white'>");
		pw.println("<h1> calculator_Result</h1>");
		pw.println("</header");
		pw.println("<br><br><br><br><br><br><br><br><br><br><br>");
		pw.println("<div class='container'>");
		pw.println("<div class='border p-3 mx-auto rounded bg-white text-center' style='width: 50%;' class='shadow-lg p-3 mb-5 bg-body rounded box-shadow-lg:0 1rem 3rem rgba($black, .175)'>");
		pw.println("<h1>"+"Result: "+"</h1>");
		pw.println("</div>");
		pw.println("</div");
		pw.println("<br><br>");
		
		pw.println("<div class='container'>");
		if(opt.equals("+")) {
		int a=fst+sec;
		
		pw.println("<div class='border p-3 mx-auto rounded bg-white text-center' style='width: 50%;' class='shadow-lg p-3 mb-5 bg-body rounded box-shadow-lg:0 1rem 3rem rgba($black, .175)'>");
		
		
			pw.println("<h1>"+fst+"+"+sec+"="+a+"</h1>");
			
			
		pw.println("</div>");
		}
		else if(opt.equals("-")) {
			int b=fst-sec;
			pw.println("<div class='border p-3 mx-auto rounded bg-white text-center' style='width: 50%;' class='shadow-lg p-3 mb-5 bg-body rounded box-shadow-lg:0 1rem 3rem rgba($black, .175)'>");
			
			pw.println("<h1>"+fst+"-"+sec+"="+b+"</h1>");
			
			pw.println("</div>");
			}
		else if(opt.equals("*")) {
			int c=fst*sec;
			pw.println("<div class='border p-3 mx-auto rounded bg-white text-center' style='width: 50%;' class='shadow-lg p-3 mb-5 bg-body rounded box-shadow-lg:0 1rem 3rem rgba($black, .175)'>");
			pw.println("<p>"+fst+"*"+sec+"="+c+"</p>");
				
			pw.println("</div>");
			}
		else {
			int d=fst/sec;
			pw.println("<div class='border p-3 mx-auto rounded bg-white text-center' style='width: 50%;' class='shadow-lg p-3 mb-5 bg-body rounded box-shadow-lg:0 1rem 3rem rgba($black, .175)'>");
			pw.println("<p>"+fst+"+"+sec+"="+d+"</p>");
			
			pw.println("</div>");
			
		}
		pw.println("</div>");
		 pw.println("<div class='container'>");
         pw.println("<a href='NewFile.jsp' class='btn btn-outline-primary' style='float: right;'>BACK</a>");
        pw.println("</div>") ;
		pw.println("<br><br><br><br><br><br><br><br>");
		pw.println("  <footer class='bg-dark text-white text-center'>");
         pw.println(" <p>&copy; 2024 Calculator Project</p>");
        pw.println("</footer>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
