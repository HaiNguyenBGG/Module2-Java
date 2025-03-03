import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Chuỗi 123";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex); // Tạo đối tượng Pattern từ regex
        Matcher matcher = pattern.matcher(text); // Tạo đối tượng Matcher tìm kiếm trong text

        while (matcher.find()) {
            System.out.println("Tìm thấy số: " + matcher.group());
        }
    }
}
