package Decorator;

public class HDStreamingDecorator extends SubscriptionDecorator {
    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vizionare HD";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.0;
    }
}
