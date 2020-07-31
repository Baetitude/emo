package cd.emo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cd.emo.beans.Message;
import cd.emo.forms.MessageForm;

/**
 * Servlet implementation class messages
 */
@WebServlet( "/messages" )
public class messages extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public messages() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/message.jsp" ).forward( request, response );
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        MessageForm form = new MessageForm();

        Message message = form.nouVeauMessage( request );

        request.setAttribute( "form", form );
        request.setAttribute( "message", message );

        if ( form.getErreurs().isEmpty() ) {
            this.getServletContext().getRequestDispatcher( "/WEB-INF/livredore.jsp" ).forward( request, response );
        } else {
            this.getServletContext().getRequestDispatcher( "/WEB-INF/message.jsp" ).forward( request, response );
        }

    }

}
