package deenn.com;

public class Hr extends Person implements PerfomanceAndRecord{
    public Hr(String name, int id, String email, String rank) {
        super(name, id, email, rank);
    }
    public static void recomendHire() {
        System.out.println("recomended for hire");
    }

    @Override
    public void CalculateDailyRecord() {

    }

    @Override
    public void CalculatePerfomanceIndex() {

    }
}
