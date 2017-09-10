package pkgCore;

public class QB {

	private double TD;
	private double YDS;
	private double INTER;
	private double Comp;
	private double ATT;

	public QB() {

	}

	public void setTD(int tD) {
		TD = tD;
	}

	public void setYDS(double yDS) {
		YDS = yDS;
	}

	public void setINTER(int iNTER) {
		INTER = iNTER;
	}

	public void setComp(int comp) {
		Comp = comp;
	}

	public void setATT(int aTT) {
		ATT = aTT;
	}

	public double QBrating() {

		double a = ((Comp / ATT) - 0.3) * 5;
		double b = ((YDS / ATT) - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INTER / ATT) * 25);

		if (a > 2.375) {
			a = 2.375;
		}
		if (a < 0) {
			a = 0;
		}
		if (b > 2.375) {
			b = 2.375;
		}
		if (b < 0) {
			b = 0;
		}
		if (c > 2.375) {
			c = 2.375;
		}
		if (c < 0) {
			c = 0;
		}
		if (d > 2.375) {
			d = 2.375;
		}
		if (d < 0) {
			d = 0;
		}

		return (((a + b + c + d) / 6) * 100);

	}

}
