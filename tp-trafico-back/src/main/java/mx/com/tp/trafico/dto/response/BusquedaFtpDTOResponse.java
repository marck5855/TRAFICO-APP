package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusquedaFtpDTOResponse {
	
	TpTraficoConfiguracionFtp ftp;
	protected boolean busqueda;
	
	public BusquedaFtpDTOResponse(boolean busqueda, TpTraficoConfiguracionFtp ftp) {
		this.busqueda = busqueda;
		this.ftp = ftp;
	}

	public TpTraficoConfiguracionFtp getFtp() {
		return ftp;
	}

	public void setFtp(TpTraficoConfiguracionFtp ftp) {
		this.ftp = ftp;
	}

	public boolean isBusqueda() {
		return busqueda;
	}

	public void setBusqueda(boolean busqueda) {
		this.busqueda = busqueda;
	}
	
	
}
