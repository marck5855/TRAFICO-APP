package mx.com.tp.trafico.dto.response;

import java.util.List;

import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;

public class ConsultaFtpDTOResponse{
	
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
