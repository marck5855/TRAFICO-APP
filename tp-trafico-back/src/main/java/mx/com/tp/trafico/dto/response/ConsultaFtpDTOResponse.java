package mx.com.tp.trafico.dto.response;

import java.io.Serializable;
import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

public class ConsultaFtpDTOResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3081269243354669622L;
	private List<TpTraficoConfiguracionFtp> ftps;

	public ConsultaFtpDTOResponse(List<TpTraficoConfiguracionFtp> ftps) {
		this.ftps = ftps;
	}

	public List<TpTraficoConfiguracionFtp> getFtps() {
		return ftps;
	}

	public void setFtps(List<TpTraficoConfiguracionFtp> ftps) {
		this.ftps = ftps;
	}
}
