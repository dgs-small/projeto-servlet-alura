package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.model.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NovaEmpresa {

	public void executar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
		
		EmpresaDAO banco = new EmpresaDAO();
		banco.adicionarEmpresa(empresa);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}
	
}
