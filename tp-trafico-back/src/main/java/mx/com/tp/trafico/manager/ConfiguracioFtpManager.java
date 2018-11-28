package mx.com.tp.trafico.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.tp.trafico.dto.request.ActualizaFtpDTORequest;
import mx.com.tp.trafico.dto.request.GuardaFtpDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaFtpDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;
import mx.com.tp.trafico.service.ConfiguracionFtpService;

@Component
public class ConfiguracioFtpManager {

	@Autowired
	public ConfiguracionFtpService configuracionFtpService;

	public ConsultaFtpDTOResponse consultaFtp() {
		List<TpTraficoConfiguracionFtp> listFtp = null;
		try {
			listFtp = configuracionFtpService.findAll();
		} catch (Exception ex) {

		}
		return new ConsultaFtpDTOResponse(listFtp);

	}

	public GuardaFtpDTOResponse guardaFtp(GuardaFtpDTORequest request) {
		boolean success = false;

		try {
			configuracionFtpService.save(request.getFtp());
			success = true;
		} catch (Exception ex) {

		}
		return new GuardaFtpDTOResponse(success);

	}

	public BusquedaFtpDTOResponse buscarFtpId(Long id) {
		boolean success = false;
		TpTraficoConfiguracionFtp ftp = null;
		try {
			ftp = configuracionFtpService.findById(id);
			if (ftp != null) {
				success = true;
			}
		} catch (Exception ex) {

		}
		return new BusquedaFtpDTOResponse(success, ftp);

	}

	public EliminaFtpDTOResponse eliminaFtp(Long id) {
		boolean success = false;
		try {
			configuracionFtpService.delete(id);
			success = true;
		} catch (Exception ex) {

		}
		return new EliminaFtpDTOResponse(success);
	}

	public ActualizaFtpDTOResponse actualizaFtp(ActualizaFtpDTORequest request, Long id) {
		boolean success = false;
		TpTraficoConfiguracionFtp ftp = null;
		try {
			ftp = configuracionFtpService.findById(id);
			ftp.setIpServidor(request.getIpServidor());
			ftp.setPassword(request.getPassword());
			ftp.setUsuario(request.getUsuario());
			configuracionFtpService.save(ftp);
			success = true;

		} catch (Exception ex) {

		}
		return new ActualizaFtpDTOResponse(success);

	}
}
