public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone("잡스");
        Galaxy galaxy = new Galaxy("재용");
        Galaxy galaxy24 = new Galaxy();
        Person jaeyoug = new Person();
        jaeyoug.buyPhone(galaxy24);

        iphone.buyPhone();
        iphone.turnOn();

        galaxy.buyPhone();
        galaxy.turnOn();


    }
}
