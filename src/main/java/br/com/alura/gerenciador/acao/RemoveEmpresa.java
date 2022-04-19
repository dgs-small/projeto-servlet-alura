package br.com.alura.gerenciador.acao;

import java.io.IOException;

import br.com.alura.gerenciador.model.EmpresaDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoveEmpresa {

	public void executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Removendo uma empresa");
		
		EmpresaDAO banco = new EmpresaDAO();
		String id = request.getParameter("id");
		banco.removerEmpresa(Integer.valueOf(id));
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}

}
