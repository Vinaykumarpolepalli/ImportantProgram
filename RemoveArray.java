package ImportantPrograms;

public class RemoveArray {
	public static void main(String[] args) {
        int[] num = {25,14,56,15,36,56,77,18,29,49};
        int arr= num.length;
        int index=3;
        for (int i = index;i<arr-1;i++) {
        	num[i]=num[i+1];
        }
        arr--;
        for(int i = 0;i<arr;i++) {
        	System.out.print(num[i]+   " ,    "  );
        }
	
	}
}
