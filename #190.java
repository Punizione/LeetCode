
public class Test{
	public static void main(String[] args){
		hammingWeight(43261596);
	}
	public static int hammingWeight(int n){
		String strN = Integer.toBinaryString(n);
		if(strN.length()<32){
			StringBuffer str = new StringBuffer(strN);
			for(int i=0;i<32-strN.length();i++){
				str.insert(0,'0');
			}
			strN = str.toString();
		}
		String strS = new StringBuffer(strN).reverse().toString();
		int sum = Integer.parseUnsignedInt(strS,2);
		return sum;
	}
}