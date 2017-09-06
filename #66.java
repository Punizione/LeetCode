import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(detectCapitalUse("GGGa"));
	}
	public int[] plusOne(int[] digits) {
      	boolean flag = false;
		int length = digits.length;
		for(int i=0;i<digits.length;i++){
			if(digits[i]==9){
				flag = true;
			}else{
				flag = false;
                break;
			}
		}
		if(flag){
			length++;
		}

		int[] newArr = new int[length];
		boolean flagUp = false;
		if(flag==true){
			newArr[0] = 1;
			for(int i=1;i<newArr.length;i++){
				newArr[i] = 0;
			}
			return newArr;
		}else{
			if(digits[length-1] == 9){
				digits[length-1] = 0;
				flagUp = true;
				for(int i=digits.length-2;i>=0;i--){
					if(digits[i]==9&&flagUp==true){
						digits[i] = 0;
					}else if(digits[i]!=9 &&flagUp == true){
						digits[i]++;
						flagUp = false;
					}
				}
				return digits;
			}else{
				digits[length-1]++;
				return digits;
			}
		}
	}
		
}