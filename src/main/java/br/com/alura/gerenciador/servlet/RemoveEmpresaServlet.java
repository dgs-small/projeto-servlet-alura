package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import br.com.alura.gerenciador.persistence.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveEmpresaServlet
 */
@WebServlet("/remove-empresa")
public class RemoveEmpresaServlet extends HttpServlet {
	
	private final EmpresaDAO BANCO = new EmpresaDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		BANCO.removerEmpresa(Integer.valueOf(id));
		resp.sendRedirect("lista-de-empresas");
	}

}
