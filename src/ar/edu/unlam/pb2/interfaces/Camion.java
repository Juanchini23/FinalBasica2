package ar.edu.unlam.pb2.interfaces;

public class Camion extends MedioTransporte implements Multeable{

	private Integer pesoMaximoPermitido;
	private Integer velocidadMaximaPermitida;
	private String patente;
	private final Integer CARGA_MAXIMA_PERMITIDA=500;
	
	public Camion(String patente,Integer velocidadMaximaPermitida,Integer pesoMaximoPermitido,Double latitud, Double longitud) {
		super(latitud, longitud);
		this.pesoMaximoPermitido=pesoMaximoPermitido;
		this.velocidadMaximaPermitida=velocidadMaximaPermitida;
		this.patente=patente;
	}
	
	

	public String getPatente() {
		return patente;
	}



	public void setPatente(String patente) {
		this.patente = patente;
	}



	public Integer getPesoMaximoPermitido() {
		return pesoMaximoPermitido;
	}

	public void setPesoMaximoPermitido(Integer pesoMaximoPermitido) {
		this.pesoMaximoPermitido = pesoMaximoPermitido;
	}

	public Integer getVelocidadMaximaPermitida() {
		return velocidadMaximaPermitida;
	}

	public void setVelocidadMaximaPermitida(Integer velocidadMaximaPermitida) {
		this.velocidadMaximaPermitida = velocidadMaximaPermitida;
	}

	public Integer getCarga(){
		return CARGA_MAXIMA_PERMITIDA;
	}

	@Override
	public Boolean superoVelocidadMaxima() throws VelocidadMaximaException {
			return false;
	}



	@Override
	public Boolean superoPesoMaximoCarga() throws PesoMaximoException {

		Boolean aux=false;
			if(pesoMaximoPermitido>CARGA_MAXIMA_PERMITIDA){
				aux=true;
				throw new PesoMaximoException();
			}	
			
			return aux;
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
