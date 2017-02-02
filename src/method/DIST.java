package method;

public class DIST {
	public double distesm=0;
	public double[][] dist=new double[100][100];
	public DIST(){
		
	};
	public DIST(int nn,double rssi, double A){
		//10.^((-rssi-A)/(10*nn));
		double b=(-rssi-A)/(10*nn);
		distesm=Math.pow(10, b);
		
	}
	
	public double[][] Distcalc(double[][] a){
		//double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				dist[i][j]=Math.sqrt(Math.pow((a[0][i]-a[0][j]), 2)+Math.pow((a[1][i]-a[1][j]), 2)+Math.pow((a[2][i]-a[2][j]), 2));
			}
		}
	return dist;		
	}
}
