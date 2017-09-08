package br.facisa.si.p3.ui;

import java.util.Scanner;

import br.facisa.si.p3.entidades.ContaCorrente;
import br.facisa.si.p3.exceptions.SaldoInsuficienteException;
import br.facisa.si.p3.exceptions.ValorNegativoException;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class BancoApp {

	public static void main(String[] args) throws Exception {
		/*
		 * Após a mudança de IllegalArgumentException para Exception, foi
		 * necesssário lançar o Exception no escopo do método main
		 */
		Scanner in = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();

		try {
			conta.setLimite(10000);

		} catch (ValorNegativoException e) {
			e.getMessage();
		}

		try {
			conta.setSaldo(1000);
		} catch (ValorNegativoException e) {
			e.getMessage();
		}

		try {
			conta.setValorLimite(10000);
		} catch (ValorNegativoException e) {
			e.getMessage();
		}

		int op;
		System.out.print("Escolha uma da opcoes abaixo: ");
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		System.out.println("3. Saldo");
		System.out.println("0. Sair");
		op = in.nextInt();

		switch (op) {
		case 1:
			System.out.println("Quanto você deseja sacar?");
			try {
				conta.sacar(in.nextFloat());
			} catch (ValorNegativoException e) {
				e.getMessage();
			} catch(SaldoInsuficienteException a){
				a.getMessage();
			} catch (Exception e){
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Quanto você deseja depositar?");
			try {
				conta.depositar(in.nextFloat());
			} catch (ValorNegativoException e) {
				e.getMessage();
			}
			break;
		case 3:
			System.out.println("Seu saldo é: " + conta.getSaldo());
			break;
		default:
			break;
		}
		in.close();
	}

}
