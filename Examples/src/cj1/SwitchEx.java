package cj1;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		int n=5;
		String month="";
		switch(n)
		{
		case 1:month="january";
		break;
		case 2:month="february";
		break;
		case 3:month="march";
		break;
		case 4:month="april";
		break;
		case 5:month="may";
		break;
		case 6:month="june";
		break;
		case 7:month="july";
		break;
		case 8:month="auguest";
		break;
		case 9:month="september";
		break;
		case 10:month="october";
		break;
		case 11:month="november";
		break;
		case 12:month="december";
		break;
		default:System.out.println("invalid month");
		}
		System.out.println(month);
	}

}
