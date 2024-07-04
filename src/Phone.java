public class Phone {
    private final String brand;
    private final String name;
    private final String str;

    public Phone(String brand, String name, String str) {
        this.brand = brand;
        this.name = name;
        this.str = str;
    }

    void buyPhone() {
        System.out.println(this.name + "님이 " + this.name + "폰을 구매했습니다");
    }

    void turnOn() {
        System.out.println(this.name + "님이 " + this.brand + "폰을 켰습니다.");
        System.out.println(this.str + " 폰 켜지는 중 " + this.str);
    }
}
