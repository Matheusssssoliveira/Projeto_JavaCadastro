public class Caixa extends Funcionario implements Subordinado {

    public void Atividade(){
        System.out.println("Atividade: Administrar movimentação financeira, prestar informção.");
    }

    @Override
    public String superior() {
        return "Superior direto: Gerente.";
    }

}
