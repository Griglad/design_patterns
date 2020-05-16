package strategy.strategy3;
public class App {

    public static void main(String... args) {
        String name = "Grigoris";
        SocialMediaContext context = SocialMediaContext.getInstance();


        context.setSocialMediaStrategy(new FacebookStrategy());

        context.connect(name);


        context.setSocialMediaStrategy(new TwitterStrategy());
        context.connect(name);

        context.setSocialMediaStrategy(new InstagramStrategy());
        context.connect(name);

        context.setSocialMediaStrategy((Lambda)-> System.out.println("Connecting in " + Lambda + " world"));
        context.connect("Lambda");

    }


}
