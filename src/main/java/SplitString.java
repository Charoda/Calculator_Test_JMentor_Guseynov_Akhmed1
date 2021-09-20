
public class SplitString {

    private String mas;


public String [] separationOfComponents(String mas) {

    this.mas = mas;
    String [] var = new String[2];
// Удаление все имеющихся пробелов.
    while (mas.contains(" ")) {
        mas = mas.replace(" ", "");

    }

    if (mas.contains("+")) {
        // Замена знака арифметической операции на пробел, иначе выдаст ошибку.
        mas = mas.replace("+", " ");
        var = mas.split(" ");
        String a = var[0];
        System.out.println(a);


    }
    if (mas.contains("-")) {
        mas = mas.replace("-", " ");

    }
    if (mas.contains("*")) {
        mas = mas.replace("*", " ");
    }
    if (mas.contains("/")) {
        mas = mas.replace("/", " ");
    }

    return var;
    }



}


