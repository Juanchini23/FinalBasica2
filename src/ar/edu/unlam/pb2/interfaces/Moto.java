package ar.edu.unlam.pb2.interfaces;

public class Moto extends MedioTransporte implements Multeable{

	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS=2;
	private Integer velocidadMaximaPermitida;
	private String patente;
	
	public Moto(String patente, Integer velocidadMaximaPermitida ,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.velocidadMaximaPermitida=velocidadMaximaPermitida;
		this.patente=patente;
	}

	
	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public Integer getVelocidadMaximaPermitida() {
		return velocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		this.velocidadMaximaPermitida = velocidadMaximaPermitida;
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}


	@Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
		return null;
	}


	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {
		// TODO Auto-generated method stub
		return null;
	}

//
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
