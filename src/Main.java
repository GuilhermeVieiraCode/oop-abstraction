import br.com.company.Bootcamp;
import br.com.company.Curso;
import br.com.company.Dev;
import br.com.company.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso Java", "Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso cursoB = new Curso("Curso Spring", "Descrição curso Spring");
        cursoB.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria("Mentoria POO", "Descrição mentoria POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(cursoB);

        Dev devJohn = new Dev();
        devJohn.setNome("John Doe");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos John: " + devJohn.getConteudosInscritos());
        devJohn.progredir();
        System.out.println("Conteúdos inscritos John: " + devJohn.getConteudosInscritos());
        System.out.println("Conteúdos concluídos John: " + devJohn.getConteudosConcluidos());
        System.out.println("XP " + devJohn.calcularTotalXp());

        System.out.println();

        Dev devJane = new Dev();
        devJane.setNome("Jane Doe");
        devJane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jane: " + devJane.getConteudosInscritos());
        devJane.progredir();
        devJane.progredir();
        System.out.println("Conteúdos inscritos Jane: " + devJane.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Jane: " + devJane.getConteudosConcluidos());
        System.out.println("XP " + devJane.calcularTotalXp());
    }
}
