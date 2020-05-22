
public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;
    public SocialMediaFacade(){
        this.twitter = new Twitter();
        this.facebook = new Facebook();
        this.linkedIn = new LinkedIn();

    }
    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();

    }
}
