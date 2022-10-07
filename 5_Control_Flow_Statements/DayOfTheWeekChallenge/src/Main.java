public class Main {
    public static void main(String[] args) {
        getDaysInMonth(7, 2010);
        }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <=9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                return true;
        } else {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        switch(month){
            case 1:
                return 31;
            case 2:
                if(isLeapYear(year)) {
                    return 29;
                }
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            break;
            case 6:
                return 30;
            break;
            case 7:
                return 31;
            break;
            case 8:
                return 30;
            break;
            case 9:
                return 31;
            break;
            case 10:
                return 30;
            break;
            case 11:
                return 31;
            break;
            case 12:
                return 30;
            break;
            default:
                return -1;

        }
        return -1;
    }
}
