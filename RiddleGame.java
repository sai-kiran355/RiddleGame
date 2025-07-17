import java.util.*;

public class RiddleGame {

    static Scanner scanner = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Riddle Game!");
        System.out.println("Choose difficulty: Easy / Medium / Hard");
        String difficulty = scanner.nextLine().toLowerCase();

        List<Riddle> riddles = getRiddlesByDifficulty(difficulty);
        Collections.shuffle(riddles);

        for (Riddle riddle : riddles) {
            playRiddle(riddle);
            System.out.println("Continue playing? (yes/no)");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) break;
        }

        System.out.println(" Game Over! Your final score: " + score);
        System.out.println("Thanks for playing!");
    }

    static void playRiddle(Riddle riddle) {
        System.out.println("\nRiddle: " + riddle.question);
        int attempts = 2;

        while (attempts > 0) {
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(riddle.answer)) {
                System.out.println(" Correct!");
                score += riddle.points;
                return;
            } else {
                attempts--;
                System.out.println(" Incorrect! Attempts left: " + attempts);
                if (attempts == 1) {
                    System.out.println("Want a hint? (yes/no)");
                    if (scanner.nextLine().toLowerCase().equals("yes")) {
                        System.out.println(" Hint: " + riddle.hint);
                    }
                }
            }
        }

        System.out.println(" The correct answer was: " + riddle.answer);
    }

    static List<Riddle> getRiddlesByDifficulty(String difficulty) {
        List<Riddle> all = new ArrayList<>();

        if (difficulty.equals("easy")) {
            all.add(new Riddle("The more you take, the more you leave behind. What am I?", "Footsteps", "Think what you leave while walking", 5));
            all.add(new Riddle("I speak without a mouth and hear without ears. What am I?", "Echo", "Sound that reflects", 5));
        } else if (difficulty.equals("medium")) {
            all.add(new Riddle("I have branches, but no fruit, trunk or leaves. What am I?", "Bank", "Related to money", 10));
            all.add(new Riddle("What can travel around the world while staying in the same spot?", "Stamp", "Used in letters", 10));
        } else if (difficulty.equals("hard")) {
            all.add(new Riddle("I come from a mine and get surrounded by wood. What am I?", "Pencil lead", "Used in school", 15));
            all.add(new Riddle("I have cities, but no houses. What am I?", "Map", "Look at geography", 15));
        } else {
            System.out.println("Invalid difficulty. Defaulting to Easy.");
            return getRiddlesByDifficulty("easy");
        }

        return all;
    }

    static class Riddle {
        String question;
        String answer;
        String hint;
        int points;

        public Riddle(String question, String answer, String hint, int points) {
            this.question = question;
            this.answer = answer;
            this.hint = hint;
            this.points = points;
        }
    }
}
