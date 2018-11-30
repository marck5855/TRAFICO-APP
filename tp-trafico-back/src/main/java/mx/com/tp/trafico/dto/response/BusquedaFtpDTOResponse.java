package mx.com.tp.trafico.dto.response;

import java.io.Serializable;


import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

public class BusquedaFtpDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4130486614742277027L;
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
