package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.persistence.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final EmpresaDAO BANCO = new EmpresaDAO();

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");

		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		Date dataEmpresaDate = null;
		
		try {
			SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
			dataEmpresaDate = sfd.parse(dataEmpresa);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa(nomeEmpresa, dataEmpresaDate);
		
		BANCO.adicionarEmpresa(empresa);
		
//		request.getSession().setAttribute("empresa", empresa.getNome());
		response.sendRedirect("lista-de-empresas");
		
//		//Despacha 
//		request.getRequestDispatcher("/lista-de-empresas").forward(request, response);
		
	}

}
