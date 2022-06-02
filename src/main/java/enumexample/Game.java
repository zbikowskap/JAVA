package enumexample;

public class Game {

    public void startGame(LevelEnum levelEnum) {
        generateGameBoard(levelEnum.getWidth(), levelEnum.getLength());
        generateCpuPlayer(levelEnum.getCpuDifficulty());
        setMaxScore(levelEnum.getMaxScore());
        play();
    }

    private void generateGameBoard(int width, int length) {
        System.out.println("Generating game board " + width + " x " + length);
    }

    private void generateCpuPlayer(int difficulty) {
        System.out.println("Generating cpu with difficulty " + difficulty);
    }

    private void setMaxScore(int maxScore) {
        System.out.println("Setting max score... " + maxScore);
    }

    private void play() {
        System.out.println("Playing....");
    }

}
