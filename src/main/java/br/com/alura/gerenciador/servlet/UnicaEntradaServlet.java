package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import br.com.alura.gerenciador.acao.EditaEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		if (paramAcao.equals("ListaEmpresas")) {
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.executar(request, response);
		} else if (paramAcao.equals("RemoveEmpresa")) {

			RemoveEmpresa acao = new RemoveEmpresa();
			acao.executar(request, response);

		} else if (paramAcao.equals("MostraEmpresa")) {

			MostraEmpresa acao = new MostraEmpresa();
			acao.executar(request, response);
			
		} else if (paramAcao.equals("EditaEmpresa")) {
			
			EditaEmpresa acao = new EditaEmpresa();
			acao.executar(request, response);
			
		} else if (paramAcao.equals("NovaEmpresa")) {
			
			NovaEmpresa acao = new NovaEmpresa();
			acao.executar(request, response);
		}
	}

}
