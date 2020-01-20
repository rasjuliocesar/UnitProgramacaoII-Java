package teste;

import java.util.Scanner;

import gestaoexterno.Fornecedor;
import gestaointerno.Pessoa;

public class TesteUmDois {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		/*
		 * Teste ref. T�picos 1 e 2.
		 */
		
		Pessoa p1 = new Pessoa("Maria Adelaide", "Avenida Conde de Boa Vista, 101B", "(81) 91234-5678");
		Fornecedor f1 = new Fornecedor("Fornecedores de Alimentos LTDA", "Bairro de S�o Jos� n� 505E", "(81) 99999-8888", 5000.00, 200.00);
		
		System.out.println(p1);
		System.out.println(f1);
		
		p1.setEndereco("Rua do Sol");
		f1.setTelefone("(81) 91234-4321");
		
		System.out.println(p1);
		System.out.println(f1);
		
		System.out.println("Cr�dito: " + f1.getValorCredito());
		System.out.println("Saldo: " + f1.obterSaldo());
	}
	
}
