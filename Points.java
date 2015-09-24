package rekop;

import java.util.ArrayList;

public class Points {


	public static int main(int[] suits,int[] Numbers) {	
	int x;
    if(poker.RoyalFlush(suits,Numbers)){
    	x=10;
    }
    else if(poker.StraightFlush(suits,Numbers)){
    	x=9;
    }
    else if(poker.FourOfaKind(Numbers)){
    	x=8;
    }else if(poker.FullHouse(Numbers)){
    	x=7;
    }else if(poker.Flush(suits) ){
    	x=6;
    }else if(poker.Straight(Numbers)){
    	x=5;
    }else if(poker.ThreeOfaKind(Numbers)){
    	x=4;
    }else if(poker.Twopair(Numbers)){
    	x=3;
    }else if(poker.Onepair(Numbers)){
    	x=2;
    }
    else{
    	x=1;
    }
 System.out.println(x);
    return x;
}
}
