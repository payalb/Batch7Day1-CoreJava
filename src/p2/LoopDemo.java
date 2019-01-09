package p2;

public class LoopDemo {

	public static void main(String[] args) {
		
	/*	//while
		int i=11;
		while( i<=10) {
			System.out.println("2 *"+ i +" = "+ (2*i));
			i++;
		}
		//do while
		//for
		
		 do {
	            System.out.println("2 *" + i + " = " + (2*i));
	            i++;
	        } while (i <= 10);
	        //for
	        for(i = 1; i<=10; i++) {
	            System.out.println("2 *" + i + " = " + (2*i));
	        }
	        */
	        
	     /*   for(;;) {
	        	System.out.println(1);//infinite loop
	        }*/
	        
		int x=0, y=0;
	        for(; ; ){
	        	if(x<=5 && y<=4) {
	        	System.out.println(x +" , "+y);
	        	x+=2; y++;
	        	}
	        	else {
	        		break;
	        	}
	        }
	}
}
