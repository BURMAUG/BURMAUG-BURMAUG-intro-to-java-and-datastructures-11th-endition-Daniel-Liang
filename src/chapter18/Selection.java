//package chapter18;
//
//import java.io.File;
//import java.util.Arrays;
//
//public class Selection {
//    public static void selectSort(int[] numb){
//        int leng = 0, pos = 0, val =0;
//        int current_small = numb[0];
//
//          for (int i = 0; i < numb.length; i++){
//            if (current_small > numb[i]) {
//                current_small = numb[i];
//                pos = i;
//                val = numb[pos];
//            }
//              while (leng <= numb.length){
//                  //swap
//                  int temp = val ;
//                  numb[leng] = current_small;
//                  numb[pos] = temp;
//                  leng++;
//                  current_small  = numb[leng];
//              }
//          }
//
//        System.out.println(Arrays.toString(numb));
//    }
//
//    public int numberOfDir(File file)
//    {
//        int sum = 0;
//        if (file.isDirectory())
//        {
//            File[] files = file.listFiles();
//            for (int i = 0; i < file.length(); i++)
//                sum+=numberOfDir(files[i]);
//        }else
//            sum+=file.length();
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] nu = {12,23,1,3,4,56,9};
//        selectSort(nu);
//    }
//}
