package AULA_HC;

// 1. CORREÇÃO: O import do Account foi removido porque está na mesma pasta.
// O import do Scanner foi removido porque você não está usando ele neste código.

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0, 500.0);

        //upcasting

        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //downcasting

        BussinesAccount acc4 = (BussinesAccount)acc2;
        acc4.loan(100.0);

        // BussinesAccount acc5 = (BussinesAccount)acc3;
        // O instanceof garante que o Java só vai tentar o downcasting se o acc3 for REALMENTE uma conta empresarial
        if (acc3 instanceof BussinesAccount) {
            BussinesAccount acc5 = (BussinesAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}