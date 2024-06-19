package aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class aplicação {
    public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);
            String escolha;

            Set<Integer> setA = new HashSet<>();
            Set<Integer> setB = new HashSet<>();
            Set<Integer> setC = new HashSet<>();

            do {
                System.out.println("Escolha entre os 3 cursos: A, B ou C e D para sair");
                escolha = ler.next().toUpperCase();

                switch (escolha) {
                    case "A":
                        System.out.println("Digite a sua matricula:");
                        int matriculaA = ler.nextInt();
                        setA.add(matriculaA);
                        System.out.println("Matriculado");
                        break;
                    case "B":
                        System.out.println("Digite a sua matricula:");
                        int matriculaB = ler.nextInt();
                        setB.add(matriculaB);
                        System.out.println("Matriculado");
                        break;
                    case "C":
                        System.out.println("Digite a sua matricula:");
                        int matriculaC = ler.nextInt();
                        System.out.println("Matriculado");
                        setC.add(matriculaC);
                        break;
                    case "D":
                        break;
                    default:
                        System.out.println("Inválido.");
                }
            } while (!escolha.equals("D"));

            Set<Integer> setE = new HashSet<>();
            setE.addAll(setA);
            setE.addAll(setB);
            setE.addAll(setC);

            System.out.println("O total de alunos em todos os cursos é: " + setE.size());
    }
}

