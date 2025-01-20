package composicao;

public class Casa {
    private Quarto quarto; // Composição

    public Casa() {
        this.quarto = new Quarto(); // O objeto quarto é instanciado dentro do construtor
    }
}

