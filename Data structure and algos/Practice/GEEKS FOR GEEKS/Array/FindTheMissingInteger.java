public class FindTheMissingInteger {

    public static int findMissing(int[] arr){

        int sum = 0;
        int greater=0;
        for (int i : arr) {
            sum +=i;
            if (greater<i){
                greater = i;
            }
        }
        return (greater*(greater+1)/2)-sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(findMissing(arr));
        
    }
    
}
