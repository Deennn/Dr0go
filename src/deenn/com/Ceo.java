package deenn.com;

import java.util.ArrayList;

public class Ceo extends Person implements HireAndFire{
    private final Drogo drogo = new Drogo();
    public Ceo(String name, int id, String email, String rank) {
        super(name, id, email, rank);
    }


    @Override
    public void fire() {
        System.out.println("You're fired");
    }

    @Override
    public void hire() {
        FinanceGuy newGuy = new FinanceGuy("Dane", 1, "dane@gmail.com", "finance1");
        ArrayList<FinanceGuy> financeGuyList = drogo.getPerson();
        if (financeGuyList == null) {
            financeGuyList = new ArrayList<>();
            financeGuyList.add(newGuy);
            drogo.setPerson(financeGuyList);
        }
        System.out.println("You're hired");

    }
}
