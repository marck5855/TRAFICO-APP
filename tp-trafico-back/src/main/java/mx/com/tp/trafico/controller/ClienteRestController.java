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

import mx.com.tp.trafico.dto.request.ActualizaClienteDTORequest;
import mx.com.tp.trafico.dto.request.GuardaClienteDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaClienteDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaClienteDTOResponse;
import mx.com.tp.trafico.manager.ClienteManager;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

	@Autowired
	private ClienteManager clienteManager;
	
	@GetMapping("/list")
	public ResponseEntity<ConsultaClienteDTOResponse> consultaClientes(){
		ConsultaClienteDTOResponse responseManager = clienteManager.listaClientes();
		return new ResponseEntity<ConsultaClienteDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaClienteDTOResponse> guardaCliente(@RequestBody GuardaClienteDTORequest request){
		System.out.println(ToStringBuilder.reflectionToString(request));
		GuardaClienteDTOResponse responseManager = clienteManager.guardarCanal(request);
		return new ResponseEntity<GuardaClienteDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaClienteDTOResponse> buscaClienteId(@PathVariable(value="id") Long id){
		BusquedaClienteDTOResponse responseManager = clienteManager.busquedaClienteId(id);
		return new ResponseEntity<BusquedaClienteDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaClienteDTOResponse> eliminaCliente(@PathVariable(value="id") Long id){
		EliminaClienteDTOResponse responseManager = clienteManager.eliminarClienteId(id);
		return new ResponseEntity<EliminaClienteDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaClienteDTOResponse> actualizaCliente(@RequestBody ActualizaClienteDTORequest request, @PathVariable(value="id") Long id){
		System.out.println(ToStringBuilder.reflectionToString(request));
		ActualizaClienteDTOResponse responseManager = clienteManager.actualizaCliente(request, id);
		return new ResponseEntity<ActualizaClienteDTOResponse>(responseManager, HttpStatus.OK);
		
	}
}
