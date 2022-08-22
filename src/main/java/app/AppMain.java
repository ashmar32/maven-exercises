package app;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Enter something: ");
        Input input = new Input();

        String userInput = input.getString();
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }

}
