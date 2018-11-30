package mx.com.tp.trafico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.ConfiguracionFtpDAO;
import mx.com.tp.trafico.dto.request.ActualizaFtpDTORequest;
import mx.com.tp.trafico.dto.request.GuardaFtpDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaFtpDTOResponse;
import mx.com.tp.trafico.entity.TpTraficoConfiguracionFtp;
import mx.com.tp.trafico.service.ConfiguracionFtpService;

@Service
public class ConfiguracionFtpServiceImpl implements ConfiguracionFtpService {

	@Autowired
	public ConfiguracionFtpDAO configuracionFtpDAO;

	@Override
	public ConsultaFtpDTOResponse consultaFtp() {
		List<TpTraficoConfiguracionFtp> listFtp = null;
		try {
			listFtp = configuracionFtpDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaFtpDTOResponse(listFtp);

	}

	@Override
	public GuardaFtpDTOResponse guardaFtp(GuardaFtpDTORequest request) {
		boolean success = false;

		try {
			configuracionFtpDAO.save(request.getFtp());
			success = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaFtpDTOResponse(success);

	}

	@Override
	public BusquedaFtpDTOResponse buscarFtpId(Long id) {
		boolean success = false;
		TpTraficoConfiguracionFtp ftp = null;
		try {
			boolean existe = false;
			existe = configuracionFtpDAO.existsById(id);
			if (existe == true) {
				ftp = configuracionFtpDAO.findById(id).orElse(null);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaFtpDTOResponse(success, ftp);

	}

	@Override
	public EliminaFtpDTOResponse eliminaFtp(Long id) {
		boolean success = false;
		try {
			boolean existe = false;
			existe = configuracionFtpDAO.existsById(id);
			if (existe == true) {
				configuracionFtpDAO.deleteById(id);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaFtpDTOResponse(success);
	}

	@Override
	public ActualizaFtpDTOResponse actualizaFtp(ActualizaFtpDTORequest request, Long id) {
		boolean success = false;
		TpTraficoConfiguracionFtp ftp = null;
		try {
			boolean existe = false;
			existe = configuracionFtpDAO.existsById(id);
			if (existe == true) {
				ftp = configuracionFtpDAO.findById(id).orElse(null);
				ftp.setIpServidor(request.getIpServidor());
				ftp.setPassword(request.getPassword());
				ftp.setUsuario(request.getUsuario());
				configuracionFtpDAO.save(ftp);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaFtpDTOResponse(success);

	}

}
