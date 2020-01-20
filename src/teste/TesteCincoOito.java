package teste;

import java.util.Scanner;

import gestaointerno.profissoes.Administrador;
import gestaointerno.profissoes.Operario;
import gestaointerno.profissoes.Vendedor;

public class TesteCincoOito {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		/*
		 * Teste ref. Tópicos 5, 6, 7 e 8.
		 */
		
		Administrador a1 = new Administrador("", "", "");
		Operario o1 = new Operario("", "", "");
		Vendedor v1 = new Vendedor("", "", "");
		
		a1.setNome("Administrador A1");
		a1.setCodigoSetor(1);
		a1.setAjudaDeCusto(1000);
		a1.setCpf("11122244456");
		a1.setSalarioBase(2000);
		a1.setImposto(17.00);
		
		System.out.println(a1);
		System.out.println("Salario: " + a1.calcularSalario());
		
		o1.setNome("Operario O1");
		o1.setCodigoSetor(2);
		o1.setValorProducao(1500);
		o1.setCpf("11122244456");
		o1.setSalarioBase(2000);
		o1.setImposto(17.00);
		
		System.out.println(o1);
		System.out.println("Salario: " + o1.calcularSalario());
		
		v1.setNome("Operario O1");
		v1.setCodigoSetor(2);
		v1.setValorVendas(5000);
		v1.setCpf("11122244456");
		v1.setSalarioBase(2000);
		v1.setImposto(17.00);
		
		System.out.println(v1);
		System.out.println("Salario: " + v1.calcularSalario());
	}

}

