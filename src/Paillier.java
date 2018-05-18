import java.util.Base64;

public class Paillier {

	public static String encrypt(String str) {
//		byte b[] = new byte[str.length()];
//		byte result[] = new byte[str.length()];
//		b = str.getBytes();
//		for (int i = 0; i < str.length(); i++) {
//			result[i] = (byte) ((byte) b[i] - (byte) 4);
//			System.out.println(b[i] + "-" + result[i]);
//		}
		String result = Base64.getEncoder().encodeToString(str.getBytes());
		return (new String(result));
	}
	
	public static void main(String args[]) {
		int temp = 102;
		int hr = 78;
		int bs = 190;
		String bp = "120-80";
		String email = "sonu@ss.com";
		
		
		String result = "";
		
		result += "temperature:" +encrypt(temp+"") +"\n";
		result += "heart_rate:" +encrypt(hr+"") +"\n";
		result += "blood_sugar:" +encrypt(bs+"") +"\n";
		result += "blood_pressure:" +encrypt(bp) +"\n";
		result += "email:" +encrypt(email) +"\n";
		
		System.out.println(result);
				
				
	}

}
