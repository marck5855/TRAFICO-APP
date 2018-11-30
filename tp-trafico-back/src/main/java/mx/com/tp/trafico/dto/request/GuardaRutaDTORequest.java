package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionRuta;

public class GuardaRutaDTORequest implements Serializable{

	private static final long serialVersionUID = -8354259175603930632L;
	
	private TpTraficoConfiguracionRuta ruta;

	public TpTraficoConfiguracionRuta getRuta() {
		return ruta;
	}

	public void setRuta(TpTraficoConfiguracionRuta ruta) {
		this.ruta = ruta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
