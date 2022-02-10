package clases;

public class MotorElectricoAdapter extends Motor{

	private MotorElectrico motorElectrico;

	public MotorElectricoAdapter(){
		super();
		System.out.println("\tCreando motor electrico adapter.");
		this.motorElectrico = new MotorElectrico();        
	}
	@Override
	public void encender() {
		System.out.println("\tEncendiendo motor electrico adapter.");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("\tAcelerando motor electrico adapter.");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("\tApagando motor electrico adapter.");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}
}
