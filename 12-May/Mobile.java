public class Mobile {

    static String find(String t){
        String result="";
        for(int i=0;i<t.length();i++){
            result += number(t.charAt(i));
        }

        return result;
    }

    static char number(char c){
        if(c=='a'|| c=='b' || c=='c'){
            return '2';
        }
        else if(c=='d'||c=='e'||c=='f'){
            return '3';
        }
        else if(c=='g'||c=='h'||c=='i'){
            return '4';
        }
        else if(c=='j'||c=='k'||c=='l'){
            return '5';
        }
        else if(c=='m'||c=='n'||c=='o'){
            return '6';
        }
        else if(c=='p'||c=='q'||c=='r'||c=='s'){
            return '7';
        }
        else if(c=='t'||c=='u'||c=='v'){
            return '8';
        }else{
            return 9;
        }
        
    }

    public static void main(String args[]){
        String s = "abmnashts";
        String result = find(s);
        System.out.println(result);
    }
    
}
