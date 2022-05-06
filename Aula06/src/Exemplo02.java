public class Exemplo02 {

	public static void main(String[] args) {
		
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		for(int i=0; i<= vetor.length-1; i++ ) {
//			
//			System.out.println( vetor[i] );
//		}
		
//		for(int i=vetor.length-1; i>=0; i--) {
//		
//			System.out.println( vetor[i] );
//		}
		
//		for(int i=0; i<= vetor.length-1; i +=2 ) {
//		
//			System.out.println( vetor[i] );
//		}
		
		
		for(int elemento:vetor) {
			System.out.println( elemento );
		}
	}
}