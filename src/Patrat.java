
public class Patrat {

	private double latura;
	private double arie;

	public Patrat(double latura) {
		if (latura < 1)
			this.latura = 1;
		this.latura = latura;
		this.arie = latura * latura;
	}

	public Patrat() {
		this.latura = 10;
		this.arie = this.latura * this.latura;
	}

	@Override
	public String toString() {
		return "Patrat latrua: " + this.latura + " arie: " + this.arie;
	}

}
