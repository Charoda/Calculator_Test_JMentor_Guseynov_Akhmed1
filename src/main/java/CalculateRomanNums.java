public class CalculateRomanNums  {


    public String calcRomanNums(String mas) throws Exception {


RomanNumber romanNumber = new RomanNumber();

        String[] var = new String[2];
        Integer summ = null;
        String summToString = null;

// Удаление все имеющихся пробелов.
        while (mas.contains(" ")) {
            mas = mas.replace(" ", "");

        }

        if (mas.contains("+")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("+", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++){
                    var[i] = RomantoArabicConverter.romanToArabic(var[i]);
            }
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: I-X");
                }


            }
            summ = Integer.parseInt(var[0]) + Integer.parseInt(var[1]);
        }

        if (mas.contains("-")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("-", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++){
                var[i] = RomantoArabicConverter.romanToArabic(var[i]);
            }
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: I-X");
                }


            }
            summ = Integer.parseInt(var[0]) - Integer.parseInt(var[1]);
        }
        if (mas.contains("*")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("*", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++){
                var[i] = RomantoArabicConverter.romanToArabic(var[i]);
            }
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: I-X");
                }


            }
            summ = Integer.parseInt(var[0]) * Integer.parseInt(var[1]);
        }
        if (mas.contains("/")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("/", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++){
                var[i] = RomantoArabicConverter.romanToArabic(var[i]);
            }
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: I-X");
                }


            }
            summ = Integer.parseInt(var[0]) / Integer.parseInt(var[1]);
        }
if (summ<1){
    throw new Exception("Результат работы меньше единицы");
}
        summToString=romanNumber.testRomanConversion(summ);
        return summToString;

    }
}
