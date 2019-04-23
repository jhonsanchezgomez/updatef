package com.microservicio.service.DTO;

public class TarjetaDTO {
	
	private String tipo;
	private Double monto;
	private Long idT;

	public TarjetaDTO() {
		super();
	}

	public TarjetaDTO(String tipo, Double monto, Long idT) {
		super();
		this.tipo = tipo;
		this.monto = monto;
		this.idT = idT;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Long getidT() {
		return idT;
	}
	public void setidT(Long idT) {
		this.idT = idT;
	}
	
	

}
