package br.com.gerenciador.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.gerenciador.model.Pessoa;
import br.com.gerenciador.repository.Pessoas;


@Controller
@RequestMapping("/pessoas")
public class PessoaControler {
	
	@Autowired
	private Pessoas pessoas;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroPessoa";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView salvar(Pessoa pessoa) {
		
		pessoas.save(pessoa);
		
		ModelAndView modelAndView = new ModelAndView("CadastroPessoa");
		modelAndView.addObject("mensagem","Pessoa cadastrada com sucesso");
	return modelAndView;
	}
	
	@RequestMapping
	public ModelAndView listar() {
		List<Pessoa> list = pessoas.findAll();
		ModelAndView andView = new ModelAndView("ListarPessoa");
		andView.addObject("todasPessoas",list);
		return andView;
	}
	


}

