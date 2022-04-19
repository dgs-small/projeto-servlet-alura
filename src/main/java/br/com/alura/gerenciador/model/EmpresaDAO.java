package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpresaDAO {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer idSequencial = 1;

	static {
		EmpresaDAO.lista.add(new Empresa("Globo", EmpresaDAO.idSequencial++));
		EmpresaDAO.lista.add(new Empresa("Fox", EmpresaDAO.idSequencial++));
		EmpresaDAO.lista.add(new Empresa("Facebook", EmpresaDAO.idSequencial++));
	}
	
	public void adicionarEmpresa(Empresa empresa) {
		empresa.setId(EmpresaDAO.idSequencial++);
		EmpresaDAO.lista.add(empresa);
	}
	
	public List<Empresa> obterLista() {
		return EmpresaDAO.lista;
	}
	
	//Utilizando um Iterator, remove uma empresa da lista usando a chave identificadora "id"
	public void removerEmpresa(Integer id) {
		for (Iterator<Empresa> iterator = lista.iterator(); iterator.hasNext();) {
			Empresa empresa = iterator.next();
			if (id == empresa.getId()) {
				iterator.remove();
			}
		}
	}

	public Empresa findById(Integer id) {
		for (Empresa empresa : lista) {
			if (id == empresa.getId()) {
				return empresa;
			}
		}
		return null;
	}

	

}
