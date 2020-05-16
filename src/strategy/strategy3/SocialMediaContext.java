package strategy.strategy3;

public class SocialMediaContext {
    private static SocialMediaContext context = null;
    private ISocialMediaStrategy strategy;

    public static SocialMediaContext getInstance(){
        if(context == null){
            context  = new SocialMediaContext();
        }
        return context;
    }

    private SocialMediaContext(){

    }


    public void connect(String name){
        strategy.connectTo(name);
    }


    public void setSocialMediaStrategy(ISocialMediaStrategy strategy){
        this.strategy = strategy;
    }

}
