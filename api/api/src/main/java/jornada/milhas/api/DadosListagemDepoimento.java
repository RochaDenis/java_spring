package jornada.milhas.api;

public record DadosListagemDepoimento(String foto, String depoimento, String autor) {
	
	public DadosListagemDepoimento(Depoimento depoimento) {
		this(depoimento.getFoto(), depoimento.getDepoimento(), depoimento.getAutor());
	}
}
