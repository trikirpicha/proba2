public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
