package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    public boolean isValidate(String commandStr, Enum[] commandsData) {


        for (Enum command : commandsData) {
            if (command.name().equals(commandStr)) {
                return true;

            }
        }
        return false;
    }
//проверка заданых символов
    public boolean isDataByRegExp(String numberStr, Pattern pattern) {
        Matcher matcher = pattern.matcher(numberStr);
        return matcher.find();
    }
}
