package stringHandling;

public class SH {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World";
        System.out.println("String: " + str);

        long startTime = System.nanoTime();
        String slowStr = "Java";
        for (int i = 0; i < 10000; i++) {
            slowStr += " Programming";
        }
        long endTime = System.nanoTime();
        System.out.println("String Time: " + (endTime - startTime) + " ns");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());

        startTime = System.nanoTime();
        StringBuilder fastSb = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            fastSb.append(" Programming");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf.toString());

        startTime = System.nanoTime();
        StringBuffer safeSb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            safeSb.append(" Programming");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}
