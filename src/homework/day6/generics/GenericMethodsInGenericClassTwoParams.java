package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public String genericMethodGenArgs(X firstArg, Y secondArg) {

        return "I received  2 arguments of type: " + firstArg.getClass().getSimpleName() + " class, " + secondArg.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X firstArg) {

        return "I received  1 arguments of type: " + firstArg.getClass().getSimpleName() + " class ";
    }

    public void genericMethodHalfGenArgs(X firstArg, String secondArg) {
        int stringLength = secondArg.length();
        System.out.println("I got an object of " + firstArg.getClass().getSimpleName() + " class and string with " + stringLength + " characters");
    }

    public void genericMethodHalfGenArgs(X firstArg, Y secondArg, String thirdArg) {
        int stringLength = thirdArg.length();
        System.out.println("I got an object of " + firstArg.getClass().getSimpleName() + " class and " + secondArg.getClass().getSimpleName() + " class and string with " + stringLength + " characters");
    }
}
