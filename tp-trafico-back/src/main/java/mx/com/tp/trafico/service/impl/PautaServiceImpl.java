package mx.com.tp.trafico.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import mx.com.tp.trafico.dao.CanalDAO;
import mx.com.tp.trafico.dao.PautaDAO;
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
import mx.com.tp.trafico.entity.TpTraficoCanal;
import mx.com.tp.trafico.entity.TpTraficoPauta;
import mx.com.tp.trafico.service.PautaService;

@Service
public class PautaServiceImpl implements PautaService {
	final static Logger log = Logger.getLogger(PautaServiceImpl.class);

	@Autowired
	public PautaDAO pautaDAO;

	@Autowired
	public CanalDAO canalDAO;

	@Override
	public ActualizaPautaTOResponse actualizarPauta(ActualizaPautaDTORequest request, Long idPauta) {
		boolean success = false;
		TpTraficoPauta pauta = null;
		try {
			boolean existe = false;
			existe = pautaDAO.existsById(idPauta);
			if (existe == true) {
				pauta = pautaDAO.findById(idPauta).orElse(null);
				pauta.setBreack(request.getBreack());
				pauta.setCortes(request.getCortes());
				pauta.setFecha(request.getFecha());
				pauta.setFechaModificacion(request.getFechaModificacion());
				pauta.setFechaRegistro(request.getFechaRegistro());
				pauta.setFranja(request.getFranja());
				pauta.setHoraOrd(request.getHoraOrd());
				pauta.setHorario(request.getHorario());
				pauta.setPosicion(request.getPosicion());
				pauta.setTpTraficoCanal(request.getTpTraficoCanal());
				pauta.setTpTraficoSpot(request.getTpTraficoSpot());
				pauta.setTpTraficoUsuario(request.getTpTraficoUsuario());
				pauta.setIdentificador(request.getIdentificador());
				pautaDAO.save(pauta);
				success = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ActualizaPautaTOResponse(success);
	}

	@Override
	public ConsultaPautaDTOResponse listaPautas() {
		List<TpTraficoPauta> listaPautas = null;
		try {
			listaPautas = pautaDAO.findAll();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new ConsultaPautaDTOResponse(listaPautas);
	}

	@Override
	public BusquedaPautaDTOResponse busquedaPautaId(Long idPauta) {
		boolean busqueda = false;
		TpTraficoPauta pauta = null;
		try {
			boolean existe = false;
			existe = pautaDAO.existsById(idPauta);
			if (existe == true) {
				pauta = pautaDAO.findById(idPauta).orElse(null);
				busqueda = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaPautaDTOResponse(busqueda, pauta);

	}

	@Override
	public EliminaPautaDTOResponse eliminarPautaId(Long idPauta) {
		boolean eliminado = false;
		try {
			boolean existe = false;
			existe = pautaDAO.existsById(idPauta);
			if (existe == true) {
				pautaDAO.deleteById(idPauta);
				eliminado = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new EliminaPautaDTOResponse(eliminado);
	}

	@Override
	public GuardaPautaDTOResponse guardarPauta(GuardaPautaDTORequest request) {
		boolean guardado = false;
		try {
			pautaDAO.save(request.getPauta());
			guardado = true;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new GuardaPautaDTOResponse(guardado);
	}

	@Override
	public BusquedaFechaPautaDTOResponse busquedaFechaPauta(BusquedaFechasPautaDTORequest request) {
		List<TpTraficoPauta> listaPautas = new ArrayList<TpTraficoPauta>();
		List<TpTraficoCanal> listaCanales = new ArrayList<TpTraficoCanal>();
		TpTraficoCanal canalE = null;
		boolean guardado = false;
		Stream<String> distint = null;
		List<String> fechas = new ArrayList<String>();
		try {
			listaCanales = canalDAO.findAll();
			for (TpTraficoCanal canal : listaCanales) {
				if (canal.getNombre().equals(request.getNombreCanal())) {
					canalE = canal;
					listaPautas = pautaDAO.findAll();
					for (TpTraficoPauta pauta : listaPautas) {
						if (pauta.getTpTraficoCanal().equals(canalE)) {
							fechas.add(pauta.getFecha().toString());
							fechas.add(canalE.getIdCanal().toString());
							guardado = true;
						}
					}
				}
			}
			
			distint = fechas.stream().distinct();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("fechas----->"+fechas);
		
		return new BusquedaFechaPautaDTOResponse(distint, guardado);
	}

	@Override
	public BusquedaPautaFechaDTOResponse busquedaPautaFecha(BusquedaPautaFechaDTORequeat request) {
		List<TpTraficoPauta> listaPautas = new ArrayList<TpTraficoPauta>();
		List<TpTraficoPauta> lista = new ArrayList<TpTraficoPauta>();
		TpTraficoCanal canalE = null;
		boolean busqueda = false;
		try {
			listaPautas = pautaDAO.findAll();
			for (TpTraficoPauta pauta : listaPautas) {
				Long idCanal = Long.valueOf(request.getIdCanal());
				canalE = canalDAO.findById(idCanal).orElse(null);
				if (pauta.getTpTraficoCanal().equals(canalE)) {
					Date Fecha = Date.valueOf(request.getFecha());
					if (pauta.getFecha().equals(Fecha)) {
						lista.add(pauta);
						busqueda = true;
					}
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new BusquedaPautaFechaDTOResponse(lista, busqueda);
	}

}
