public class Lancheiro extends Funcionario implements Subordinado{

    public void Atividade(){
        System.out.println("Atividade: Fazer produção de pedidos, agilidade e qualidade na produção.");
    }

    @Override
    public String superior() {
        return "Superior direto: Gerente.";
    }

}
