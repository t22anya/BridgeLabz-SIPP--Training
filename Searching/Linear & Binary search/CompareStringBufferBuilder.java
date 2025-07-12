public class CompareStringBufferBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        long end2 = System.nanoTime();
        System.out.println("StringBuilder time: " + (end1 - start1));
        System.out.println("StringBuffer time: " + (end2 - start2));
    }
}