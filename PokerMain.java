package rekop;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PokerMain {
	 static String file2 = "/home/seshagiri/zemoso/JAVA problem1/poker.txt";
	 static char[] Suits = {'S','C','H','D'};
	 static char[] Numbers = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
	 static int pw1=0;
	 static int pw2=0;
public static void main(String[] args) throws FileNotFoundException{
	Scanner sc2 = new Scanner(new FileReader(file2));
	 while(sc2.hasNextLine()){
		 int p1=1;
		 int p2=1;
		 int y=0;
		 int z=0;
		 int[] Player1_s = {0,0,0,0};
		 int[] Player1_n = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		 int[] Player2_s = {0,0,0,0};
		 int[] Player2_n = {0,0,0,0,0,0,0,0,0,0,0,0,0}; 
			String line = sc2.nextLine();
		for(int a=0;a<5;a++){			
			char i = line.charAt((3*a));
			char j = line.charAt((3*a)+1);
			for(int b=0;b<Numbers.length;b++){
			if(i==Numbers[b]){
				Player1_n[b]++;
				break;
			   }
			}
			for(int c=0;c<Suits.length;c++){
				if(j==Suits[c]){
					Player1_s[c]++;
					break;
				}
			}
		  }
		for(int d=5;d<10;d++){			
				char i = line.charAt((3*d));
				char j = line.charAt((3*d)+1);
			for(int e=0;e<Numbers.length;e++){
				if(i==Numbers[e]){
					Player2_n[e]++;
					break;
				   }
				 }
			for(int f=0;f<Suits.length;f++){
				if(j==Suits[f]){
					Player2_s[f]++;
					break;
					}
				 }
			  }
		p1=	Points.main(Player1_s, Player1_n);
		p2=	Points.main(Player2_s, Player2_n);
		if((p1==1 && p2==1) || (p1==p2)){
			y=poker.HighCard(Player1_n);
			z=poker.HighCard(Player2_n);
			if(y>z){
				pw1++;
			}
			else if(y<z){
				pw2++;
			    }	
		    }
		else if(p1>p2){
			pw1++;
		}
		else if(p1<p2){
			pw2++;
		}
System.out.println(Player1_n[0]+" "+Player1_n[1]+" "+Player1_n[2]+" "+Player1_n[3]+" "+Player1_n[4]+" "+Player1_n[5]+" "+Player1_n[6]+" "+Player1_n[7]+" "+Player1_n[8]+" "+Player1_n[9]+" "+Player1_n[10]+" "+Player1_n[11]+" "+Player1_n[12]+" ");
System.out.println(Player2_n[0]+" "+Player2_n[1]+" "+Player2_n[2]+" "+Player2_n[3]+" "+Player2_n[4]+" "+Player2_n[5]+" "+Player2_n[6]+" "+Player2_n[7]+" "+Player2_n[8]+" "+Player2_n[9]+" "+Player2_n[10]+" "+Player2_n[11]+" "+Player2_n[12]+" "); 
}
	 sc2.close();	 
	System.out.println("Player1 score" + pw1);
	System.out.println("Player2 score" + pw2);
}
}
