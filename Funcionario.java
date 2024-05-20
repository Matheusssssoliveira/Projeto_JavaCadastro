public abstract class Funcionario {

    protected int matricula;
    private String nome;
    protected int idade;
    protected int cpf;
    protected long telefone;
    protected String endereco;
    protected String email;
    protected double salario;
    protected double tempo_trabalho;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTempo_trabalho() {
        return tempo_trabalho;
    }

    public void setTempo_trabalho(double tempo_trabalho) {
        this.tempo_trabalho = tempo_trabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Dados do Colaborador:\n" +
                "Matrícula: "+ getMatricula()+
                "\nNome: "+getNome()+
                "\nCPF: "+getCpf()+
                "\nIdade: "+getIdade()+
                "\nTelefone: "+getTelefone()+
                "\nEndereço: "+getEndereco()+
                "\nE-mail: "+getEmail()+
                "\nSalário: "+getSalario()+
                "\nHoras do mês: "+getTempo_trabalho();
    }
}
