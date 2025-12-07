package ua.opnu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(el -> el*2).toList();
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(el -> el*el).toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(el -> String.format("y%sy", el)).toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(el -> el>=0).toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(el -> {
            String str = String.valueOf(el);
                 return !str.substring(str.length()-1).equals("9");
        }).toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(el -> el.indexOf("z")<0).toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream().distinct().sorted((el1, el2) -> Integer.compare(el2.length(), el1.length())).toList();
    }

    public List<String> flatten(List<String> strings) {

        return strings.stream().flatMap(el -> Arrays.stream(el.split(" "))).toList();
    }

}