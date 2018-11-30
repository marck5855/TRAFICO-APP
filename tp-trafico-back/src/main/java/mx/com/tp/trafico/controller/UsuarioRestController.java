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

import mx.com.tp.trafico.dto.request.ActualizaUsuarioDTORequest;
import mx.com.tp.trafico.dto.request.GuardaUsuarioDTORequest;
import mx.com.tp.trafico.dto.response.ActualizaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.BusquedaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.ConsultaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.EliminaUsuarioDTOResponse;
import mx.com.tp.trafico.dto.response.GuardaUsuarioDTOResponse;
import mx.com.tp.trafico.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

	@Autowired
	public UsuarioService usuarioService;
	
	@GetMapping("/list")
	public ResponseEntity<ConsultaUsuarioDTOResponse> consultaUsuario(){
		ConsultaUsuarioDTOResponse responseManager = usuarioService.consultaUsuario();
		return new ResponseEntity<ConsultaUsuarioDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<GuardaUsuarioDTOResponse> guardarUsuario(@RequestBody GuardaUsuarioDTORequest request){
		GuardaUsuarioDTOResponse responseManager = usuarioService.guardarUsuario(request);
		return new ResponseEntity<GuardaUsuarioDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<BusquedaUsuarioDTOResponse> buscarByIdUsuario(@PathVariable(value="id") Long idUsuario){
		System.out.println(ToStringBuilder.reflectionToString(idUsuario));
		BusquedaUsuarioDTOResponse responseManager = usuarioService.buscarUsuarioId(idUsuario);
		return new ResponseEntity<BusquedaUsuarioDTOResponse>(responseManager, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ActualizaUsuarioDTOResponse> actualizaUsuario(@RequestBody ActualizaUsuarioDTORequest request, @PathVariable(value="id") Long id){
		System.out.println(ToStringBuilder.reflectionToString(request));
		ActualizaUsuarioDTOResponse responseManager = usuarioService.actualizaUsuario(request, id);
		return new ResponseEntity<ActualizaUsuarioDTOResponse>(responseManager, HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<EliminaUsuarioDTOResponse> eliminaUsuario(@PathVariable(value="id") Long id){
		EliminaUsuarioDTOResponse responseManager = usuarioService.eliminarUsuario(id);
		return new ResponseEntity<EliminaUsuarioDTOResponse>(responseManager, HttpStatus.OK);
		
	}
}
