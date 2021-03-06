//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
// 输入: 121
//输出: true
//
//
// 示例 2:
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
//
// 示例 3:
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//
// 进阶:
//
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学


//leetcode submit region end(Prohibit modification and deletion)

import java.util.Arrays;

public class T09回文数02 {

    public static boolean isPalindrome(int x) {
        //看x是几位数
        if (x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        int a=1;
        int i1=x/10;
        for (int j = 1; j < 11; j++) {
            if (i1>0){
                i1=i1/10;
                a++;
            }else {
                break;
            }
        }

        int[] c = new int[a];
        if(a>=2) {
            c[0] = x / ((int) Math.pow(10, (a-1)));
            c[a - 1] = x % 10;
            if (c[a-1]==0){
                return false;
            }
        }else {
            return true;
        }
        if (a>1) {
            a = a - 1;
            for (int i = 1; i < c.length; i++) {
                a--;
                c[i] = x / ((int) Math.pow(10, a)) % 10;
            }
        }

        for (int i = 0; i < c.length; i++) {

            if (c[i] == c[c.length-1-i]){

                return true;

            }else {

                return false;

            }
        }

        return false;
    }

    public static void main(String[] args) {

//        int[] c={1,2,3};
//
//        for (int i = 0; i < c.length; i++) {
//
//            if (c[i] == c[c.length-1-i]){
//
//                //return true;
//                System.out.println(true);
//
//            }else {
//                //return false;
//                System.out.println(false);
//            }
//        }


        int x=1000021;
        System.out.println(isPalindrome(x));
//        int a=1;
//        int i1=x/10;
//        for (int j = 1; j < 11; j++) {
//            if (i1>0){
//                i1=i1/10;
//                a++;
//            }else {
//                break;
//            }
//        }

//        System.out.println(a);
//        System.out.println(x);

//        System.out.println(x/((int)Math.pow(10,(4-1)))%10);
//        System.out.println(x/((int)Math.pow(10,4)));
//        int a=8;
//
//        //System.out.println(i);
//        int[] c = new int[a];
//        c[0]=x/((int)Math.pow(10,(a-1)));
//        c[a-1]=x%10;
//        a=a-1;
//        for (int i = 1; i < c.length-1; i++) {
//            a--;
//            c[i]=x/((int)Math.pow(10,a))%10;
//
//        }
//        System.out.println(Arrays.toString(c));
//
//
//        //System.out.println(Arrays.toString(c));
//
//       //System.out.println(chars.toString());
//
        //int maxValue = Integer.MAX_VALUE;
//
//        int minValue = Integer.MIN_VALUE;
//
////        boolean palindrome = isPalindrome(i);
////
        //System.out.println(maxValue);

    }
}
