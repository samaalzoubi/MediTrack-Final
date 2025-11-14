package de.fhdo.sama.capstone.model;

public class Transfer {
	private String id;
	private Medicine cargo;
	private Location from;
	private Location to;
	private AGV executer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Medicine getCargo() {
		return cargo;
	}

	public void setCargo(Medicine cargo) {
		this.cargo = cargo;
	}

	public Location getFrom() {
		return from;
	}

	public void setFrom(Location from) {
		this.from = from;
	}

	public Location getTo() {
		return to;
	}

	public void setTo(Location to) {
		this.to = to;
	}

	public AGV getExecuter() {
		return executer;
	}

	public void setExecuter(AGV executer) {
		this.executer = executer;
	}
}
