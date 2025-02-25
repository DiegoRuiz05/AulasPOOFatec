package Empresa;

public class CadastroEmpregado {
    public static void main(String[] args) {
        Empregado minhaEmpresa = new Empregado("Diego", "Google", 2000.0, "40028922", "solteiro", "Tenho");

        System.out.println("Nome do empregado:"+ minhaEmpresa.getNome()+ "\nEmpresa.Empresa: "+minhaEmpresa.getEmpresa()+"\nSalário: "+minhaEmpresa.getSalario()+ "\nCNPJ: "+ minhaEmpresa.getCnpj()+"\nRazão Social: "+minhaEmpresa.getRazaoSocial()+"\nFone: "+minhaEmpresa.getFone());




    }
}
