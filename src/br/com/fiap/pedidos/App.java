package br.com.fiap.pedidos;

import br.com.fiap.pedidos.model.Cliente;

public class App {

	public static void main(String[] args) {
		
		Cliente c3 = new Cliente();
		
		Cliente c1 = new Cliente("Maria", 45);
		c1.email = "maria@uol.com.br";
		c1.peso = 65;
		c1.altura = 1.70;
		
		Cliente c2 = new Cliente("Pedro");
		c2.email = "pedro@terra.com.br";
		c2.idade = 25;
		c2.peso = 98;
		c2.altura = 1.84;
		
		c1.exibirDados();
		c2.exibirDados();
	
		

	}

}
