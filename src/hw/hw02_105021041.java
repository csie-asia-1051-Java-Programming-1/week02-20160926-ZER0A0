package hw;
/*
 * Topic: 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 * 試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/10/02
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class hw02_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("輸入性別：男=1，女=2");
		int n = scn.nextInt();
		System.out.println("輸入身高：");
		int a = scn.nextInt();
		if(n == 1){System.out.println("體重 = "+(a-80)*0.7);}
		else{if(n == 2){System.out.println("體重 = "+(a-70)*0.6);}}

	}

}
