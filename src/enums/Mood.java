package enums;

public enum Mood {
    NULL(""),
    //CALM("calm"),
    TIRED("tired"),
    TORTURED("tortured"),
    HAPPY("happy"),
    SAD("sad");// добавить бодрого и слипи
    private final String mood;

    Mood(String mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return this.mood;
    }


}

