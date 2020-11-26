import java.util.Random ;
import javax.swing.*;
public class RockPaperScissorTask {


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
                null,
                "The first player who reaches 5 points wins. \n                 Press OK to play!",
                "Let's start!",
                JOptionPane.WARNING_MESSAGE,
                null
        );

        int userScore = 0;
        int compScore = 0;
        int uChoice;
        int CompChoice;




        String input;


        Random generate = new Random();

        for (int rnd = 1; rnd <= 50; rnd++) {
            input = JOptionPane.showInputDialog(null, "Your score:" + userScore + "  My score: " + compScore + "\nEnter rock, paper, or scissors\n" + " (rock=1 paper=2 scissors=3)", "Round: " + rnd, JOptionPane.QUESTION_MESSAGE);
            uChoice = Integer.parseInt(input);

            CompChoice = generate.nextInt(3) + 1;


            while (uChoice < 1 || uChoice > 3) {
                input = JOptionPane.showInputDialog("Invalid entry ! Please Enter a 1, 2, or 3:\n 1 for rock,2 for paper and 3 for scissors  ");
                uChoice = Integer.parseInt(input);
            }
            if (uChoice == 1 && CompChoice == 1)
                JOptionPane.showMessageDialog(null, "You picked rock, " + " my pick was rock. \nTIE!");

            else if (uChoice == 2 && CompChoice == 2)
                JOptionPane.showMessageDialog(null, "You picked paper, " + " my pick was paper. \nTIE!");

            else if (uChoice == 3 && CompChoice == 3)
                JOptionPane.showMessageDialog(null, "You picked scissors, " + " my pick was scissors. \nTIE!");

            else if (uChoice == 1 && CompChoice == 2)

                JOptionPane.showMessageDialog(null, "You picked rock, " + " my pick was paper. Paper eats rock! \nYou LOSE!");

            else if (uChoice == 1 && CompChoice == 3)

                JOptionPane.showMessageDialog(null, "You picked rock, " + " my pick was scissors. Rock crushes scissors! \nYou WIN!");

            else if (uChoice == 2 && CompChoice == 1)

                JOptionPane.showMessageDialog(null, "You picked paper, " + " my pick was rock.Paper eats rock! \nYou WIN!");

            else if (uChoice == 2 && CompChoice == 3)

                JOptionPane.showMessageDialog(null, "You picked paper, " + " my pick was scissors. Scissor cuts paper! \nYou LOSE!");

            else if (uChoice == 3 && CompChoice == 1)

                JOptionPane.showMessageDialog(null, "You picked scissors, " + " my pick was rock.Rock crushes scissors! \nYou LOSE!");

            else if (uChoice == 3 && CompChoice == 2)

                JOptionPane.showMessageDialog(null, "You picked scissors, " + " my pick was paper. Scissor cuts paper! \nYou WIN!");
            if (uChoice == 1 && CompChoice == 2)
                compScore++;
            if (uChoice == 1 && CompChoice == 3)
                userScore++;
            if (uChoice == 2 && CompChoice == 1)
                userScore++;
            if (uChoice == 2 && CompChoice == 3)
                compScore++;
            if (uChoice == 3 && CompChoice == 1)
                compScore++;
            if (uChoice == 3 && CompChoice == 2)
                userScore++;
            if (compScore == 5) {

                JOptionPane.showMessageDialog(
                        null,
                        "Bad news, YOU LOSE ! ",
                        "RESULT ",
                        JOptionPane.ERROR_MESSAGE,
                        null

                );
                break;
            }
            if (userScore == 5) {

                JOptionPane.showMessageDialog(
                        null,
                        "Congrats, YOU WIN ! ",
                        "RESULT ",
                        JOptionPane.WARNING_MESSAGE,
                        null
                );
                break;
            }
        }
    }
}