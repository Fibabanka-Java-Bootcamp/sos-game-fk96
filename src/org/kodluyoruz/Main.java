package org.kodluyoruz;
import java.util.*;
public class Main {
	
	public static void printMatrisAndPoints(char[][]matris) {
		for(char[]row:matris) {
			for(char cell:row) {
				System.out.print(cell+"|");
			}
			System.out.println("");
    	}
	}
	
	public static boolean isAllCellsFull(char[][]matris) {
		int flag=0;
		for(char[]row:matris) {
			for(char cell:row) {
				if(cell=='S' || cell=='O') {
					flag=0;
				}
				else {
					flag=1;
				}
			}
		}
		if(flag==0) {
			return true;
		}
		return false;
		
	}
	
	
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	Random rand = new Random();
    	int n,player; //n:matris boyutu,player oyunu oynayacak kiþi(0=>bilgisayar,1=>kullanýcý)
    	char letterPc=' ',letterPlayer=' ';
		
		  do { 
			  System.out.print("Size of matrix(3...7):");
			  n=input.nextInt(); }
		  while(n<3 || n>7);
		  
		  //System.out.println(n); 
		  char matris[][]=new char[n][n];
		 
    	
    	player=rand.nextInt(2);
    	if(player==0) {
    		System.out.println("Bilgisayar basliyor.");
    		int letter=rand.nextInt(2);
    		if(letter==0) {
    			letterPc='S';
    			letterPlayer='O';
    		}
    		else {
    			letterPc='O';
    			letterPlayer='S';
    		}
    		System.out.println("Bilgisayarýn sectigi harf:"+letterPc);
    		System.out.println("Oyuncuya kalan harf:"+letterPlayer);
    	}
    	
    	else {
    		System.out.println("Oyuncu basliyor"); 	
    		System.out.print("Harf girin:");
			letterPlayer= input.next().charAt(0);
    		/*do {
    			System.out.print("Harf girin:");
    			letterPlayer= input.next().charAt(0);
    		}
    		while(!(letterPlayer=='O' || letterPlayer=='S'));*/
    		System.out.println("Oyuncunun sectigi harf:"+letterPlayer);
    		if(letterPlayer=='S') {
    			letterPc='O';
    		}
    		else {
    			letterPc='S';
    		}
    		System.out.println("Bilgisayara kalan harf:"+letterPc);
    	}
    	
    	
    	for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matris[i][j]='_';
			}
    	}
    	
    	while(!isAllCellsFull(matris)) {
    		
    	}
    	
    	printMatrisAndPoints(matris);
    	System.out.println(isAllCellsFull(matris));
    
    	
    	
    	input.close();
    }
}
