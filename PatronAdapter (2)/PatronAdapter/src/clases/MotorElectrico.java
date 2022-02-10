package clases;

public class MotorElectrico {

    private boolean conectado = false;

    public MotorElectrico() {
        System.out.println("\tCreando motor electrico.");
        this.conectado = false;
    }

    public void conectar() {
        System.out.println("\tConectando motor electrico.");
        this.conectado = true;
    }

    public void activar() {
        if (!this.conectado) {
            System.out.println("\tNo se puede activar porque no esta conectado el motor electrico.");
        } else {
            System.out.println("\tEsta conectado, activando motor electrico.");
        }
    }

    public void moverMasRapido() {
        if (!this.conectado) {
            System.out.println("\tNo se puede mover rapido el motor electrico porque no esta conectado.");
        } else {
            System.out.println("\tMoviendo mas rapido, aumentando voltaje del motor electrico.");
        }
    }

    public void detener() {
        if (!this.conectado) {
            System.out.println("\tNo se puede detener motor electrico porque no esta conectado.");
        } else {
            System.out.println("\tDeteniendo motor electrico.");
        }
    }

    public void desconectar() {
        System.out.println("\tDesconectando motor electrico.");
        this.conectado = false;
    }
}

