public class Main {
    public static void main(String[] args) {
        String str = "Chuỗi Java";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, 5));
        System.out.println(str.contains("Chuỗi"));
        System.out.println(str.replace("Chuỗi", "String"));
        System.out.println(str.indexOf("J"));
        System.out.println(str.equals("String Java"));
        System.out.println(str.trim());
    }
}