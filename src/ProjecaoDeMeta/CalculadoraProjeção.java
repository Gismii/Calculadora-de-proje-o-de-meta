package ProjecaoDeMeta;

public class CalculadoraProjeção {

    private double qtdAgentes;
    private int    diasMes;
    private double metaMes;
    private int    diasRealizados;
    private int    diasFaltam;
    private double mediaVendaPorDia;
    private double qtdVendasRealizadas;
    private double qtdVendasFaltam;
    private double percentualAtingido;
    private double projecaoVenda;
    private double projecaoEmPercentual;

    public CalculadoraProjeção(double qtdAgentes, int diasMes, double metaMes, int diasRealizados, int diasFaltam, double mediaVendaPorDia, double qtdVendasRealizadas, double qtdVendasFaltam, double percentualAtingido, double projecaoVenda, double projecaoEmPercentual) {
        this.qtdAgentes = qtdAgentes;
        this.diasMes = diasMes;
        this.metaMes = metaMes;
        this.diasRealizados = diasRealizados;
        this.diasFaltam = diasFaltam;
        this.mediaVendaPorDia = mediaVendaPorDia;
        this.qtdVendasRealizadas = qtdVendasRealizadas;
        this.qtdVendasFaltam = qtdVendasFaltam;
        this.percentualAtingido = percentualAtingido;
        this.projecaoVenda = projecaoVenda;
        this.projecaoEmPercentual = projecaoEmPercentual;
    }

    public CalculadoraProjeção() {

    }

    public double getQtdAgentes() {
        return qtdAgentes;
    }

    public void setQtdAgentes(double qtdAgentes) {
        this.qtdAgentes = qtdAgentes;
    }

    public int getDiasMes() {
        return diasMes;
    }

    public void setDiasMes(int diasMes) {
        this.diasMes = diasMes;
    }

    public double getMetaMes() {
        return metaMes;
    }

    public void setMetaMes(double metaMes) {
        this.metaMes = metaMes;
    }

    public int getDiasRealizados() {
        return diasRealizados;
    }

    public void setDiasRealizados(int diasRealizados) {
        this.diasRealizados = diasRealizados;
    }

    public int getDiasFaltam() {
        return diasFaltam;
    }

    public void setDiasFaltam(int diasFaltam) {
        this.diasFaltam = diasFaltam;
    }

    public double getMediaVendaPorDia() {
        return mediaVendaPorDia;
    }

    public void setMediaVendaPorDia(double mediaVendaPorDia) {
        this.mediaVendaPorDia = mediaVendaPorDia;
    }

    public double getQtdVendasRealizadas() {
        return qtdVendasRealizadas;
    }

    public void setQtdVendasRealizadas(double qtdVendasRealizadas) {
        this.qtdVendasRealizadas = qtdVendasRealizadas;
    }

    public double getQtdVendasFaltam() {
        return qtdVendasFaltam;
    }

    public void setQtdVendasFaltam(double qtdVendasFaltam) {
        this.qtdVendasFaltam = qtdVendasFaltam;
    }

    public double getPercentualAtingido() {
        return percentualAtingido;
    }

    public void setPercentualAtingido(double percentualAtingido) {
        this.percentualAtingido = percentualAtingido;
    }

    public double getProjecaoVenda() {
        return projecaoVenda;
    }

    public void setProjecaoVenda(double projecaoVenda) {
        this.projecaoVenda = projecaoVenda;
    }

    public double getProjecaoEmPercentual() {
        return projecaoEmPercentual;
    }

    public void setProjecaoEmPercentual(double projecaoEmPercentual) {
        this.projecaoEmPercentual = projecaoEmPercentual;
    }


}
