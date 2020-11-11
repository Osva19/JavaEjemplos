public class javaDado{
	public static void main(String[] args){
		int dado, tl = 100;
		int [] r = new int[100];
		int [] f = new int [6];
		
		for(int l=1;l<=tl;l++){
			dado = (int) (Math.floor(Math.random()*6+1));
			r[l-1] = dado;
			f[dado-1] += 1;
		}
    
		for(int x = 0; x<6; x++){
			System.out.println("Las veces que salio "+ (x+1) + ": " + f[x]);
		} 
	}
}
