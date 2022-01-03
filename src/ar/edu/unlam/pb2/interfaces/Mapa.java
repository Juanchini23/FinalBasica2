package ar.edu.unlam.pb2.interfaces;

import java.util.*;

public class Mapa {

	private String ciudad;
	private List<MedioTransporte> vehiculos;

	public Mapa(String ciudad) {
		this.ciudad = ciudad;
		this.vehiculos= new ArrayList<MedioTransporte>();
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void agregarVehiculo(MedioTransporte o) throws PesoMaximoException {
		
			for (MedioTransporte a : vehiculos) {
				if(a.getLatitud().equals(o.getLatitud()) && a.getLongitud().equals(o.getLongitud())) {
					throw new PesoMaximoException();
				}
			}
			vehiculos.add(o);
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}

	
	public Boolean hayCoalición() throws ColitionException {
		Boolean aux=false;
	
		for (int i = 0; i < vehiculos.size(); i++){
			for (int j = 0; j < vehiculos.size(); j++) {
				if(vehiculos.get(i).getLatitud().equals(vehiculos.get(j).getLatitud()) && 
						vehiculos.get(i).getLongitud().equals(vehiculos.get(j).getLongitud())&& i!=j){
					aux=true;
					throw new ColitionException();
				}
			}
		}
		
		return aux;
	}
}
