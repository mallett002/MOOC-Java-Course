package week12.stringBuilder;

public class Main {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String built = build(t);
        System.out.println(built);
    }

    public static String build(int[] t) {
        StringBuilder builder = new StringBuilder("{\n ");

        for (int i = 0; i < t.length; i++) {
            String n = "" + t[i];
            String nextStr;

            if (i == t.length - 1) {
                nextStr = n + "\n" + "}";
                builder.append(nextStr);
            } else {
                if ((i + 1) % 4 == 0) {
                    nextStr = "" + n + ",\n ";
                    builder.append(nextStr);
                } else {
                    nextStr = "" + n + ", ";
                    builder.append(nextStr);
                }
            }
        }

        return builder.toString();
    }
}
