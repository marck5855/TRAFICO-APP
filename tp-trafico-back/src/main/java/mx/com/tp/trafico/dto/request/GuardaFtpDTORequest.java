package mx.com.tp.trafico.dto.request;

import java.io.Serializable;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

public class GuardaFtpDTORequest implements Serializable{

	private static final long serialVersionUID = -8354259175603930632L;
	
	private TpTraficoConfiguracionFtp ftp;

	public TpTraficoConfiguracionFtp getFtp() {
		return ftp;
	}

	public void setFtp(TpTraficoConfiguracionFtp ftp) {
		this.ftp = ftp;
	}

}
