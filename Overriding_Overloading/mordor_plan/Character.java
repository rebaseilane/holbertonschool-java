import food.*;
import mood.*;

public class Character {
    private int happinessPoints;

    public Character() {
        this.happinessPoints = 0;
    }

    public int getHappinessPoints() {
        return happinessPoints;
    }

    public void eat(Food[] foods) {
        for (Food food : foods) {
            happinessPoints += food.getHappinessPoints();
        }
    }

    public Mood getCurrentMood() {
        if (happinessPoints < -5) {
            return new Angry();
        } else if (happinessPoints <= 0) {
            return new Sad();
        } else if (happinessPoints <= 15) {
            return new Happy();
        } else {
            return new VeryHappy();
        }
    }

    @Override
    public String toString() {
        Mood mood = getCurrentMood();
        String moodName = mood.getClass().getSimpleName();

if (moodName.equals("VeryHappy")) {
    moodName = "Very Happy";
}

return happinessPoints + " - " + moodName;
    }
}
