import java.util.List;
import java.util.ArrayList;

public class Database {
    List<Menu> ListMenu = new ArrayList<>();

    public void data(Menu menu) {
        ListMenu.add(menu);
    }

    public void showMenu() {
        System.out.println("Menu");
        System.out.println("==============================");
        for (int i = 0; i < ListMenu.size(); i++) {
            System.out.println((i + 1) + ". " + ListMenu.get(i).Name + " (" + ListMenu.get(i).Category + ") Rp. "
                    + ListMenu.get(i).Price + "\n");
        }
    }
}
