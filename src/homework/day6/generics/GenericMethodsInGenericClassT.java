package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T type) {
        System.out.println("I am an object of " + type.getClass().getSimpleName() + " class");

    }

    public <X, Y> String genericMethodTwoGenArgs(X firstArg, Y secondArg) {
        String returnedString = "We are objects of " + firstArg.getClass().getSimpleName() + " class and " + secondArg.getClass().getSimpleName() + " class";
        System.out.println(returnedString);
        return "We are objects of " + firstArg.getClass().getSimpleName() + " class and " + secondArg.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T firstArg, String secondArg) {
        int stringLength = secondArg.length();
        System.out.println("I got an object of " + firstArg.getClass().getSimpleName() + " class and string with " + stringLength + " characters");
    }
}
