package application;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double salaryIncome;
        Double servicesIncome;
        Double capitalIncome;
        Double healthSpending;
        Double educationSpending;

        System.out.print("Quantos contribuintes você vai digitar: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.printf("Digite os dados do %d° contribuinte:\n", i+1);
            System.out.print("Renda anual com o sálario: ");
            salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviços: ");
            servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com o ganho de capital: ");
            capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            educationSpending = sc.nextDouble();

            TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            list.add(taxPayer);
        }

        int contador = 0;
        for (TaxPayer contribuintes : list){
            contador++;
            System.out.printf("Resumo do %d° contribuinte:\n",contador);
            System.out.println(contribuintes);
        }
    }
}