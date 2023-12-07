
package dicegame;

public class AI extends Player{
    private String[] emo = {"huhu","hihi","haha","hehe"};

    public AI(String t) {
        super(t);
    }
    public String showEmo(int i){
        return emo[i];
    }
    
}
