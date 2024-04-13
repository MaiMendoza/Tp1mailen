package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =40, i =2;
		int[] numeros = {80, 117, 152, 185, 216, 245, 272, 297, 320, 341, 360, 377, 392, 405, 416, 425, 432, 437, 440,
				441, 440, 437, 432, 425, 416, 405, 392, 377, 360, 341, 320, 297, 272, 245, 216, 185, 152, 117, 80, 41};
		
		for (j/=2;  j <= numeros.length && j>=0; j-- ) {
			for (;  i <= j/2; i++) {
				 System.out.print(numeros[i]+ " ");
			}
           
                System.out.print(numeros[j]+" ");
            
           
        }

        
	
	}

}
