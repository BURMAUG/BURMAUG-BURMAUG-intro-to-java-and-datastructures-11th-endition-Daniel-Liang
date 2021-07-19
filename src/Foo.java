public class Foo {


    public static void main(String[] args) {
        try {
            fo();
        }catch (Exception ex)
        {
            System.out.println("main");
        }

    }

    public static void fo()
    {
        try {

            System.out.println("Enter fo");
            int[] i = new int[10];
            i[9] = 90;
            System.out.println("Leaving");

        }
//        }catch (Exception e){
//            System.out.println("cau");
//        }
        finally {
            System.out.println("final");
        }
    }


}
