import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern pattern =  Pattern.compile("^(0[1-9]|[1-9]|[12][0-9]|3[0-1])[\\.\\s-](0[1-9]|[1-9]|1[0-2])[\\.\\s-](19|20)?[0-9]{2}$");
        return pattern.matcher(dateString);
    }
}
