public class Test{
	public static void main(String[] args){
		hammingWeight(3);
	}
	public static int hammingWeight(int n){
		String strS = Integer.toBinaryString(n);
		int sum = 0;
		for(int i=0;i<strS.length();i++){
			if(strS.charAt(i)=='1'){
				sum++;
			}
		}
		System.out.println(sum);
		return sum;
	}
}