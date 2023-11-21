class UC3{
	 static  int Hour_wage=20;
         static int full_day_hour=8;
    	 static int part_time_hour=2;

	  int daily_wage=calculateDailyWage(UC2.presentOrAbsent);
		
	    public static int calculateDailyWage(int present_or_absent){

        	int daily_wage;
        	switch (present_or_absent){
            	case 1:
                	daily_wage=Hour_wage*full_day_hour;
                	break;
            	case 2:
                	daily_wage=part_time_hour*Hour_wage;
                	break;
            	default:
                	daily_wage=0;


        	}
        	return daily_wage;

    }

}