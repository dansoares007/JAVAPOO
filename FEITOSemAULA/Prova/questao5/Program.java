package Prova.questao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciando a lista com o tipo Employee
        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        // Loop para ler os N funcionários
        for (int i = 0; i < n; i++) {
            System.out.println("\nFuncionário #" + (i + 1) + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            // Validação de ID repetido
            while (hasId(list, id)) {
                System.out.print("Este ID já existe! Tente outro id: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine(); // Limpar o buffer do teclado
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        // Parte do aumento de salário
        System.out.print("\nDigite o id do funcionário que terá aumento de salário: ");
        int idSalary = sc.nextInt();

        // Busca o funcionário pelo ID
        Employee emp = null;
        for (Employee e : list) {
            if (e.getId() == idSalary) {
                emp = e;
                break;
            }
        }

        // Verifica se o funcionário foi encontrado ou não
        if (emp == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Digite a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // Impressão final usando o enhanced for (for-each)
        System.out.println("\nLista de funcionários:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    // Método auxiliar para verificar se o ID já existe na lista
    public static boolean hasId(List<Employee> list, int id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }
}