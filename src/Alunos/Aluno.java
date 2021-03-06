package Alunos;

import java.io.Serializable;

import quotas.Quotas;

public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	public int numero;
	public String nome;
	public int ano;
	public String curso;
	public String morada;
	
	public Quotas quotas;
	
	

	public Aluno(int numero, String nome, int ano, String curso, String morada) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.ano = ano;
		this.curso = curso;
		this.morada = morada;
		
		this.quotas = new Quotas();
	}

	

	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + ", ano=" + ano + ", curso=" + curso + ", morada=" + morada
				+ ", quota=" + quotas + "]";
	}
	
	
	
}
