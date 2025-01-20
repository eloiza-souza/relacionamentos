package dependencia;

public class Carro {
    public void dirigir(Motor motor) { // Dependência
        motor.ligar();
    }
}

