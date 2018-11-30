package mx.com.tp.trafico.controller;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.tp.trafico.dto.request.ActualizaFtpDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaFtpDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaFtpDTOResponse;
import mx.com.tp.trafico.dto.request.GuardaFtpDTORequest;
import mx.com.tp.trafico.dto.response.GuardaFtpDTOResponse;
import mx.com.tp.trafico.service.ConfiguracionFtpService;

@RestController
@RequestMapping("/ftp")
public class ConfiguracionFtpRestController {

	@Autowired
	private ConfiguracionFtpService configuracionFtpService;
	
	@GetMapping("/list")
	public  ResponseEntity<ConsultaFtpDTOResponse> consultaFtps() {
		ConsultaFtpDTOResponse responseManager = configuracionFtpService.consultaFtp();
		return new ResponseEntity<ConsultaFtpDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaFtpDTOResponse> guardarFtp(@RequestBody GuardaFtpDTORequest request) {
		System.out.println(ToStringBuilder.reflectionToString(request));
		GuardaFtpDTOResponse responseManager = configuracionFtpService.guardaFtp(request);
		return new ResponseEntity<GuardaFtpDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaFtpDTOResponse> eliminarFtp(@PathVariable(value="id") Long idFtp) {
		EliminaFtpDTOResponse responseManager = configuracionFtpService.eliminaFtp(idFtp);
		return new ResponseEntity<EliminaFtpDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaFtpDTOResponse> busquedaFtp(@PathVariable(value="id") Long idFtp) {
		BusquedaFtpDTOResponse responseManager = configuracionFtpService.buscarFtpId(idFtp);
		return new ResponseEntity<BusquedaFtpDTOResponse>(responseManager , HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaFtpDTOResponse> actualizaFtp(@RequestBody ActualizaFtpDTORequest request, @PathVariable(value="id") Long idFtp){
		ActualizaFtpDTOResponse responseManager = configuracionFtpService.actualizaFtp(request, idFtp);
		return new ResponseEntity<ActualizaFtpDTOResponse>(responseManager, HttpStatus.OK);
	}
}
