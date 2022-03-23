package finalsection;

import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if(age!=null){
                System.out.println("Your age is: " + age);
            }else{
                System.out.println("There is no age provided");
            }
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Guilherme", 26));
    }
}
