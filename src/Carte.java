public class Carte {

	private int nrPagini;

	public Carte(int nrPagini) {
		this.nrPagini = nrPagini;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nrPagini;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		if (nrPagini != other.nrPagini)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carte [nrPagini=" + nrPagini + "]";
	}

}
