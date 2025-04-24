public class Utils {
    public static String repeat(String str, int times) {
      StringBuilder sb = new StringBuilder();
        // A mutable(editable) sequence of characters.
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}






