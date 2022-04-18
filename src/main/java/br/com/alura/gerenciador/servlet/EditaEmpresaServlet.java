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
 * Servlet implementation class EditaEmpresaServlet
 */
@WebServlet("/edita-empresa")
public class EditaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final EmpresaDAO BANCO = new EmpresaDAO();


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeEmpresa = req.getParameter("nome");
		String dataEmpresa = req.getParameter("data");
		String id = req.getParameter("id");

		Date dataEmpresaDate = null;

		try {
			SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
			dataEmpresaDate = sfd.parse(dataEmpresa);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = BANCO.findById(Integer.valueOf(id));
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataEmpresaDate);

		resp.sendRedirect("lista-de-empresas");
	}

}
