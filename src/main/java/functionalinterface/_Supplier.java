package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getJDBCUrlConnection.get());
        System.out.println(getMultipleJDBCUrlsConnections.get());
    }

    static Supplier<String> getJDBCUrlConnection = ()->
            "jdbc://localhost:5432/user";

    static Supplier<List<String>> getMultipleJDBCUrlsConnections = () ->
            Arrays.asList(
                    "jdbc://localhost:5432/auth",
                    "jdbc://localhost:5432/user",
                    "jdbc://localhost:5432/consumer");
}
