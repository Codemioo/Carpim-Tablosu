package javaçarpımtablosu;
import java.util.Scanner;
public class çarpımtablosu {
public static void main(String args[]) {
	//çarpım tablosunu iç içe for döngülri ile yazmamız gerekiyor!!
	
	
	//j=çarpım tablosunun ikinci çarpanınıı temsil eder
	for(int j=1;j<=10;j++) {
		//i=değişkeni 10 olduktan sonr döngüden çıkıcak ve bir alt satıra geçicek!
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+j+"="+(i*j)+" ");
			
		}
		System.out.println();
	}
}
}
