package com.company;

public interface GameController {
    String welcomeMessage();

    String pleaseEnterOptionMessage();

    void selectUserChoice(GameOption userOption); //Tutor ændrede GameController til GameOption

    GameOption randomMachineChoice();

    Player calculateResult();

    Score getResult();
}
