package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static String getDBConnection (){
        return "jdbc://localhost:5654/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
            List.of("jdbc://localhost:5654/users",
            "url2");
}
