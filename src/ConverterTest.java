public class ConverterTest {
    public static void main(String[] args) {
        for(int i=1; i<8; i++){
            System.out.printf("%d dzień tygodnia to %s%n", i, CalandarConverter.convertDayToString(i));
        }
    }
}
