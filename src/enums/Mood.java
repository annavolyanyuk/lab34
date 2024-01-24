package enums;

public enum Mood {
    NULL(""),
    TIRED("tired"),
    TORTURED("tortured"),
    HAPPY("happy"),
    SAD("sad");
    private String mood;

    Mood(String mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return this.mood;
    }


}

