import java.time.LocalDate;

import dio_desafio_dominio.Bootcamp;
import dio_desafio_dominio.Conteudo;
import dio_desafio_dominio.Curso;
import dio_desafio_dominio.Dev;
import dio_desafio_dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Fundamentos do Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Angular");
        curso2.setDescricao("Fundamentos do Angular");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de carreira de java");
        mentoria.setData(LocalDate.now());

        System.out.println("----------------");

        // Bootcamps

        Bootcamp novoBootcamp = new Bootcamp();
        novoBootcamp.setNome("Bootcamp de java");
        novoBootcamp.setDescricao("Descrição do bootcamp de angular");
        novoBootcamp.getConteudos().add(curso1);
        novoBootcamp.getConteudos().add(curso2);
        novoBootcamp.getConteudos().add(mentoria);

        // Usuários 

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson"); //Instanciando nome do dev
        devAnderson.inscreverBootcamp(novoBootcamp); //Inscrevendo em um bootcamp
        System.out.println(devAnderson.getNome() +" Bootcamps Inscritos: " + devAnderson.getConteudosInscritos() + "\n");
        System.out.println("Bootcamps finalizados: " + devAnderson.getConteudosConcluidos());
        // Finalizando um curso, calculando o xp e progredir.
        System.out.println(novoBootcamp.getNome() + " Finalizado! Recebeu mais " + Conteudo.getXpDefault() +" de XP ");
        devAnderson.progredir(); // A cada curso terminado proguedir uma vez, e remover o curso em questão.
        
        System.out.println("Anderson agora tem: " + devAnderson.calcularTotalXp() + " de XP");


        System.out.println("Soma do XP: " + Conteudo.getXpDefault() + " (XP DEFAULT) + "+ curso1.getCargaHoraria() +" (carga horária do último curso). \n");
        devAnderson.progredir(); 
        
        //bootcamps concluidos:

        System.out.println(devAnderson.getNome() + " " + curso2.getTitulo() + " Finalizado! Recebeu mais " + Conteudo.getXpDefault() +" (XP DEFAULT) + " + curso2.getCargaHoraria() + " (carga horária) de XP!");
        System.out.println("Anderson agora tem: " + devAnderson.calcularTotalXp() + " de XP \n");
        System.out.println("Bootcamps concluidos: "+ devAnderson.getConteudosConcluidos() + "\n");
        System.out.println(devAnderson.getNome() +" Cursos Inscritos: " + devAnderson.getConteudosInscritos() + "\n");
        
        Dev devJoao = new Dev();
        devJoao.inscreverBootcamp(novoBootcamp);
        System.out.println("Joao Bootcamps Incritos: " + devJoao.getConteudosInscritos());
        System.out.println("João XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("João XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();


        


    }
}
