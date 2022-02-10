package clases;

public class MotorComun extends Motor {

    public MotorComun(){
        super();
        System.out.println("\tCreando motor comun.");
    }

    @Override
    public void encender() {
        System.out.println("\tEncendiendo motor comun.");
    }

    @Override
    public void acelerar() {
        System.out.println("\tAcelerando motor comun.");
    }

    @Override
    public void apagar() {
        System.out.println("\tApagando motor comun.");
    }
}

