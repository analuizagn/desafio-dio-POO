import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("DEscrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnaLuiza = new Dev();
        devAnaLuiza.setNome("Ana Luiza");
        devAnaLuiza.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Ana Luiza:" + devAnaLuiza.getConteudosInscritos());
        devAnaLuiza.progredir();
        devAnaLuiza.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Ana Luiza:" + devAnaLuiza.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Ana Luiza:" + devAnaLuiza.getConteudosConcluidos());
        System.out.println("XP: " + devAnaLuiza.calcularTotalXP());

        System.out.println("-------------------");

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Nicolas:" + devNicolas.getConteudosInscritos());
        devNicolas.progredir();
        devNicolas.progredir();
        devNicolas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Nicolas:" + devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Nicolas:" + devNicolas.getConteudosConcluidos());
        System.out.println("XP: " + devNicolas.calcularTotalXP());
    }
}
