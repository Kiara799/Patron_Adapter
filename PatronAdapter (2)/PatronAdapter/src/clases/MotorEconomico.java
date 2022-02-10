package clases;

public class MotorEconomico extends Motor {

    public MotorEconomico(){
        super();
        System.out.println("\tCreando motor economico.");
    }

    @Override
    public void encender() {
        System.out.println("\tEncendiendo motor economico.");
    }

    @Override
    public void acelerar() {
        System.out.println("\tAcelerando el motor economico.");
    }

    @Override
    public void apagar() {
        System.out.println("\tApagando motor economico.");
    }
}

