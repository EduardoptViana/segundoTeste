package excecoes;

public class Testador2 {

	public static void main(String[] args) {
		
		int x=0;
		
		
		try{
			iguala4(3);
		} catch (RuntimeException ee){
			
		}

	}

	
	static boolean iguala4(int x) throws RuntimeException{
		if(x!=4)
			throw new RuntimeException();
		return x==4;
	}
}
