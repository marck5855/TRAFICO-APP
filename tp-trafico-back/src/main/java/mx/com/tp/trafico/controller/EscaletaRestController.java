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

import mx.com.tp.trafico.dto.request.ActualizaEscaletaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaEscaletaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentTodosDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaEscaletaDTOResponse;
import mx.com.tp.trafico.service.EscaletaService;

@RestController
@RequestMapping("/escaleta")
public class EscaletaRestController {

	@Autowired
	public EscaletaService escaletaService;

	@GetMapping("/list")
	public ResponseEntity<ConsultaEscaletaDTOResponse> consultaEscaletas() {
		ConsultaEscaletaDTOResponse responseManager = escaletaService.listaEscaletas();
		return new ResponseEntity<ConsultaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<GuardaEscaletaDTOResponse> guardarEscaleta(@RequestBody GuardaEscaletaDTORequest request) {
		GuardaEscaletaDTOResponse responseManager = escaletaService.guardarEscaleta(request);
		return new ResponseEntity<GuardaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaEscaletaDTOResponse> buscarByIdEscaleta(@PathVariable(value = "id") Long idEscaleta) {
		BusquedaEscaletaDTOResponse responseManager = escaletaService.busquedaEscaletaId(idEscaleta);
		return new ResponseEntity<BusquedaEscaletaDTOResponse>(responseManager, HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaEscaletaDTOResponse> actualizaEscaleta(
			@RequestBody ActualizaEscaletaDTORequest request, @PathVariable(value = "id") Long idEscaleta) {
		ActualizaEscaletaDTOResponse responseManager = escaletaService.actualizarEscaleta(request, idEscaleta);
		return new ResponseEntity<ActualizaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaEscaletaDTOResponse> eliminaEscaleta(@PathVariable(value = "id") Long idEscaleta) {
		EliminaEscaletaDTOResponse responseManager = escaletaService.eliminarEscaletaId(idEscaleta);
		return new ResponseEntity<EliminaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
	}

	@GetMapping("/find/identificador/{identificador}")
	public ResponseEntity<BusquedaEscaletaIdentTodosDTOResponse> buscarIdentificadorTodosEscaleta(
			@PathVariable(value = "identificador") String idEscaleta) {
		BusquedaEscaletaIdentTodosDTOResponse responseManager = escaletaService.busquedaEscaletaIdentTodos(idEscaleta);
		return new ResponseEntity<BusquedaEscaletaIdentTodosDTOResponse>(responseManager, HttpStatus.OK);
	}

}
