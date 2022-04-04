public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.airCondition = new AirCondition();
        this.tv = new TV();
    }
    public  void say(String message) {
        if(message.contains("打开")) {
            on();
        }
        if(message.contains("关闭")) {
            off();
        }

    }
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }
    private void off() {
        light.off();
        tv.off();
        airCondition.off();

    }
}
