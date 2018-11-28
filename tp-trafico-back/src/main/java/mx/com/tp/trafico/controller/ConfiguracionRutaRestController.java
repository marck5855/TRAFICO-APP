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

import mx.com.tp.trafico.dto.request.ActualizaRutaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaRutaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminarRutaDTOResponse;
import mx.com.tp.trafico.dto.request.GuardaRutaDTORequest;
import mx.com.tp.trafico.dto.response.GuardaRutaDTOResponse;
import mx.com.tp.trafico.manager.ConfiguracioRutaManager;

@RestController
@RequestMapping("/ruta")
public class ConfiguracionRutaRestController {

	@Autowired
	private ConfiguracioRutaManager configuracioRutaManager;
	
	@GetMapping("/list")
	public  ResponseEntity<ConsultaRutaDTOResponse> consultaRutas() {
		ConsultaRutaDTOResponse responseManager = configuracioRutaManager.consultaRuta();
		return new ResponseEntity<ConsultaRutaDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaRutaDTOResponse> guardarRuta(@RequestBody GuardaRutaDTORequest request) {
		System.out.println(ToStringBuilder.reflectionToString(request));
		GuardaRutaDTOResponse responseManager = configuracioRutaManager.guardaRuta(request);
		return new ResponseEntity<GuardaRutaDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminarRutaDTOResponse> eliminarRuta(@PathVariable(value="id") Long idruta) {
		EliminarRutaDTOResponse responseManager = configuracioRutaManager.eliminaRuta(idruta);
		return new ResponseEntity<EliminarRutaDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaRutaDTOResponse> busquedaRuta(@PathVariable(value="id") Long idruta) {
		BusquedaRutaDTOResponse responseManager = configuracioRutaManager.buscaRuta(idruta);
		return new ResponseEntity<BusquedaRutaDTOResponse>(responseManager , HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaRutaDTOResponse> actualizarRuta(@RequestBody ActualizaRutaDTORequest request, @PathVariable(value="id") Long idruta){
		ActualizaRutaDTOResponse responseManager = configuracioRutaManager.actualizaRuta(request, idruta);
		return new ResponseEntity<ActualizaRutaDTOResponse>(responseManager, HttpStatus.OK);
	}
}
