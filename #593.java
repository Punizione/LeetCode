import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(validSquare({0,0},{1,1]},{1,0},{0,1}));
	}
	public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
		int l12 = (p2[0]-p1[0])*(p2[0]-p1[0]) +(p2[1]-p1[1])*(p2[1]-p1[1]);
		int l13 = (p3[0]-p1[0])*(p3[0]-p1[0]) +(p3[1]-p1[1])*(p3[1]-p1[1]);
		int l14 = (p4[0]-p1[0])*(p4[0]-p1[0]) +(p4[1]-p1[1])*(p4[1]-p1[1]);

		int l23 = (p3[0]-p2[0])*(p3[0]-p2[0]) +(p3[1]-p2[1])*(p3[1]-p2[1]);
		int l24 = (p4[0]-p2[0])*(p4[0]-p2[0]) +(p4[1]-p2[1])*(p4[1]-p2[1]);

		int l34 = (p4[0]-p3[0])*(p4[0]-p3[0]) +(p4[1]-p3[1])*(p4[1]-p3[1]);

		int[] lenght = new int[]{l12,l13,l14,l23,l24,l34};

		Arrays.sort(lenght);
		if(lenght[0]==0){
			return false;
		}

		return (lenght[0]==lenght[1])&(lenght[1]==lenght[2])&(lenght[2]==lenght[3])&(lenght[3]==lenght[0])&(lenght[4]==lenght[5]);
	}

}