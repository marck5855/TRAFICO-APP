package mx.com.tp.trafico.controller;

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

import mx.com.tp.trafico.dto.request.ActualizaCanalDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.BuscarCanalActivoDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaCanalDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaCanalDTOResponse;
import mx.com.tp.trafico.dto.request.GuardaCanalDTORequest;
import mx.com.tp.trafico.dto.response.GuardaCanalDTOResponse;
import mx.com.tp.trafico.service.CanalService;

@RestController
@RequestMapping("/canal")
public class CanalRestController {
	
	@Autowired
	private CanalService canalService;
	
	@GetMapping("/list")
	public  ResponseEntity<ConsultaCanalDTOResponse> consultaCanales() {
		ConsultaCanalDTOResponse responseManager = canalService.listaCanales();
		return new ResponseEntity<ConsultaCanalDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaCanalDTOResponse> guardarCanal(@RequestBody GuardaCanalDTORequest request) {
		GuardaCanalDTOResponse responseManager = canalService.guardarCanal(request);
		return new ResponseEntity<GuardaCanalDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaCanalDTOResponse> eliminarCanal(@PathVariable(value="id") Long idCanal) {
		EliminaCanalDTOResponse responseManager = canalService.eliminarCanalId(idCanal);
		return new ResponseEntity<EliminaCanalDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaCanalDTOResponse> busquedaCanal(@PathVariable(value="id") Long idCanal) {
		BusquedaCanalDTOResponse responseManager = canalService.busquedaCanalId(idCanal);
		return new ResponseEntity<BusquedaCanalDTOResponse>(responseManager , HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaCanalDTOResponse> actualizarCanal(@RequestBody ActualizaCanalDTORequest request, @PathVariable(value="id") Long idCanal){
		ActualizaCanalDTOResponse responseManager = canalService.actualizarCanal(request, idCanal);
		return new ResponseEntity<ActualizaCanalDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	@GetMapping("/list/activos")
	public ResponseEntity<BuscarCanalActivoDTOResponse> busquedaCanalActivo(){
		BuscarCanalActivoDTOResponse responseManager = canalService.busqudaCanalActivo();
		return new ResponseEntity<BuscarCanalActivoDTOResponse>(responseManager, HttpStatus.OK);
	}
	
	
	
}
