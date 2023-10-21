package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Digite os dados do" + i + "o contribuinte:");
			
			System.out.print("Renda anual com salário:");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço:");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital:");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos:");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais:");
			double educationSpending = sc.nextDouble();

			list.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));

		}

		System.out.println();
		int i = 1;

		for (TaxPayer taxPayer : list) {
			System.out.println("Resumo do " + (i++) + "o contribuinte:");
			System.out.println(taxPayer);
		}

		sc.close();

	}

}
