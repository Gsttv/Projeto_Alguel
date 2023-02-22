package Program;

import java.util.Scanner;

import aplication.entites;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos quartos seram alugados: ");
        int estudantes = sc.nextInt();
        entites[] aluguel = new entites[10];

        for (int i = 0; i < estudantes; i++) {
            System.out.print("Alugel " + (i + 1));
            System.out.print("\nNOME: ");
            String nome = sc.next();
            System.out.print("EMAIL: ");
            String email = sc.next();
            System.out.print("NUMERO DO QUARTO: ");
            int quarto = sc.nextInt();
            aluguel[quarto] = new entites(nome, email, quarto);
        }

        System.out.println("\nALUGUEiS: ");
        for (int i = 0; i < aluguel.length; i++) {
            if (aluguel[i] != null) {
                System.out.println("NOME: " + aluguel[i].getNome());
                System.out.println("EMAIL: " + aluguel[i].getEmail());
                System.out.println("NUMERO DO QUARTO: " + aluguel[i].getQuarto());
                System.out.println();
            }

            sc.close();

        }
    }
}