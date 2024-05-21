package OOPsProblem;

public class InstanceVariableExample {
    private int value; // Private instance variable

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
/*
Instance Variable Visibility
Instance variables should typically be declared as private: This is to adhere to the principle of encapsulation, which restricts direct access to the internal state of an object.
 */