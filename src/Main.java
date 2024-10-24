
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        Aluno aluno = new Aluno("João", 80, 6.0, 2.0, 10.0);
        Disciplina d = new Disciplina();

        System.out.print("Digite o nome do aluno: ");
        a.setNome(scanner.next());

        System.out.print("Digite a primeira nota: ");
        a.setNota1(scanner.nextDouble());

        System.out.print("Digite a segunda nota: ");
        a.setNota2(scanner.nextDouble());

        System.out.print("Digite a terceira nota: ");
        a.setNota3(scanner.nextDouble());

        System.out.println("Digite a idade do aluno: ");
        p.setIdade(scanner.nextInt());

        System.out.println("Digite o nome da disciplina: ");
        d.setNome(scanner.next());

        a.calcMed();
        a.verificarAprovacao();


        System.out.print("Digite o nome do professor: ");
        p.setNome(scanner.next());

        System.out.print("Digite a idade do professor: ");
        p.setIdade(scanner.nextInt());

        System.out.print("Digite o salário do professor: ");
        p.setSalario(scanner.nextDouble());



        System.out.println("informações do Professor: ");
        System.out.println(p);

        System.out.println("Informações do Aluno: ");
        System.out.println(a);

        d.cadastrarAluno(a);
        d.ministrarDisciplina(p);

        System.out.println("Informações da Disciplina: ");
        System.out.println(d);





        }
    }
