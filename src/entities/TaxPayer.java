package entities;

public class TaxPayer {

    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending , Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }


    public Double getCapitalIncome() {
        return capitalIncome;
    }


    public Double getHealthSpending() {
        return healthSpending;
    }


    public Double getEducationSpending() {
        return educationSpending;
    }


    public double salaryTax(){
        if (salaryIncome / 12 < 3000.00){
           return 0.00;
        }
        else if (salaryIncome / 12 < 5000.00){
            return salaryIncome * (10.0 / 100);
        }
        else {
            return salaryIncome * (20.0 / 100);
        }
    }

    public double servicesTax(){
        if (servicesIncome > 0){
            return servicesIncome * (15.0 / 100);
        }
        else {
            return 0.0;
        }
    }

    public double capitalTax(){
        if(capitalIncome > 0){
            return capitalIncome * (20.0 / 100);
        }
        else {
            return 0.0;
        }
    }

    public double grossTax(){
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate(){
        double gastosDedutiveis = getEducationSpending() + getHealthSpending();
        double maximoDedutivel = grossTax() * (30.0 / 100);
            return Math.min(gastosDedutiveis, maximoDedutivel);
    }

    public double netTax(){
        return grossTax() - taxRebate();
    }

    public String toString(){
        return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" +
               "Abatimento: " + String.format("%.2f", taxRebate()) + "\n" +
               "Imposto devido: " + String.format("%.2f", netTax());
    }

}
