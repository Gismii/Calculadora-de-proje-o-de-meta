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

        System.out.println("Informe o valor da meta: ");
        double meta = entrada.nextDouble();
        operacoes.setMetaMes(meta);

        System.out.println("Informe quantos dias foram trabalhados: ");
        int totalDiaTrabalhados = entrada.nextInt();
        operacoes.setDiasRealizados(totalDiaTrabalhados);

        System.out.println("Informe a quatidade de agentes: ");
        int agentes = entrada.nextInt();
        operacoes.setQtdAgentes(agentes);

        System.out.println("Informe o totaol de vendas realizadas: ");
        double vendas = entrada.nextDouble();
        operacoes.setQtdVendasRealizadas(vendas);



        System.out.println("Restam o total de "+operacoes.subtraiDias()+" dias para ser trabalhados!");
        out.println(" |  | ");
        System.out.println("Considerando o total de vendas até momento, a média atual é "+operacoes.mediaVenda()+" vendas.");
        out.println(" |  | ");
        System.out.println("Para atingimento da meta deverá corrigir o valor de "+operacoes.faltamPorDiaVenda()+" vendas por dia!");
        out.println(" |  | ");
        System.out.println("Faltam o total de "+operacoes.faltaVender()+" vendas!");
        out.println(" |  | ");
        System.out.println("Faltam "+operacoes.vendasPorAgentes()+" vendas por agentes!");
        out.println(" |  | ");
        System.out.println("Percentual atingido até o momento "+operacoes.percentualAtingido()+"!");
        out.println(" |  | ");
        System.out.println("Projeção de venda real até o momento "+operacoes.projecaoReal()+"!");
        out.println(" |  | ");
        System.out.println("Projeção em percentual até o momento "+operacoes.projecaoPercentutal()+"!");






    }

}