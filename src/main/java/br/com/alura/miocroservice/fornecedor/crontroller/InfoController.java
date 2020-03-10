package br.com.alura.miocroservice.fornecedor.crontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.miocroservice.fornecedor.model.InfoFornecedor;
import br.com.alura.miocroservice.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoService.getInfoPorEstado(estado);
	}
}
