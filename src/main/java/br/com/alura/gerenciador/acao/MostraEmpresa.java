package br.com.alura.gerenciador.acao;

import java.io.IOException;

import br.com.alura.gerenciador.model.Empresa;
import br.com.alura.gerenciador.model.EmpresaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostraEmpresa {

	public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mostrando uma empresa");
		
		String idString = request.getParameter("id");
		Integer id = Integer.valueOf(idString);
		
		EmpresaDAO banco = new EmpresaDAO();
		Empresa empresa = banco.findById(id);
		
		request.setAttribute("empresa", empresa);
		request.getRequestDispatcher("/formEditaEmpresa.jsp").forward(request, response);
	}

}
