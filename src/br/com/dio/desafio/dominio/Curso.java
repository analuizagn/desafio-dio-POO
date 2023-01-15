package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHorario;
    }
    private int cargaHorario;

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }
}
