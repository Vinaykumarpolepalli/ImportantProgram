package ImportantPrograms;

public class Bubblesort {

	public static void main(String[] args) {
     int [] num = {50,100,10,80,5};
      int temp = 0;
     for (int i = 0;i<num.length;i++) {
    	for (int j = 0;j<num.length-1-i;j++) {
    		if(num[j] > num[j+ 1]){
    			temp=num[j+1];
    			num[j+1]=num[j];
    			num[j]=temp;
    			System.out.println(              );
    		}	
    	}
     }
     for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+ "  ");
		}
	}
}
