package jornada.milhas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("depoimentos")

public class DepoimentosController {

	@Autowired
	private DepoimentoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody DadosCadastroDepoimentos dados) {
		repository.save(new Depoimento(dados));

	}

	@GetMapping
	public List<Depoimento> listar() {
		return repository.findAll();
	}

}
