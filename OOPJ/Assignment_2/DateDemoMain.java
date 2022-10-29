/*Assignement 2, Q.2
Q2. Implement a class for DateDemo. Write member functions for 
(i) getting the previous day, (iv) getting the next day, 
(iii) printing a day 
There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; 
(ii)day is initialized to user specified value but month and year are initialized to 01, 1970; 
(iii) day, month are initialized to user specified value but year is initialized to 1970; 
(iv) day, month and year are initialized to user defined values. 
Also, write a main() function to (i) create a date object; 
(ii) print the next and the previous day.
*/
class DateDemo{
	int day;
	int month;
	int year;
	//********************************** Constructors *******************************
	DateDemo(){
		day=01; 
		month=01; 
		year=1970;
	}
	DateDemo(int day){
		this.day=day; 
		month=01; 
		year=1970;
	}
	DateDemo(int day,int month){
		this.day=day; 
		this.month=month; 
		year=1970;
	}
	DateDemo(int day,int month,int year){
		this.day=day; 
		this.month=month; 
		this.year=year;
	}
	
	//********************************** previousDay() method *******************************
    void previousDay(){
		if(day>1){
			System.out.println((day-1)+"/"+month+"/"+year);                  //if day greater than 1 then  previous day = day -1
			return;
		}
		if(month>1){ 											         //if day is 1 and month is not Jan
			if(month==3){										    //if month is March then previous month will be Feb 
				if((year%4==0 && year% 100!=0) || (year%400==0)){   // if leap year then last day of Feb is 29
					System.out.println(29+"/"+(month-1)+"/"+year);
					return;
				}
				System.out.println(28+"/"+(month-1)+"/"+year);               //if year is not leap year then last date of Feb is 28
				return;
			}				
			if((month==5 || month==7 || month==10 || month==12)){   //if present month is May,July, Oct and Dec then last month last date will be 30
				System.out.println(30+"/"+(month-1)+"/"+year);
				return;
			}else{
				System.out.println(31+"/"+(month-1)+"/"+year);               //if month is other than above mention then last month last date will be 31
				return;
			}
		}
		System.out.println(31+"/"+12+"/"+(year-1));                            //if month is Jan and day 1  then previous day could be 31 dec last year
	}
	
	//********************************** nextDay() method *******************************
	void nextDay(){
		if(day<28){                                                                        //if day is less than 28 will print +1 day
			System.out.println((day+1)+"/"+month+"/"+year);
			return;
		}
		if(month<12 && day<31){                                                //if Month is not Dec and day is Not 31
			if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10)){     //For month in which have 31 days
				System.out.println((day+1)+"/"+(month)+"/"+year);
				return;
			}else if(month==2){                                                   // Special Month Feb have deferent properties handeled using this block
				if((day==28)&&((year%4==0 && year% 100!=0) || (year%400==0))){     //check wether the year is leap or not if yes then Enter inside block
					System.out.println(29+"/"+(month)+"/"+year);
					return;
				}else if(day==28 || day==29){                               //if Year is not leaf and month is Feb
					System.out.println(1+"/"+(month+1)+"/"+year);
					return;
				}
			}else if((day<30) && (month==4 || month==6 || month==9 || month ==11)){       //if 30 day in month
				System.out.println((day+1)+"/"+(month)+"/"+year);
					return;
			}else if((day==30) && (month==4 || month==6 || month==9 || month ==11)){
				System.out.println(1+"/"+(month+1)+"/"+year);
				return;
			}
		}
		if(day==31 && month!=12){                                          //if day is 31 then next day will be 1
			System.out.println(01+"/"+(month+1)+"/"+year);
			return;
		}
		System.out.println(01+"/"+01+"/"+(year+1));              // if day is 31 and month is 12 i.e last day of year then next day will be 01/01/year+1
		
	}	

	//********************************** printDay() method *******************************
	void printDay(){
		System.out.println(day+"/"+month+"/"+year);
	}
}
class DateDemoMain{
	
	//***************************   main   ************************
	public static void main(String args[]){
		
		System.out.println("-------- zero arg --------" );
		DateDemo date1=new DateDemo();
		date1.previousDay();
		date1.printDay();
		date1.nextDay();
		System.out.println( );
		
		System.out.println("-------- one arg --------" );
		DateDemo date2=new DateDemo(16 );
		date2.previousDay();
		date2.printDay();
		date2.nextDay();
		System.out.println( );
		
		System.out.println("-------- two arg --------" );
		DateDemo date3=new DateDemo(01,06 );
		date3.previousDay();
		date3.printDay();
		date3.nextDay();
		System.out.println( );
		
		System.out.println( "-------- three arg --------");
		DateDemo date4=new DateDemo(31,12,2012);
		date4.previousDay();
		date4.printDay();
		date4.nextDay();
	}
}