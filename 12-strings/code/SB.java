public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        // 1 included 4 excluded
        builder.replace(1, 4, "efgh");
        System.out.println(builder.toString());
        builder.reverse();

        System.out.println(builder);
    }
}
