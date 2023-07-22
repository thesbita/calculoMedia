/*
 * @author Emanuelle Thesbita 
 * @version 1.0
 */

import java.util.Scanner;

public class media {  

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        float media, i;

        for (i = 0; i < 4; i++){

            System.out.println("Aluno, digite a sua primeira nota");
            nota1 = var.nextInt();

            System.out.println("Aluno, digite sua segunda nota");
            nota2 = var.nextInt();

            System.out.println("Aluno, digite sua terceira nota");
            nota3 = var.nextInt();

            System.out.println("Aluno, digite sua quarta nota");
            nota4 = var.nextInt();

            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média do aluno é " + media);

            if ((media <= 0) || (media < 4)) {
                System.out.println("Não Aprovado");
            }
            if (media >=5){
                System.out.println("Aprovado");
            }
        }
        
    }

}