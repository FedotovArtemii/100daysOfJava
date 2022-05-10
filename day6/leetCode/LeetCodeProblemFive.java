package day6.leetCode;

class Solution {
    static boolean isHappy(int n){
        int s = n, f = n;

        do{
            s = square(s);
            f = square(f);
            f = square(f);
            if(s == 1){
                return true;
            }

        }while(s != f);

        return false;

    }

    static int square(int num){
        int ans = 0;
        while(num > 0){
            long rem = num % 10;
            ans += Math.pow(rem, 2);
            num = num / 10;
        }

        return ans;
    }
}
