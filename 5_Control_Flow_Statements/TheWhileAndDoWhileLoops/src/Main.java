public class Main {
    public static void main(String[] args) {

//        //WHILE
//        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        //FOR
//        for(int i=6; i!=6; i++){
//            System.out.println("Count value is " + count);
//        }
//
//        //DO WHILE
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count !=6)

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        //CHALLENGE
        int number = 4;
        int finishNumber = 30;
        int isEvenNumber = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            isEvenNumber++;
            if(isEvenNumber == 5){
                break;
            }
        }
        System.out.println("Five is reached " + isEvenNumber);
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

}
