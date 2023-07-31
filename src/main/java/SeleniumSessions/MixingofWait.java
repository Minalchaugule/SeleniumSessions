package SeleniumSessions;

public class MixingofWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //implicitly wait-10secs
		//WD wait-15 sec for username
		//implicitly-2sec-
		//WD wait- 5 sec
		//total -7sec
		
		//2nd time while running the script
		//implicitly-7sec-
		//WD wait- 11sec
	    //total -18sec
		
		//3nd time while running the script
		//implicitly-9sec-
		//WD wait- 15sec
	    //total -24sec
		
		//4th time while running the script
				//implicitly- ore than 10msec-
				//WD wait- more than 15sec
			    //total -element not found
		
		//we should not use mix wait or cumulative wait ,it affects performance
		
	}

}
