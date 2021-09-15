package DayExercise.day11_20;

/**
 * @author ZhengXinchang
 * @create 2021-09-12-8:46
 */
public class Day15 {
    public static boolean checkValidString(String s){

        int l=0;
        int h=0;
        for (int i = 0; i < s.length(); i++) {
            char tmp=s.charAt(i);
            if(tmp=='('){
                l++;
                h++;
            }else if(tmp==')'){
                if(l>0){
                    l--;
                }
                h--;
            }else if(tmp=='*'){
                if(l>0){
                    l--;
                }
                h++;
            }
            if(h<0){
                return false;
            }
        }
        return l==0;
    }
    

    public static void main(String[] args) {
    }
}
