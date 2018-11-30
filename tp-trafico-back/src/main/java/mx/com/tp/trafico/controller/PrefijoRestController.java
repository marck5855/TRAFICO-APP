package mx.com.tp.trafico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.tp.trafico.dto.response.BusquedaPrefijoDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaPrefijoDTOResponse;
import mx.com.tp.trafico.service.PrefijoService;

@RestController
@RequestMapping("/prefijo")
public class PrefijoRestController {

	@Autowired
	public PrefijoService prefijoService;
	
	@GetMapping("/list")
	public ResponseEntity<ConsultaPrefijoDTOResponse> listaPrefijos(){
		ConsultaPrefijoDTOResponse responseManager = prefijoService.consultaPrefijo();
		return new ResponseEntity<ConsultaPrefijoDTOResponse>(responseManager, HttpStatus.OK);
	}
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaPrefijoDTOResponse> buscaPrefijo(@PathVariable(value="id")Long id){
		BusquedaPrefijoDTOResponse responseManager = prefijoService.buscarPrefijo(id);
		return new ResponseEntity<BusquedaPrefijoDTOResponse>(responseManager, HttpStatus.OK);	
	}
	
}
