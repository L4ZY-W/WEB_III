package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;


@WebServlet(name = "CadastroController", urlPatterns = {"/CadastroController"})
public class CadastroController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        //Importando classe para conversão de datas
        SimpleDateFormat stringToDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateToLocalDate = new SimpleDateFormat("dd/MM/yyyy");

        //Recebendo dados do formulário
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        Date dataNasc = stringToDate.parse(request.getParameter("data-nasc"));
        String senha = request.getParameter("senha");
        boolean avisos = request.getParameter("notif") != null;
        
        //Criando objeto da classe Usuário
            Usuario user = new Usuario();
        
        //Inserindo dados no objeto usando setters
        user.setID(123);
        user.setNome(nome);
        user.setCpf(cpf);
        user.setEmail(email);
        user.setTelefone(telefone);
        user.setDataNasc(dataNasc);
        user.setSenha(senha);
        user.setAvisos(avisos);
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h3> "+ nome +" </h3>");
            out.println("<h3> "+ cpf +" </h3>");
            out.println("<h3> "+ telefone +" </h3>");
            out.println("<h3> "+ email +" </h3>");
            out.println("<h3> "+ dataNasc +" </h3>");
            out.println("<h3> "+ senha +" </h3>");
            out.println("<h3> "+ avisos +" </h3>");
            
            out.println("<h3> "+ user +" </h3>");
            
            out.println("<h3> "+ user.getNome() +" </h3>");
            out.println("<h3> "+ dateToLocalDate.format(user.getDataNasc()) +" </h3>");
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
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

}
