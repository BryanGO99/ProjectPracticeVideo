package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseThrow(()-> new IllegalStateException("exception"));
        System.out.println(value);
    }
}
