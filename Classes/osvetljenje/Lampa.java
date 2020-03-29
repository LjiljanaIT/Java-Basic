package osvetljenje;

public class Lampa {
	private boolean status;
	private String colour;

	public Lampa(String colour) {

		this.status = false;
		this.colour = colour;
	}

	public String getStatus() {
		if(status) {
			return "on";
		}else {
			return "off";
		}
	}
	
	public String toString() {
		return "Boja: "+colour+" , status: "+getStatus()+"\n";
	}

	public void changeStatus() {
		status=!status;		
		}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}


