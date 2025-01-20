package extensao;

public class CasoDeUsoExtendido extends CasoDeUsoBase {
    @Override
    public void executar() {
        super.executar();
        System.out.println("Execução estendida");
    }
}
