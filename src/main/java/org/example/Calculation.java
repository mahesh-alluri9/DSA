package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class Calculation {

    public static String calculation(String num1, String num2){
        StringBuilder builder = new StringBuilder();

        boolean b = num1.contains(",") || num2.contains(",");

        if(Objects.nonNull(num2)){

            num1 =  num1.replace(",", "");
            num2 =  num2.replace(",", "");


            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int remVal = 0;

            for(; i >= 0 || j >= 0 || remVal != 0; i--, j--){
                int lat = (i >= 0) ? Character.getNumericValue(num1.charAt(i)) : 0;
                int late = (j >= 0) ? Character.getNumericValue(num2.charAt(j)) : 0;
                int sum = lat + late + remVal;

                builder.append(sum % 10);

                remVal = sum / 10;

            }
        }
        builder.reverse();
        return  b ? addingCommas(builder.toString()) : builder.toString();
    }

    public static String addingCommas(String value){
        StringBuilder builder2 = new StringBuilder();
        int counter = 0;

        for(int i = value.length() - 1; i >= 0 ; i--){
            builder2.append(value.charAt(i));
            counter ++;
            if(counter % 3 == 0 && i != 0){
                builder2.append(",");
            }
        }
        return builder2.reverse().toString();
    }



    public static void main(String[] args) {
        System.out.println(calculation("10,250", "10,250"));
    }
}
