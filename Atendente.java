public class Atendente extends Funcionario implements Subordinado {
    public void Atividade(){
        System.out.println("Atividade: fazer atendimento, anotar pedidos, prestar informação.");
    }

    @Override
    public String superior() {
        return "Superior direto: Gerente.";
    }
}
