package ImportantPrograms;

public class Prime1 {

	public static void main(String[] args) {
int [] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

	for(int j =0;j<num.length;j++) {
		boolean status = true;
		if(num[j]==1) {
			status = false;
		}
		for(int k = 2;k<num[j];k++) {
			if(num[j]%k==0) {
				status= false;
				break;
			}
		}
		if(status) {
			System.out.print(num[j]+" ");
		}
		
	}


	}

}
