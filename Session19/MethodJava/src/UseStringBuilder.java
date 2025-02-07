public class UseStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Chuỗi");
        System.out.println(sb.append(" Động"));
        System.out.println(sb.insert(6, ","));
        System.out.println(sb.replace(7, 11, "Java"));
        System.out.println(sb.delete(6, 7));
        System.out.println(sb.reverse());
        sb.reverse();
        System.out.println(sb.substring(6));
    }
}
