package Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule41B extends Rule{
    @Override
    public boolean isValid(String x) {
        boolean check = false;
        for(int i=0;i<x.length()-1;i++){
            if("ỡ".contains(x.charAt(i)+"")){
                if("i".contains(x.charAt(i+1)+""))
                    check=true;
            }
        }
        if(check==true){
            if(x.equals("hỡi"))
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public void showError() {
        System.out.println("Rule41B error");
    }
}