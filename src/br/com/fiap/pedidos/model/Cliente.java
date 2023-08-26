package br.com.fiap.pedidos.model;

public class Cliente {
	
	public String nome;
	public String email;
	public int idade;
	public int peso;
	public double altura;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente() {
		
	}
	
	public void exibirDados() {
		System.out.println("Nome " + nome);
		System.out.println("Email " + email);
		System.out.println("Idade " + idade);
		System.out.println("IMC: " + calcularImc());
		System.out.println("---------------");
	}
	
	private double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}

}
