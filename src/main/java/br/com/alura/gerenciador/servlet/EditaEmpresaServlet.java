package br.com.alura.gerenciador.servlet;

import java.io.IOException;
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
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doPost(req, resp);
		}

}
