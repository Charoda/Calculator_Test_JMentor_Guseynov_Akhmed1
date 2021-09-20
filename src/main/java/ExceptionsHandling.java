import java.util.regex.Pattern;

public class ExceptionsHandling {

    public void bothArabicAndRoman(String ss) throws Exception {
        boolean RomanAndArabic = false;
        if (Pattern.compile("[0-9]").matcher(ss).find() & Pattern.compile("[XVILCDM]").matcher(ss).find()  ) {
            RomanAndArabic = true;
        }
        if (RomanAndArabic){
            throw new Exception("You have entered both arabic and roman numerals. " +
                    "Please enter only Roman or only Arabic numerals");
        }
    }

    public void notArabicAndRoman(String ss) throws Exception {
        boolean RomanAndArabic = false;
        if (Pattern.compile("[^*XVILCDM0123456789+/-]").matcher(ss).find())    {
            RomanAndArabic = true;
        }
        if (RomanAndArabic){
            throw new Exception("You have entered incorrect data, please enter correct data, \n" +
                    "according to the instructions\n"
            +"Example1: 1 + 2 \nExample2: X + IX ");
        }
    }


}
// throw new Exception("The entered data does not correspond to Roman and Arabic numerals. " +
//         "Please enter only Roman or Arabic numerals");