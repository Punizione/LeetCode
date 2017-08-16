public class Test{
	public static void main(String[] args){
		hammingDistance(1,4);
	}
	public static int hammingDistance(int x,int y){
		int res = x^y;
		String strS = Integer.toBinaryString(res);
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