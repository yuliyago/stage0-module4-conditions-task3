package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
if(((symbol>=65)&&(symbol<=90))||((symbol>=90)&&(symbol<=122))){
    System.out.println("English");
}
else{
    System.out.println("Non English");
}
    }

    public static void main(String[] args) {
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println((int)'a');
        System.out.println((int)'z');
    }
}
