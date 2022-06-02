package enumexample;

public enum LevelEnum {
    LEVEL_1(10, 10, 10, 100),
    LEVEL_2(10, 15, 15, 150),
    LEVEL_3(10, 10, 20, 200),
    LEVEL_4(15, 10, 30, 300),
    LEVEL_5(15, 10, 40, 500);

    private int width;
    private int length;
    private int cpuDifficulty;
    private int maxScore;

    LevelEnum(int width, int length, int cpuDifficulty, int maxScore) {
        this.width = width;
        this.length = length;
        this.cpuDifficulty = cpuDifficulty;
        this.maxScore = maxScore;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getCpuDifficulty() {
        return cpuDifficulty;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
