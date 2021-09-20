

public class CalculateArabicNums  {

    public String calcArabicNums(String mas) throws Exception {


        String[] var = new String[2];
        Integer summ = null;
// Удаление все имеющихся пробелов.
        while (mas.contains(" ")) {
            mas = mas.replace(" ", "");

        }

        if (mas.contains("+")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("+", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: 1-10");
                }


            }
            summ = Integer.parseInt(var[0]) + Integer.parseInt(var[1]);
        }
        if (mas.contains("-")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("-", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: 1-10");
                }



            }
            summ = Integer.parseInt(var[0]) - Integer.parseInt(var[1]);
        }
        if (mas.contains("*")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("*", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++) {
                if (Integer.parseInt(var[i]) > 10 || Integer.parseInt(var[i]) < 1) {
                    throw new Exception("The range must be within: 1-10");
                }



            }
            summ = Integer.parseInt(var[0]) * Integer.parseInt(var[1]);
        }
        if (mas.contains("/")) {
            // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
            mas = mas.replace("/", " ");
            var = mas.split(" ");
            for (int i = 0; i < var.length; i++) {
                if ((Integer.parseInt(var[i]) < 1) | (Integer.parseInt(var[i]) > 10)) {
                    throw new Exception("The range must be within: 1-10");
                }

                if(Integer.parseInt(var[1])==0) {
                    throw new ArithmeticException("you can`t divide by zero\n Choose another number for the numerator");
                }



            }
            summ = Integer.parseInt(var[0]) / Integer.parseInt(var[1]);

        }
        return summ.toString();

    }
}
