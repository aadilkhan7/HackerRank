import java.util.Scanner;


interface Months{
	
	int jan[] = Methods.month(31);
	int feb[] = Methods.month(28);
	int mar[] = Methods.month(31);
	int apr[] = Methods.month(30);
	int may[] = Methods.month(31);
	int jun[] = Methods.month(30);
	int jul[] = Methods.month(31);
	int aug[] = Methods.month(31);
	int sep[] = Methods.month(30);
	int oct[] = Methods.month(31);
	int nov[] = Methods.month(30);
	int dec[] = Methods.month(31);
	int months[] = Methods.month(12);
	
	int year[][] = {jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec};
	
	int daysYear[] = Methods.month(365);
	String weekdays[] = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"}; 
	
}

class Methods implements Months{
	
	
	static int[] month(int number){
		int month[] = new int[number];
		for(int i=1;i<=number;i++){
			month[i-1] = i;
		}
		return month;
	}
	
	static int numOfDays(int dd, int mm){
		int numDays = 0;
		for(int mI = 1; mI<=mm; mI++){

			for(int date = 1; date <= year[mI].length; date++){
				numDays++;
				if(date == dd && mI == mm){
					break;
				}
			}
		}
		return numDays;
	}
	
	
	static String dayOfTheWeek(int dayDiff, int currentDay){
		String day = "";
		
		
		return day;
	}
}




public class Calendar implements Months {
	
	public static void main(String args[]){
		
		int dd = 16, mm = 4, yyyy = 2017, curDay = 0, numDays = 0;
		int id = 31, im = 1;
		
		int diff = Methods.numOfDays(dd, mm) - Methods.numOfDays(id, im);
		diff = diff % 7;
		
		
		System.out.println(weekdays[6 - diff]);
		
	
	}
}
		

	


