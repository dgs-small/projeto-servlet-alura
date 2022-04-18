package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.persistence.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/lista-de-empresas")
public class ListaDeEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmpresaDAO banco = new EmpresaDAO();
		List<Empresa> empresas = banco.obterLista();

		request.setAttribute("lista", empresas);
		request.getRequestDispatcher("/listaDeEmpresas.jsp").forward(request, response);

	}

}
