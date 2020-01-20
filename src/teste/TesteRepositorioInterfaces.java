package teste;

import java.util.Scanner;

import gestaoexterno.FornecedorFisico;
import gestaoexterno.FornecedorJuridico;
import gestaointerno.profissoes.Administrador;
import gestaointerno.profissoes.Operario;
import gestaointerno.profissoes.Vendedor;
import repositorios.RepAdministradorLista;
import repositorios.RepForFisicoLista;
import repositorios.RepForJuridicoLista;
import repositorios.RepOperarioLista;
import repositorios.RepVendedorLista;

public class TesteRepositorioInterfaces {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		
		RepAdministradorLista repAdm = new RepAdministradorLista();
		RepVendedorLista repVen = new RepVendedorLista();
		RepOperarioLista repOpe = new RepOperarioLista();
		RepForFisicoLista repFis = new RepForFisicoLista();
		RepForJuridicoLista repJur = new RepForJuridicoLista();
		
		//Inserir Dados
		
		Administrador adm = new Administrador("Administrador Adm1", "Rua das Calçadas", "99999-9999");
		Operario ope = new Operario("Operario Ope1", "Rua dos Buracos", "88888-8888");
		Vendedor ven = new Vendedor("Vendedor Ven1", "Avenida das Rodovias", "77777-7777");
		FornecedorJuridico jur = new FornecedorJuridico("Jurídico Jur1", "Avenida das Ruas", "66666-6666");
		FornecedorFisico fis = new FornecedorFisico("Físico Fis1", "Estradas das Vias", "55555-5555");
		
		Administrador adm2 = new Administrador("Administrador Adm2", "Rua das Calçadas", "99999-9999");
		Operario ope2 = new Operario("Operario Ope2", "Rua dos Buracos", "88888-8888");
		Vendedor ven2 = new Vendedor("Vendedor Ven2", "Avenida das Rodovias", "77777-7777");
		FornecedorJuridico jur2 = new FornecedorJuridico("Jurídico Jur2", "Avenida das Ruas", "66666-6666");
		FornecedorFisico fis2 = new FornecedorFisico("Físico Fis2", "Estradas das Vias", "55555-5555");
		
		repAdm.inserirAdministrador(adm);
		repOpe.inserirOperario(ope);
		repVen.inserirVendedor(ven);
		repJur.inserirForJuridico(jur);
		repFis.inserirForFisico(fis);
		
		repAdm.inserirAdministrador(adm2);
		repOpe.inserirOperario(ope2);
		repVen.inserirVendedor(ven2);
		repJur.inserirForJuridico(jur2);
		repFis.inserirForFisico(fis2);
		
		System.out.println("Listando");
		//Listando Dados
		
		System.out.println(repAdm.listarAdministrador());
		System.out.println(repOpe.listarOperario());
		System.out.println(repVen.listarVendedor());
		System.out.println(repJur.listarForJuridico());
		System.out.println(repFis.listarForFisico());
		
		System.out.println("Procurando");
		//Procurar Dados
		
		String nomeAdm = "Administrador Adm1";
		Administrador buscarNomeAdm = repAdm.procurarAdministrador(nomeAdm);
		System.out.println(buscarNomeAdm);
		
		String nomeOpe = "Operario Ope1";
		Operario buscarNomeOpe = repOpe.procurarOperario(nomeOpe);
		System.out.println(buscarNomeOpe);
		
		String nomeVen = "Vendedor Ven1";
		Vendedor buscarNomeVen = repVen.procurarVendedor(nomeVen);
		System.out.println(buscarNomeVen);
		
		String nomeFis = "Físico Fis1";
		FornecedorFisico buscarNomeFis = repFis.procurarForFisico(nomeFis);
		System.out.println(buscarNomeFis);
		
		String nomeJur = "Jurídico Jur1";
		FornecedorJuridico buscarNomeJur = repJur.procurarForJuridico(nomeJur);
		System.out.println(buscarNomeJur);
		
		System.out.println("Apagando");
		//Apagando Dados
		
		repAdm.removerAdministrador(nomeAdm);
		repOpe.removerOperario(nomeOpe);
		repVen.removerVendedor(nomeVen);
		repJur.removerForJuridico(nomeJur);
		repFis.removerForFisico(nomeFis);
		
		System.out.println(repAdm.listarAdministrador());
		System.out.println(repOpe.listarOperario());
		System.out.println(repVen.listarVendedor());
		System.out.println(repJur.listarForJuridico());
		System.out.println(repFis.listarForFisico());
		
		tc.close();
	}

}
