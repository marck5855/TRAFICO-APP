package mx.com.tp.trafico.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import mx.com.tp.trafico.vo.CanalVO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActualizaFtpDTOResponse {

	protected boolean success;
	
	public ActualizaFtpDTOResponse(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
