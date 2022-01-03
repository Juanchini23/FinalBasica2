package ar.edu.unlam.pb2.interfaces;

public class Auto extends MedioTransporte implements Multeable{

	private Integer cantidadMaximaPasajeros;
	private Integer velocidadMaximaPermitida;
	private Integer velocidadActual;
	private String patente;
	
	public Auto(String patente,Integer cantidadMaximaPasajeros,Integer velocidadMaximaPermitida,
			Integer velocidadActual,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadMaximaPasajeros=cantidadMaximaPasajeros;
		this.velocidadActual=velocidadActual;
		this.velocidadMaximaPermitida=velocidadMaximaPermitida;
		this.patente=patente;
	}

	public Auto(String patente,Integer cantidadMaximaPasajeros,Integer velocidadMaximaPermitida,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadMaximaPasajeros=cantidadMaximaPasajeros;
		this.velocidadActual=0;
		this.velocidadMaximaPermitida=velocidadMaximaPermitida;
		this.patente=patente;
	}



	public Integer getCantidadMaximaPasajeros() {
		return cantidadMaximaPasajeros;
	}



	public void setCantidadMaximaPasajeros(Integer cantidadMaximaPasajeros) {
		this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
	}



	public String getPatente() {
		return patente;
	}



	public void setPatente(String patente) {
		this.patente = patente;
	}



	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaPasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaPasajeros) {
		this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
	}

	public Integer getVelocidadMaximaPermitida() {
		return velocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		this.velocidadMaximaPermitida = velocidadMaximaPermitida;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}



	@Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
		Boolean aux=false;
		
		if(this.velocidadActual>this.velocidadMaximaPermitida){
			aux=true;
			throw new VelocidadMaximaException();
		}
		
		return aux;
	}

	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {
		// TODO Auto-generated method stub
		return null;
	}



//	@Override
//	public Boolean cruzoEnRojo() throws NoRespetoSemaforoException {
//		// TODO Auto-generated method stub
//		return null;
//	}



	@Override
	public Boolean estaEnRegla() throws FlojoDePapelesException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
