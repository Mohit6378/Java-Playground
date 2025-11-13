public class Exception3 {
    public static void main(String[] args) {
        try {
            try {
                int[] arr = new int[3];
                arr[5] = 10; // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }
    }
}