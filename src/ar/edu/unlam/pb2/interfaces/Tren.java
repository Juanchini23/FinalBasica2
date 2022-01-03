package ar.edu.unlam.pb2.interfaces;

public class Tren extends MedioTransporte{

	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaximaPermitida;
	
	public Tren(Integer cantidadDeVagones,Integer cantidadDePasajerosPorVagon,
			Integer velocidadMaximaPermitida, Double latitud, Double longitud) {
		super(latitud, longitud);
		// TODO Auto-generated constructor stub
		this.cantidadDePasajerosPorVagon=cantidadDePasajerosPorVagon;
		this.velocidadMaximaPermitida=velocidadMaximaPermitida;
		this.cantidadDeVagones=cantidadDeVagones;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaximaPermitida() {
		return velocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		this.velocidadMaximaPermitida = velocidadMaximaPermitida;
	}
	
	

}
