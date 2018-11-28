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
import mx.com.tp.trafico.dto.request.ActualizaSpotDTORequest;
import mx.com.tp.trafico.dto.request.GuardaEscaletaDTORequest;
import mx.com.tp.trafico.dto.request.GuardaSpotDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.ActualizaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaEscaletaIdentTodosDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaEscaletaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaSpotDTOResponse;
import mx.com.tp.trafico.manager.EscaletaManager;
import mx.com.tp.trafico.manager.SpotManager;

@RestController
@RequestMapping("/escaleta")
public class EscaletaRestController {

	@Autowired
	public EscaletaManager escaletaManager;
	
	@GetMapping("/list")
	public ResponseEntity<ConsultaEscaletaDTOResponse> consultaEscaletas(){
		ConsultaEscaletaDTOResponse responseManager = escaletaManager.listaEscaletas();
		return new ResponseEntity<ConsultaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaEscaletaDTOResponse> guardarEscaleta(@RequestBody GuardaEscaletaDTORequest request){
		GuardaEscaletaDTOResponse responseManager = escaletaManager.guardarEscaleta(request);
		return new ResponseEntity<GuardaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaEscaletaDTOResponse> buscarByIdEscaleta(@PathVariable(value="id") Long idEscaleta){
		BusquedaEscaletaDTOResponse responseManager = escaletaManager.busquedaEscaletaId(idEscaleta);
		return new ResponseEntity<BusquedaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaEscaletaDTOResponse> actualizaEscaleta(@RequestBody ActualizaEscaletaDTORequest request, @PathVariable(value="id") Long idEscaleta){
		ActualizaEscaletaDTOResponse responseManager = escaletaManager.actualizarEscaleta(request, idEscaleta);
		return new ResponseEntity<ActualizaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaEscaletaDTOResponse> eliminaEscaleta(@PathVariable(value="id") Long idEscaleta){
		EliminaEscaletaDTOResponse responseManager = escaletaManager.eliminarEscaletaId(idEscaleta);
		return new ResponseEntity<EliminaEscaletaDTOResponse>(responseManager, HttpStatus.OK);
	}
	
//	@GetMapping("/findByIdentTod/{identificador}")
//	public ResponseEntity<BusquedaEscaletaIdentTodosDTOResponse> buscarIdentificadorTodosEscaleta(@PathVariable(value="identificador") String identificador){
//		BusquedaEscaletaIdentTodosDTOResponse responseManager = escaletaManager.busquedaEscaletaIdentTodos(identificador);
//		return new ResponseEntity<BusquedaEscaletaIdentTodosDTOResponse>(responseManager, HttpStatus.OK);
//		
//	}
//	
//	@GetMapping("/findByIdent/{identificador}")
//	public ResponseEntity<BusquedaEscaletaIdentDTOResponse> buscarIdentificadorEscaleta(@PathVariable(value="identificador") String identificador){
//		BusquedaEscaletaIdentDTOResponse responseManager = escaletaManager.busquedaEscaletaIdent(identificador);
//		return new ResponseEntity<BusquedaEscaletaIdentDTOResponse>(responseManager, HttpStatus.OK);
//		
//	}
}
