
package dicegame;

import java.util.Random;

public class Dice {
    private int[] val = new int[25];
    private int cnt = 0;
    public Dice ( int pro){
        for(int i = 1 ; i <= 6; ++i){
            if(i == pro){
                for(int j =1;j <= 5; ++j){
                    val[cnt] = i;
                    ++cnt;
                }
            }
            else{
                for(int j =1;j <= 4; ++j){
                    val[cnt] = i;
                    ++cnt;
                }
            }
        }
    }

    public int getVal() {
        Random rd = new Random();
        int ran = val[rd.nextInt(val.length)];
        return ran;
    }
    
    
}
