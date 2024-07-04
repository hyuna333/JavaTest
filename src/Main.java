public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone("잡스");
        Galaxy galaxy = new Galaxy("재용");

        iphone.buyPhone();
        iphone.turnOn();

        galaxy.buyPhone();
        galaxy.turnOn();
    }
}
