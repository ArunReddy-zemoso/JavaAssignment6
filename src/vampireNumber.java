public class vampireNumber {
    public static void main(String[] args) {

    }
    /*public  static int countDigits(int num){
        int count=0;
        for(int i=num;i>0;i=i/10){
            count++;
        }
        return count;
    }
    public static boolean check(int num){
        int c=countDigits(num);
        if(c%2 == 1)
            return false;
        for(int i=(int)Math.pow(10,c/2 -1);i<(int) Math.pow(10,c/2);i++){
            if(num%i==0){
                int j=num/i;
                if(!(j>Math.pow(10,c/2 -1) && j<Math.pow(10,c/2)))
                    continue;
                int temp=i*(int)Math.pow(10,c/2)+j;
                if(i%10 ==0 || j%10==0)
                    continue;

            }
        }
    }*/
}
