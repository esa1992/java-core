public class TypesDemo {
    public static void main(String[] args) {

        int i = Integer.MAX_VALUE;
        i = i + 2147483647;
        i = i + 2;
        System.out.println(i);

        //String clientNameLat = "Test";
        int a = 1;
        int b = 2;
        System.out.println("a = " + a + " b = " + b);
        int temp = a;

        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
        System.out.println("a = " + a + " b = " + b);
        System.out.println("a = " + a + " b = " + b);
    }
}