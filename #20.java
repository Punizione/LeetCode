import java.util.LinkedList;
public class Test{
	public static void main(String[] args){
		System.out.println(getSum(1,2));
	}
	public boolean isValid(String s) {
		char[] temp = s.toCharArray();
		Character[] charArr = new Character[temp.length];
		LinkedList<Character> stack = new LinkedList();
		boolean flag = true;
		for(int i = 0;i<temp.length;i++){
			charArr[i] = new Character(temp[i]);
		}
		int i=0;
		while(i < charArr.length){
			if(isLeftBracket(charArr[i])){
				stack.push(charArr[i]);
			}else{
				if(stack.peek()!=null){ 
					if(isMatching( stack.pop() , charArr[i] )){
						//dosomeing..
					}else{
						flag = false;
					}
				}else{
					flag = false;
				}
			}
			i++;
		}
		if(!stack.isEmpty()){
			 false;
		}
		return flag;
	}
	public static boolean isLeftBracket(Character ch){
		return ch=='{'||ch=='['||ch=='('||ch=='<';
	}
	public static <T extends Character> boolean isMatching(T c1,T c2){
		boolean flag = false;
		Character ch1 = (Character)c1;
		Character ch2 = (Character)c2;
		if(ch1=='{'&&ch2=='}'){ flag = true; }
		if(ch1=='<'&&ch2=='>'){ flag = true; }
		if(ch1=='['&&ch2==']'){ flag = true; }
		if(ch1=='('&&ch2==')'){ flag = true; }
		return flag;
	}


		

}