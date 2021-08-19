package estruturas_de_repeticao;

import java.util.Random;

public class ExemploRepeticao {
    public static void main(String[] args) {
        Random gerador = new Random();
        double nota1, nota2;
        //repeticao controlada por contador
        int totalAlunos = 1;
        while (totalAlunos <= 5) {
            nota1 = gerador.nextDouble() * 10;
            nota2 = gerador.nextDouble() * 10;
            double resultado = (nota1 + nota2) / 2;

            System.out.printf("Média: %.2f\n", resultado);
            totalAlunos ++;
            //++totalAlunos;
            //totalAlunos += 1;
            //totalAlunos = totalAlunos + 1;
        }
        System.out.println("Até mais.");
    }
}
