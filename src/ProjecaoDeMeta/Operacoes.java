package ProjecaoDeMeta;

public class Operacoes extends CalculadoraProjeção{


    public Operacoes(double qtdAgentes, int diasMes, double metaMes, int diasRealizados, int diasFaltam, double mediaVendaPorDia, double qtdVendasRealizadas, double qtdVendasFaltam, double percentualAtingido, double projecaoVenda, double projecaoEmPercentual) {
        super(qtdAgentes, diasMes, metaMes, diasRealizados, diasFaltam, mediaVendaPorDia, qtdVendasRealizadas, qtdVendasFaltam, percentualAtingido, projecaoVenda, projecaoEmPercentual);
    }

    public Operacoes() {
        super();
    }

    public int subtraiDias(){

        setDiasFaltam(getDiasMes()- getDiasRealizados());

        return getDiasFaltam();
    }

    public double vendasPorAgentes(){
        double vPoragenetes = getQtdVendasFaltam() / getQtdAgentes();

        return vPoragenetes;
    }

    public double faltaVender(){

        return getMetaMes() - getQtdVendasRealizadas();
    }

    public double mediaVenda(){

        return getQtdVendasRealizadas()/ getDiasRealizados();
    }

    public double faltamPorDiaVenda(){

        return getQtdVendasFaltam() / getDiasFaltam();
    }

    public double percentualAtingido(){

        return getQtdVendasRealizadas()/getMetaMes();
    }

    public double projecaoReal(){

        return (getQtdVendasRealizadas()/ getDiasRealizados()) * getDiasMes();
    }

    public double projecaoPercentutal(){

       return projecaoReal()/getMetaMes();
    }
}
