public final class Aluno extends Pessoa{

    private double nota1, nota2, nota3;
    private double media;

    public Aluno() {

    }

    public Aluno(String nome, int idade, double nota1, double nota2, double nota3) {
        super(nome,idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public  void calcMed(){
        media = (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao(){

        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }

    @Override
    public String toString() {
        return super.toString()+"Aluno{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                '}';
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }
}
