package task_string;

public class CountText implements ICountAble{
    @Override
    public int Number_Of_Char(String str, String chr) {
        int number=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==chr.charAt(0)){
                number++;
            }
        }
        return number;
    }

    @Override
    public int Number_World_Of_Char(String str, String chr) {
        int number=0;
        char dopstr=' ';
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==chr.charAt(0)&&(i==0||(str.charAt(i-1))==dopstr||i==0)){
                number++;
            }else if(str.charAt(i)==chr.charAt(0)&&(str.charAt(i-1))==dopstr){
                number++;
            }
        }
        return number;
    }

    @Override
    public int Number_World_First_Last(String str, char chrOne, char chrTwo) {
        int number=0;
        char dopstr=' ';
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==chrOne&&(str.charAt(i-1))==dopstr){
                for(int j=i;j<str.length();j++){
                    if(str.charAt(j)==chrTwo&&j==str.length()-1)
                    {
                        number++;
                        break;
                    }else if(j==str.length()-1||str.charAt(j)==dopstr){
                        break;
                    }
                    if(str.charAt(j)==chrTwo&&(str.charAt(j+1))==dopstr){
                        number++;
                        break;
                    }

                }
            }
        }
        return number;
    }

    @Override
    public int PolidromInfo(String str) {
        int number = 0;
        char dopstr = ' ';
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            boolean kl = true;
            if (str.charAt(i) != dopstr && ((i==0)||(str.charAt(i - 1) == dopstr))) {
                StringBuilder str2 = new StringBuilder();
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == dopstr) {
                        break;
                    }
                    str2.append(str.charAt(j));
                }
                for (int q = 0; q < str2.length(); q++) {
                    if ((str2.charAt(q) != str2.charAt(str2.length()-1 - q))) {
                        kl = false;
                        break;
                    }
                }
                if (kl == true) {
                    number++;
                }
            }
        }
        return number;
    }

    @Override
    public void Polidrom(String str){
        char dopstr = ' ';
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            boolean kl = true;
            if (str.charAt(i) != dopstr && ((i==0)||(str.charAt(i - 1) == dopstr))) {
                StringBuilder str2 = new StringBuilder();
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == dopstr) {
                        break;
                    }
                    str2.append(str.charAt(j));
                }
                for (int q = 0; q < str2.length(); q++) {
                    if ((str2.charAt(q) != str2.charAt((str2.length()-1 - q)))) {
                        kl = false;
                        break;
                    }
                }
                if (kl == true) {
                    System.out.println(str2);
                    return;
                }
            }
        }
    }
}
