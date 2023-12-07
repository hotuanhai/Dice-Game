
package dicegame;

public class Player {
    private String name;
    private int point = 0;
    public Player(String t){
         this.point = 0 ;
         this.name = t;
    }

    public Player() {
    }
    

    public void roll(Dice dice){
        point += dice.getVal();
        if(point > 21) point = 0;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
}
