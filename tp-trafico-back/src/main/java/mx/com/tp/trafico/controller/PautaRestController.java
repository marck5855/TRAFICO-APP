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

import mx.com.tp.trafico.dto.request.ActualizaPautaDTORequest;
import mx.com.tp.trafico.dto.request.BusquedaFechasPautaDTORequest;
import mx.com.tp.trafico.dto.request.BusquedaPautaFechaDTORequeat;
import mx.com.tp.trafico.dto.request.GuardaPautaDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaPautaTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaFechaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaPautaFechaDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaPautaDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaPautaDTOResponse;
import mx.com.tp.trafico.service.PautaService;

@RestController
@RequestMapping("/pauta")
public class PautaRestController {

	@Autowired
	public PautaService pautaService;
	
	@GetMapping("/list")
	public ResponseEntity<ConsultaPautaDTOResponse> consultaRutas(){
		ConsultaPautaDTOResponse responseManager = pautaService.listaPautas();
		return new ResponseEntity<ConsultaPautaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaPautaDTOResponse> guardarRuta(@RequestBody GuardaPautaDTORequest request){
		GuardaPautaDTOResponse responseManager = pautaService.guardarPauta(request);
		return new ResponseEntity<GuardaPautaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaPautaDTOResponse> buscarByIdRuta(@PathVariable(value="id") Long idPauta){
		BusquedaPautaDTOResponse responseManager = pautaService.busquedaPautaId(idPauta);
		return new ResponseEntity<BusquedaPautaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaPautaTOResponse> actualizaRuta(@RequestBody ActualizaPautaDTORequest request, @PathVariable(value="id") Long idPauta){
		ActualizaPautaTOResponse responseManager = pautaService.actualizarPauta(request, idPauta);
		return new ResponseEntity<ActualizaPautaTOResponse>(responseManager, HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaPautaDTOResponse> eliminaRuta(@PathVariable(value="id") Long idPauta){
		EliminaPautaDTOResponse responseManager = pautaService.eliminarPautaId(idPauta);
		return new ResponseEntity<EliminaPautaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	//Busqueda de fechas de pauta por nombre de canal
	@PostMapping("/fecha/nombre")
	public ResponseEntity<BusquedaFechaPautaDTOResponse> busquedafechas(@RequestBody BusquedaFechasPautaDTORequest request){
		BusquedaFechaPautaDTOResponse responseManager = pautaService.busquedaFechaPauta(request);
		return new ResponseEntity<BusquedaFechaPautaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	//busqueda de pautas por fecha y id de canal
	@PostMapping("/list/fecha")
	public ResponseEntity<BusquedaPautaFechaDTOResponse> busquedaPautaFecha(@RequestBody BusquedaPautaFechaDTORequeat request){
		BusquedaPautaFechaDTOResponse responseManager = pautaService.busquedaPautaFecha(request);
		return new ResponseEntity<BusquedaPautaFechaDTOResponse>(responseManager, HttpStatus.OK);
		
	}
}
