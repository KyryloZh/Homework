public class Task1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;
//        int a = y - x++ * z;          // 1.x*z or (10*3); 2. y-xz or (12-30); 3.x+a1 or (-18+10); 4.x++
//        int a1 = x+a;
//         System.out.println(a1);

//      int b = --x - y * 5;            // 1.y*5 or (12*5); 2.--x or (10-1); 3. --x-5y or (9-60)
//         System.out.println(b);

//      int c = x + 5% z;               // 1. 5%z or (5%3); 2. x+5%z or (10+2); 3.y/c or (12/12)
//        int c1 = y/c;
//        System.out.println(c1);

//     int d = x+=1 + y * 5;             // 1.x++ or (10+1); 2.y*5 or (12*5); 3.x++ + 5y or (11+60)
//         System.out.println(d);

        int e = y - x++ * z;           // 1.x*z (10*3); 2.y-xz (12-30); x++ is never used
           System.out.println(e);

       }
}
