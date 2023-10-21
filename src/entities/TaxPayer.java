package entities;

public class TaxPayer {
	
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
	
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}


	public double getSalaryIncome() {
		return salaryIncome;
	}


	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}


	public double getServicesIncome() {
		return servicesIncome;
	}


	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}


	public double getCapitalIncome() {
		return capitalIncome;
	}


	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}


	public double getHealthSpending() {
		return healthSpending;
	}


	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}


	public double getEducationSpending() {
		return educationSpending;
	}


	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	
	public double salaryTax() {
		double salarioMensal = salaryIncome / 12.0;

		if (salarioMensal < 3000.0) {
			return 0.0;
		} else if (salarioMensal < 5000.0) {
			return salaryIncome * 0.1;
		} else {
			return salaryIncome * 0.2;
		}

	}

	public double servicesTax() {
		return servicesIncome * 0.15;
	}

	public double capitalTax() {
		return capitalIncome * 0.20;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double maximoDedutivel = grossTax() * 0.3;
		double gastosDedutiveis = healthSpending + educationSpending;
		if (gastosDedutiveis > maximoDedutivel) {
			return maximoDedutivel;
		}

		else {
			return gastosDedutiveis;
		}

	}

	public double netTax() {

		return grossTax() - taxRebate();

	}

	public String toString() {

		return "Imposto bruto total: " + String.format("%.2f", grossTax()) + String.format("%n") + "Abatimento: "
				+ String.format("%.2f", taxRebate()) + String.format("%n") + "Imposto devido: "
				+ String.format("%.2f", netTax()) + String.format("%n");
	}

}
