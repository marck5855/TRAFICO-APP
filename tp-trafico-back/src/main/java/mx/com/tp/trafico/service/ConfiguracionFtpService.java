package mx.com.tp.trafico.service;

import mx.com.tp.trafico.dto.request.ActualizaFtpDTORequest;
import mx.com.tp.trafico.dto.request.GuardaFtpDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaFtpDTOResponse;

public interface ConfiguracionFtpService {

	public ConsultaFtpDTOResponse consultaFtp();
	
	public GuardaFtpDTOResponse guardaFtp(GuardaFtpDTORequest request);
	
	public BusquedaFtpDTOResponse buscarFtpId(Long id);

	public EliminaFtpDTOResponse eliminaFtp(Long id);
	
	public ActualizaFtpDTOResponse actualizaFtp(ActualizaFtpDTORequest request, Long id);
}
