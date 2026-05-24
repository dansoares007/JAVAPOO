package atividade_aula2;

public class Employee {
    public String nome;
    public double GrossSalary;
    public double tax;

    public double NetSalary(){
        return GrossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        System.out.printf("%s, $ %.2f", nome, NetSalary() + (GrossSalary * (percentage/100)));
    }
}
