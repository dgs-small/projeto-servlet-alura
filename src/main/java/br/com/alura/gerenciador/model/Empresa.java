package br.com.alura.gerenciador.model;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();

	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public Empresa(String nome, Date dataAbertura) {
		this.nome = nome;
		this.dataAbertura = dataAbertura;
	}
	
	public Empresa(String nome, Integer id) {
		this.nome = nome;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
