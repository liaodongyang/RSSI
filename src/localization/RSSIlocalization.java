package localization;
import deployment.Rand_all;
import method.DIST;
import method.RSSI;

public class RSSIlocalization {

	public static void main(String[] args) {
		int area=100;
		Rand_all xyxy=new Rand_all();
			double[][] xy=xyxy.deploy(area);
			//for(int i=0;i<100;i++)
				//System.out.println(xy[0][i]);
		RSSI rssi = new RSSI(2, 32, 45 ); 
			System.out.println(rssi.RSSI);
		DIST distesm = new DIST(2,rssi.RSSI,45);
		    System.out.println(distesm.distesm);
		double[][] Dist=distesm.Distcalc(xy);
		for(int i=0;i<100;i++)
			System.out.println(Dist[i][i]);
	}

}
