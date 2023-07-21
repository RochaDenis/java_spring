package jornada.milhas.api;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "depoimentos")
@Entity(name = "depoimento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Depoimento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String foto;
	@NotBlank
	private String depoimento;
	@NotBlank
	private String autor;
	
	public Depoimento() {}
	
	public Depoimento(DadosCadastroDepoimentos dados) {
		this.foto = dados.foto();
		this.depoimento = dados.depoimento();
		this.autor = dados.autor();
	}
	
}
