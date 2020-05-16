package strategy.strategy3;

public class InstagramStrategy implements ISocialMediaStrategy {


    @Override
    public void connectTo(String friendName) {
        System.out.println("Connectiong with " + friendName + " through instagram");
    }
}
