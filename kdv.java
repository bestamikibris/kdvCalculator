import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	    double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutari giriniz: ");
        tutar = input.nextDouble();
	   
	    kdvTutar = tutar * kdvOran;
	    kdvliTutar = tutar + kdvTutar;
	    
	    System.out.println("Kdv'siz Tutar:" + tutar);
	    System.out.println("Kdv Oranı" + kdvOran);
	    System.out.println("Kdv Tutarı" + kdvTutar);
	    System.out.println("Kdv'li Tutar" + kdvliTutar);
	    
	    
	    
	   
	}
}
