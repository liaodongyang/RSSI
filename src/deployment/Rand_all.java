package deployment;

public class Rand_all {
	public double[][] xies = new double[3][100];
	
	public double[][] deploy(int area){
		//xies = null;
		for(int i=0; i<100; i++){
			xies[0][i]=Math.random()*area;
			xies[1][i]=Math.random()*area;
			xies[2][i]=Math.random()*area;
		}
		privateoutputs(area);
		return xies;		
	}
	
	private void privateoutputs(int area){
		System.out.println("Ãæ·e"+area);
	}
	
	
	
}
