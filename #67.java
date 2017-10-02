import java.util.*;
public class Test{
	public static void main(String[] args){
		isPalindrome();
	}
	public String addBinary(String a, String b) {
		String a1 = a;
		String b1 = b;
		int length = a.length()>b.length()?a.length():b.length();
		for(int i=0;i<length-a.length();i++){
			a1 = "0"+a1;
		}
		for(int i=0;i<length-b.length();i++){
			b1 = "0"+b1;
		}
		char[] arr1 = a1.toCharArray();
		char[] arr2 = b1.toCharArray();
		char[] arr = new char[arr1.length];
		boolean flag = false;
		for(int i=arr1.length-1;i>=0;i--){
			if(arr1[i]=='0'&&arr2[i]=='0'&&!flag){
				arr[i]='0';
				flag = false;
			}else if(arr1[i]=='1'&&arr2[i]=='1'&&!flag){
				arr[i]='0';
				flag = true;
			}else if(arr1[i]=='0'&&arr2[i]=='0'&&flag){
				arr[i]='1';
				flag = false;
			}else if(arr1[i]=='1'&&arr2[i]=='1'&&flag){
				arr[i] = '1';
				flag = true;
			}else if(arr1[i]=='1'&&arr2[i]=='0'&&flag){
				arr[i] = '0';
				flag = true;
			}else if(arr1[i]=='0'&&arr2[i]=='1'&&flag){
				arr[i] = '0';
				flag = true;
			}else{
				arr[i]='1';
				flag = false;
			}
		}
		StringBuilder res = new StringBuilder();
		for(int i=0;i<arr.length;i++){
			res.append(arr[i]);
		}
		if(flag){
			res.insert(0,'1');
		}
		return res.toString();

	}
}