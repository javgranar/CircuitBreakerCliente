package com.example.demo.entityBuilder;

public class CocheBuilder {
	
	private Boolean ruedas;
	private Boolean motor;
	private Boolean aceite;
	private String status;
	
	public CocheBuilder() {
		
	}
	
	public CocheBuilder withRuedas(Boolean ruedas) {
		this.ruedas = ruedas;
		return this;
	}
	
	public CocheBuilder withMotor(Boolean motor) {
		this.motor = motor;
		return this;
	}
	
	public CocheBuilder withAceite(Boolean aceite) {
		this.aceite = aceite;
		return this;
	}
	
	public CocheBuilder withStatus(String status) {
		this.status = status;
		return this;
	}
	
	public CocheBld build() {
		CocheBld coche = new CocheBld();
		coche.setAceite(this.aceite);
		coche.setMotor(this.motor);
		coche.setRuedas(this.ruedas);
		coche.setStatus(this.status);
		return coche;
		
	}

}
