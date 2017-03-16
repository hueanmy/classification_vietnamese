package Rule;
/* con error*/
/**
 * Created by katie on 16/03/2017.
 */
public class Rule46 extends Rule{
    @Override
    public boolean isValid(String x) {
        String[] words = {"iữa", "iễu", "iếu", "iều", "iểu", "iêu", "iệu",
                          "iai", "iải", "iới", "iỏi", "iươ", "iườ", "iòi"};
        String word2 = "ữ ễ ế ề ể ê ệ a ả ớ ỏ ư ò";
        String word3 = "a u i ơ ờ ";
        boolean check = false;
        int count = 0;
        String VowelCharacters = "eyuioa"
            + "èéẹẻẽ" + "ê" + "ềếệểễ"
            + "ùúụủũ" + "ư" + "ừứựửữ"
            + "ìíịỉĩ"
            + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
            + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ"
            + "ỳýỵỷỹ"
            ;
        for(int i=0;i<x.length()-1;i++){
            if(VowelCharacters.contains(x.charAt(i)+"")){
                count++;
            }
        }
        if(count==3){
            for(int i=0;i<x.length()-1;i++){
                if("i".contains(x.charAt(i)+"")){
                    if(word2.contains(x.charAt(i+1)+"")){
                        if(word3.contains(x.charAt(i+2)+"")){
                            check = true;
                            break;
                        }
                    }
                }
            }
        }
        if(check==true){
            for(String c : words){
                if(x.contains(c)){
                    check = true;
                    break;
                }
                else
                    check = false;
            }
        }

        return check;
    }

    @Override
    public void showError() {
        System.out.println("rule46 error");
    }
}
