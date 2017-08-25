import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(myAtoi("    10522545459"));
	}
	public static int myAtoi(String str) {
		if(str==null){
			return 0;
		}
		if(str.length()==0){
			return 0;
		}else if(str.length()==1){
			if(str.charAt(0)<48||str.charAt(0)>57){
				return 0;
			}else{
				return Integer.parseInt(str);
			}
		}else{
			int i=0;
			boolean flag = false;
			boolean flag1 = false;
            str = str.trim();
			if(str.charAt(0)=='+'){
				flag = true;
			}else if(str.charAt(0)=='-'){
				flag = true;
				flag1 = true;
			}
			if(flag){
				str = str.substring(1);
			}
			for(char ch:str.toCharArray()){
				if(ch<48||ch>57){
					break;
				}else{
					if(String.valueOf(i).length()==10){
						if(flag1==false){
							return Integer.MAX_VALUE;
						}else{
							return Integer.MIN_VALUE;
						}
					}
					i = i*10;
                    if(i<0&&flag1==false){
                        return Integer.MAX_VALUE;
                    }
                    i = i+Integer.parseInt(String.valueOf(ch));
				}
			}
            if(flag1==false&&i<0){
                return Integer.MAX_VALUE;
            }
			if(flag1){
				i = 0-i;
                if(i>0){
                    return Integer.MIN_VALUE;
                }
			}
			return i;
		}
		
	}
		
}