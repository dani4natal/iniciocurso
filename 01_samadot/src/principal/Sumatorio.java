package principal;

public class Sumatorio {
	private static int buscarMenor(int x, int y) {
		return x>y?y:x;
	}
	private static int buscarMayor(int x, int y) {
		return x>y?x:y;
	}
	public static int SumaPares(int menor, int mayor) {
		int sumatotal=0;
		for(int aux=menor; aux<=mayor; aux++){
			if(aux%2==0) {
				sumatotal=sumatotal+aux;
			}
		}
		return sumatotal;
	}

	public static void main(String[] args) {
		int a=50;
		int b=16;
		int menor= buscarMenor(a,b);
		int mayor= buscarMayor(a,b);
		System.out.println("El valor total es "+ SumaPares(menor,mayor));
	}

}
