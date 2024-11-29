public class Menu {
    public static void main(String[] args) {
        ContaBancaria app = new ContaBancaria();

        app.setNumeroConta(123456);
        app.setSaldo(523.25);
        app.titular = "Gustreta";

        System.out.println(app.getNumeroConta());
        System.out.println(app.getSaldo());
        System.out.println(app.titular);
    }
}
