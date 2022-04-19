package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.model.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditaEmpresa {

	public void executar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("altera empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		String id = request.getParameter("id");

		Date dataEmpresaDate = null;

		try {
			SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
			dataEmpresaDate = sfd.parse(dataEmpresa);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		EmpresaDAO banco = new EmpresaDAO();
		Empresa empresa = banco.findById(Integer.valueOf(id));
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataEmpresaDate);

		response.sendRedirect("entrada?acao=ListaEmpresas");
	}

}
