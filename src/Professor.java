public final class Professor extends Pessoa {
    public Cargo cargo;

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"Professor{" +
                "salario=" + salario +
                '}';
    }

    public void calcularSalario(){

    }

    @Override
    public void quemSouEu() {
        System.out.println("prof");

    }

    @Override
    public void minhaAtividade() {
        System.out.println("ensinar");
    }
}
