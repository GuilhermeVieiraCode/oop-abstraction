package br.com.company;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public double calcularXp() {
        return XP_DEFAULT + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
