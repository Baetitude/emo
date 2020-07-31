package cd.emo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cd.emo.bdd.MessageBDD;

/**
 * Servlet implementation class Livredore
 */
@WebServlet( "/Livredore" )
public class Livredore extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Livredore() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        MessageBDD msbdd = new MessageBDD();
        request.setAttribute( "message", msbdd.recupererMessage() );
        this.getServletContext().getRequestDispatcher( "/WEB-INF/livredore.jsp" ).forward( request, response );
    }

}
