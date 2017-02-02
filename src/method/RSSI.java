package method;

import java.util.Random;

public class RSSI {
	public double RSSI = 0;
	
	public RSSI(int nn, double dist, double A){
		RSSI=getDISTtoRSSI(nn, dist, A);
	}
	double getDISTtoRSSI(int nn, double dist, double A){
		Random r = new Random();
		double Rssi=-A-10*nn*Math.log10(dist)+r.nextGaussian();
		return Rssi;
	}
	
}
