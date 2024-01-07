public class MyString {

    // numarul de caractere dintr-un string cu tot cu spatii
    public int metoda1(String s){
        return s.length();
    }

    //concatenare a 3 stringuri

    public String metoda2(String s1, String s2, String s3){

        return(s1+" "+s2+" "+s3);
    }

    // returneaza true daca stringul primit incepe cu vocala
    public Boolean metoda3(String s){
        char[] vocale = {'a','e','i','o','u'};
        boolean test=false;
        for(int i=0;i< vocale.length;i++){
            if (vocale[i]==s.charAt(0)) test=true;
        }
        return (test);
    }

    //returneaza inversul stringului dat

    public String metoda4(String s){
        String invers="";
        for (int i=s.length()-1;i>=0;i--){
            invers=invers+s.charAt(i);
        }
        return invers;
    }
}
