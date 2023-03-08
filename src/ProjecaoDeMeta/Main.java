package ProjecaoDeMeta;
import java.util.Scanner;


import static java.lang.System.*;


public class Main {

    public static void main(String[] args) {

        Operacoes operacoes = new Operacoes();
        CalculadoraProjeção calculadoraProjeção = new CalculadoraProjeção();
        Scanner entrada = new Scanner(in);

        System.out.println("Projeto Calculadora - Autor Gismi Guimarães");
        System.out.println("===========================================");

        System.out.println("Informe quantos dias do mês serão  trabalhados: ");
        int totalDiasMes = entrada.nextInt();
        operacoes.setDiasMes(totalDiasMes);

        System.out.println("Informe quantos dias foram trabalhados: ");
        int totalDiaTrabalhados = entrada.nextInt();
        operacoes.setDiasRealizados(totalDiaTrabalhados);

        System.out.println("Restam o total de "+operacoes.subtraiDias()+" dias!");






    }

}