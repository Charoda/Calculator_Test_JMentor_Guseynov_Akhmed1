import java.util.regex.Pattern;

public class Caclulations {


    ExceptionsHandling exceptionsHandling = new ExceptionsHandling();
    CalculateRomanNums calculateRomanNums = new CalculateRomanNums();
    CalculateArabicNums calculateArabicNums =  new CalculateArabicNums();

    public void setExceptionsHandling(ExceptionsHandling exceptionsHandling) {
        this.exceptionsHandling = exceptionsHandling;
    }

    public void setCalculateRomanNums(CalculateRomanNums calculateRomanNums) {
        this.calculateRomanNums = calculateRomanNums;
    }

    public void setCalculateArabicNums(CalculateArabicNums calculateArabicNums) {
        this.calculateArabicNums = calculateArabicNums;
    }

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

public void checkingInputData() throws Exception {

    exceptionsHandling.notArabicAndRoman(str);
    exceptionsHandling.bothArabicAndRoman(str);

}

public void calculator() throws Exception {

    if (Pattern.compile("[0-9]").matcher(str).find()){
        System.out.println(calculateArabicNums.calcArabicNums(str));
    }
    if (Pattern.compile("[XVILCDM]").matcher(str).find()){
        System.out.println(calculateRomanNums.calcRomanNums(str));
    }


}



}
