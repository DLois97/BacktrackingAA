
public class backtracking {
	public static int sedes (int[] c0, int[] c1, int f) {
		int i = 0;
		int aux;
		int cambio = 0;
		int sol = 2147483647;
		int solAux = 0;
		int[][] cAux = new int[2][c0.length];
		for (int k = 0; k < c0.length; i++){
			cAux[0][k] = c0[k];
		}
		for (int k = 0; k < c0.length; i++){
			cAux[1][k] = c1[k];
		}
		aux = sedesAux(i,sol,solAux , cAux ,f, cambio);
		return aux;
	}
	public static int sedesAux(int i,int sol, int solAux, int[][] cAux, int f,int anterior){
		
		for (int k = 0; k < 2; k++){
			if (i==0){
				if (i == (cAux.length/2)-1){
					
				}
				else{
				anterior =k;
				sedesAux(i++, sol, solAux += cAux[k][i] , cAux, f, anterior);
				}
			}
			else{
				if(k!= anterior){	}
					if (i == (cAux.length/2)){
						if(sol>solAux){
							sol=solAux;
						}
						return sol;
					}
					else{
						if(anterior==k){
							
							sol=sedesAux(i++, sol, solAux += cAux[k][i], cAux, f, anterior);
							sol-=cAux[k][i];
						}
						else{
							anterior=k;
							sol=sedesAux(i++, sol, solAux += cAux[k][i]+f, cAux, f, anterior);
							sol-=cAux[k][i]+f;
						}
					}
					
			
			}
			return sol;
		}
	}
}
