import java.util.ArrayList;
public class Cadastrados {
    private ArrayList<Funcionario> funcionarios= new ArrayList<>();

    public void cadastrar_f(Funcionario f){
        funcionarios.add(f);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_a( Atendente at01){
        funcionarios.add(at01);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_c( Caixa caixa){
        funcionarios.add(caixa);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_g( Gerente gerente){
        funcionarios.add(gerente);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }

    public void cadastrar_l( Lancheiro lancheiro){
        funcionarios.add(lancheiro);

        System.out.println("Funcionário cadastrado com sucesso.\n");
    }


    public void listar(){
        System.out.println("\nInformações Cadastradas\n");
        for(Funcionario f: funcionarios){
            if (f instanceof Atendente) {
                Atendente at = (Atendente) f;
                System.out.println("\n"+TipoFuncionario.ATENDENTE+":");
            }else if (f instanceof Caixa) {
                Caixa cx = (Caixa) f;
                System.out.println("\n"+TipoFuncionario.CAIXA+":");
            } else if (f instanceof Gerente) {
                Gerente gerente = (Gerente) f;
                System.out.println("\n"+TipoFuncionario.GERENTE+":");
            } else if (f instanceof Lancheiro) {
                Lancheiro lancheiro = (Lancheiro) f;
                System.out.println("\n"+TipoFuncionario.LANCHEIRO+":");
            }

            System.out.println("Matrícula: "+f.getMatricula());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Idade: " + f.getIdade());
            System.out.println("Telefone: " + f.getTelefone());
            System.out.println("Endereço: " + f.getEndereco());
            System.out.println("E-mail: " + f.getEmail());
            System.out.println("Tempo de trabalho: " + f.getTempo_trabalho()+" (Horas/mês)");

            if (f instanceof Atendente){
                Atendente atendente = new Atendente();
                atendente.Atividade();
                System.out.println(atendente.superior());
            }else if (f instanceof Caixa){
                Caixa caixa = new Caixa();
                caixa.Atividade();
                System.out.println(caixa.superior());
            }else if (f instanceof Gerente){
                Gerente gerente = new Gerente();
                gerente.Atividade();
            }else if (f instanceof Lancheiro){
                Lancheiro lancheiro = new Lancheiro();
                lancheiro.Atividade();
                System.out.println(lancheiro.superior());
            }



        }

    }


}

