/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.novaroma.control;

import br.edu.novaroma.model.MotoTaxista;
import br.edu.novaroma.persistence.MotoTaxiDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author josimarpc
 */
public class CadastrarMotoTaxista extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastrarMotoTaxista</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastrarMotoTaxista at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nome = request.getParameter("nome");
        String sNascimento = request.getParameter("nascimento");
        String sTelefone = request.getParameter("telefone");
        String sCpf = request.getParameter("cpf");
        String sEmail = request.getParameter("email");
        String sLogin = request.getParameter("login");
        String sSenha = request.getParameter("senha");
        String SvalidadeCnh = request.getParameter("validadeCnh");
        String sCategoriaCnh = request.getParameter("categoriaCnh");
        
        //if((nome == null )||(nome.length()==0))mostrarErro(request response, "Por favor Prencha um nome!");
       // else if
        String sRua = request.getParameter("rua");
        String sNumero = request.getParameter("numero");
        String sBairro = request.getParameter("bairro");
        String sCidade = request.getParameter("cidade");
        String sCep = request.getParameter("cep");
        
        MotoTaxista motoTaxista = null;
        
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try{
            Date nascimento = df.parse(sNascimento);
          //  motoTaxista = MotoTaxista();
            
        }
        catch(Exception e){
            throw new ServletException(e);
            
        }
        if (motoTaxista != null){
            MotoTaxiDAO.CadastrarMotoTaxista(motoTaxista);
            List<MotoTaxista> lista = MotoTaxiDAO.listarMotoTaxistas();
            
            request.setAttribute("lista", lista);
                    
            RequestDispatcher dispatcher = request.getRequestDispatcher("listaMotoTaxista");
            dispatcher.forward(request, response);
            
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.write("<html><head><title>MotoTaxistas Cadastrados</title></head></body>");
        
            for (MotoTaxista mototaxista : lista) out.write("<li><p>" + mototaxista.getNome() + "</p></li>");
            out.write("<p><hr/></p><p><a href='index.jsp'>Formulario de Cadastro</a></p></body></html>");
            out.close();
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

 //   private MotoTaxista MotoTaxista(nome, nascimento, telefone, cpf, email, login, senha) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
