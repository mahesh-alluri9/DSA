package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App {

    public static void main(String[] args) {
        String s = "Venkata, Sai. Mahesh";

        ArrayDeque<Character> collect = s.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
                .collect(Collectors.toCollection(ArrayDeque::new));

        StringBuilder letters = new StringBuilder();

        for(char i : s.toCharArray()){
            if(Character.isLetter(i)){
                letters.append(collect.removeLast());
            }else{
                letters.append(i);
            }
        }
        System.out.println(letters.toString());

    }
}
