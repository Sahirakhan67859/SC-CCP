import java.util.*;
class CreditCard {
    private final String number;

    public CreditCard(String number) {
        this.number = Objects.requireNonNull(number, "Credit card number cannot be null");
    }

    public String getNumber() { return number; }
}