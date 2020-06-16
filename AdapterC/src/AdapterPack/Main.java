package AdapterPack;

public class Main {
	
	public static void main(String[] args) {
		
		 AdapterData d = new AdapterData (new Data((byte) 9, (byte) 6 , (short)2020));
		System.out.println(d.toString());
	}

}
