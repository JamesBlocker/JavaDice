public class Game {
  Player player1 = new Player();
  Dice die1 = new Dice();

  // while(gameRunning){
  //     playTurn(player1);
  //     playTurn(player2);
  // }

  public void playTurn(){
    int result1 = die1.roll();
    player1.score += result1;
    System.out.println(player1.score);
  }



}