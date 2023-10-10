package day2;

public class CallTime {

	public static void main(String[] args) {
		
		double distance = 40e12;
		double light = 30e4;
		double result =0;
		
		result = distance / light / (60.0*60.0*24.0*365.0);
		
		System.out.println("걸리는 시간은"+result+"광년입니다.");

	}

}
