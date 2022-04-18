package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.persistence.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
@WebServlet("/mostra-empresa")
public class MostraEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final EmpresaDAO BANCO = new EmpresaDAO();
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String idString = req.getParameter("id");
			Integer id = Integer.valueOf(idString);
			Empresa empresa = BANCO.findById(id);
			
			req.setAttribute("empresa", empresa);
			req.getRequestDispatcher("/formEditaEmpresa.jsp").forward(req, resp);
		}

}
