package p2;

public class JumpStatementdemo {
	public static void main(String[] args) {
		/*	int x=0;
			
			do {
				System.out.println(x++);
				
				if(x==5) {
					break; //switch: come out of the loop
				}
			}while(true);
			System.out.println("done!");*/
			
			
		/*	for(int y=1; y<=10; y++) {
				if(y%2==0) {
					continue; //going to next iteration
				}
				System.out.println(y);
			}*/
			

			for(int y=1; y<=10; y++) {
				if(y%2==0) {
					return; 
				}
				System.out.println(y);
			}
			
			
	}
}
