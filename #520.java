import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(detectCapitalUse("GGGa"));
	}
    public static boolean detectCapitalUse(String word) {
		char[] arr = word.toCharArray();
		if(arr.length<=1){
			return true;
		}
		boolean flag1 = false;
		boolean flag2 = false;
		if(arr[0]<=90&&arr[0]>=65){
			flag1 = true;
		}
		if(arr[1]<=90&&arr[0]>=65){
			flag2 = true;
		}
		for(int i=1;i<arr.length;i++){
			if(flag1==false){
				if(arr[i]<=90&&arr[i]>=65){
					return false;
				}else{
					continue;
				}
			}else{
				if(flag2==true){
					if(arr[i]>=97&&arr[i]<=122){
						return false;
					}else{
						continue;
					}
				}else{
					if(arr[i]>=65&&arr[i]<=90){
						return false;
					}
					else{
						continue;
					}
				}
			}

		}
		return true;
	}
		
}