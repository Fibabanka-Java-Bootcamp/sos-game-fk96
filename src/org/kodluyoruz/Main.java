package org.kodluyoruz;
import java.util.*;
public class Main {


	
	
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
    	
		
		  do { 
			  System.out.print("Size of matrix(3...7):");
			  n=input.nextInt(); }
		  while(n<3 || n>7);
		  
		  //System.out.println(n); 
		  char matris[][]=new char[n][n];
		 
    	
    	player=rand.nextInt(2);
    	if(player==0) {
    		System.out.println("Bilgisayar");
    	}
    	else {
    		System.out.println("Oyuncu");
    	}
    	
    	for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matris[i][j]='_';
			}
    	}
    	
    	for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matris[i][j]+"|");
			}
			System.out.println("");
    	}
    	
    	System.out.println(isAllCellsFull(matris));
    	
    }
}
