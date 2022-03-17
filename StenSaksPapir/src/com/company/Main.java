package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GameController gameController = new RockPaperScissorsGameController();

        Scanner scanner = new Scanner(System.in);
        String userWantsToExit;

        System.out.print(gameController.welcomeMessage());

        do {
            System.out.println(gameController.pleaseEnterOptionMessage());

            int userOptionRaw = scanner.nextInt();

            GameOption userOption = GameOption.valueOf(userOptionRaw);

            gameController.selectUserChoice(userOption);

            GameOption machineChoice = gameController.randomMachineChoice();

            Player winner = gameController.calculateResult();

            Score score = gameController.getResult();

            System.out.printf("You played: %s and the machine played: %s \n", userOption.name(), machineChoice.name());
            if (Player.USER.equals(winner)) {
                System.out.println("You won!!");
            }
            if(Player.TIE.equals(winner)){
                System.out.println("Tie!!");
            }
            System.out.printf("You won %d games out of %d \n", score.getGamesWonByUser(), score.totalNumberGames());

            System.out.println("Continue playing(Y=Yes, N=No)?");
            userWantsToExit = scanner.next();

        }while(userWantsToExit.toUpperCase().equals("Y"));
    }
}
