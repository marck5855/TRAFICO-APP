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

import mx.com.tp.trafico.dto.request.ActualizaSpotDTORequest;
import mx.com.tp.trafico.dto.request.GuardaSpotDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaSpotDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaSpotDTOResponse;
import mx.com.tp.trafico.manager.SpotManager;

@RestController
@RequestMapping("/spot")
public class SpotRestController {

	@Autowired
	public SpotManager spotManager;
	
	@GetMapping("/list")
	public ResponseEntity<ConsultaSpotDTOResponse> consultaSpots(){
		ConsultaSpotDTOResponse responseManager = spotManager.listaSpots();
		return new ResponseEntity<ConsultaSpotDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaSpotDTOResponse> guardarSpot(@RequestBody GuardaSpotDTORequest request){
		GuardaSpotDTOResponse responseManager = spotManager.guardarSpot(request);
		return new ResponseEntity<GuardaSpotDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaSpotDTOResponse> buscarByIdSpot(@PathVariable(value="id") Long idspot){
		BusquedaSpotDTOResponse responseManager = spotManager.busquedaSpotId(idspot);
		return new ResponseEntity<BusquedaSpotDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaSpotDTOResponse> actualizaSpot(@RequestBody ActualizaSpotDTORequest request, @PathVariable(value="id") Long idspot){
		ActualizaSpotDTOResponse responseManager = spotManager.actualizarSpot(request, idspot);
		return new ResponseEntity<ActualizaSpotDTOResponse>(responseManager, HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaSpotDTOResponse> eliminaSpot(@PathVariable(value="id") Long idspot){
		EliminaSpotDTOResponse responseManager = spotManager.eliminarSpotId(idspot);
		return new ResponseEntity<EliminaSpotDTOResponse>(responseManager, HttpStatus.OK);
		
	}
}
