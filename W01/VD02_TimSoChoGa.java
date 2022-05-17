public class VD02_TimSoChoGa {
	public static void main(String [] args) {
		int socho, soga;
		
		socho = 0;
		
		do {
			soga = (100 - 4*socho)/2;
			System.out.println("KQ " + socho + " " + soga);
			socho++;
		} while (4*socho<100);
		
	}
}