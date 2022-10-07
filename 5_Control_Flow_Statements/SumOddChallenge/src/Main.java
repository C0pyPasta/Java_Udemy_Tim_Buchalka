public class Main {
    public static void main(String[] args) {

    int result = SumOddRange.sumOdd(1,11);
        System.out.println(result);
    }

    public static class SumOddRange {
        public static boolean isOdd(int number){
            if(number > 0) {
                if(number % 2 != 0){
                    return true;
                }
                return false;
            }
            return false;
        }
        public static int sumOdd(int start, int end){
            if(end >= start && (end != 0 && start != 0)){
                for(int i = 0; i <= end; i++){
                    int count =+i;
                    if(isOdd(i)){
                        return -1;
                    }
                    return count;
                }
            }
            return -1;
        }
    }
}
