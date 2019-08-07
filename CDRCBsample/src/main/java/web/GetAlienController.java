package web;


import java.io.IOException;

import web.dao.AlienDao;
import web.model.Alien;


public class GetAlienController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */

    public GetAlienController(){
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletReponse response) throws ServletException, IOException{
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        int aid = Integer.parseInt(request.getParameter("aid"));
        
        AlienDao dao = new AlienDao();
        Alien a1 = dao.getAlien(aid);
        
        
        
        
    }
}
