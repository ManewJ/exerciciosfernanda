public class Disciplina {
    public void cadastrarAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void ministrarDisciplina(Professor professor) {
        this.professor = professor;
    }
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
