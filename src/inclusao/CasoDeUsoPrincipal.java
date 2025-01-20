package inclusao;

public class CasoDeUsoPrincipal {
    private CasoDeUsoAuxiliar auxiliar;

    public void executar() {
        auxiliar.executar();
        System.out.println("Execução principal");
    }
}

