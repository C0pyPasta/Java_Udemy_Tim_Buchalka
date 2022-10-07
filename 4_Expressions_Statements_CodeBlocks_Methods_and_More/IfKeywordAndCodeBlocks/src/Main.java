//Class
public class Main {
    //Method
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highscore);

        //CHALLENGE
        String playerName = "Barry";
        int position = 1;
        displayHighScorePosition(playerName, position);

        int calculatedPosition = calculateHighScorePosition(900);
        System.out.println("Calculated position is " + calculatedPosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus) {

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    //CHALLENGE
    public static void displayHighScorePosition(String playerName, int position ) {
        System.out.println(playerName + " managed to get into position " + position);

    }
    public static int calculateHighScorePosition(int score) {
//        if(score > 1000) {
//            return 1;
//        } else if (score > 500 && score < 1000) {
//            return 2;
//        } else if (score > 100 && score < 500){
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming postition 4 will be returned

        if(score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >=100) {
            position = 3;
        }
        return position;
    }

}
