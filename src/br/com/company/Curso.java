package br.com.company;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public double calcularXp() {
        return XP_DEFAULT * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getCargaHoraria() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
