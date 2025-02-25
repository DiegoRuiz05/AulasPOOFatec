package Empresa;

public class Empregado extends Empresa {
    private String nome,empresa;
    private double salario;

    public Empregado(String nome, String empresa, double salario, String cnpj, String razaoSoc, String fone) {
        this.nome = nome;
        this.empresa = empresa;
        this.salario = salario;
        setCnpj(cnpj);
        setRazaoSocial(razaoSoc);
        setFone(fone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
