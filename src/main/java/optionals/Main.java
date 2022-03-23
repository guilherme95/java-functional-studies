package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional.ofNullable("guilherme@email.com").ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("there is no email present")
        );

    }
}
