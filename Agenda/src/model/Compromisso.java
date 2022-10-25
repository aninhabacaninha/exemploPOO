package model;

import java.util.Date;

public class Compromisso {
	private long id;
	private Date datCompromisso, horCompromisso;
	private long contato;
	private String observacao;
	
	public Compromisso(Long id, Date datCompromisso, Date horCompromisso, String observacao, Long contato) {
		this.id = id;
		this.datCompromisso = datCompromisso;
		this.horCompromisso = horCompromisso;
		this.observacao = observacao;
		this.contato = contato;
	}
	
	public Compromisso() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public Date getDatCompromisso() {
		return datCompromisso;
	}

	public void setDatCompromisso(Date datCompromisso) {
		this.datCompromisso = datCompromisso;
	}

	public Date getHorCompromisso() {
		return horCompromisso;
	}

	public void setHorCompromisso(Date horCompromisso) {
		this.horCompromisso = horCompromisso;
	}

	public Long getContato() {
		return contato;
	}

	public void setContato(Long contato) {
		this.contato = contato;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
