package br.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.model.Veiculo;
import br.senac.service.VeiculoService;
import br.senac.service.impl.VeiculoServiceImpl;

@Controller
public class TesteController {

	
	
	@RequestMapping("/olaMundoSpring")
	public String olaMundo(){
		
		VeiculoService service = new VeiculoServiceImpl();
		
		
		Veiculo v = new Veiculo();
		v.setId(1L);
		v.setNome("edu");
		
		service.cadastrar(v);
		
		System.out.println("Executou controller");
		return "ok";
	}
}
