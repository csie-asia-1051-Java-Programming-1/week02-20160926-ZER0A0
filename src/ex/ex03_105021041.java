package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class ex03_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int m =297;
		if(m<=120){System.out.print(m/30*30);}
		else{if(m<=240){System.out.print((m-120)/30*40+120);}
		else{if(m>=240){System.out.print((m-240)/30*60+280);}
		else{System.out.print(m*0);}}}
		}
		
	}

