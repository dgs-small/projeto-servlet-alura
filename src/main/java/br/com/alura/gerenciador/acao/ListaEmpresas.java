package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.model.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaEmpresas {

	public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpresaDAO banco = new EmpresaDAO();
		List<Empresa> empresas = banco.obterLista();

		request.setAttribute("lista", empresas);
		request.getRequestDispatcher("/listaDeEmpresas.jsp").forward(request, response);
	}

}
