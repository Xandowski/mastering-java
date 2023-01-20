import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Ordem de inserção
        Set<FavoriteLanguage> favoriteLanguages = new LinkedHashSet<>() {
            {
                add(new FavoriteLanguage("Java", "1995", "Eclipse"));
                add(new FavoriteLanguage("Javascript", "1995", "VSCode"));
                add(new FavoriteLanguage("Python", "1989", "Pycharm"));
            }
        };
        Iterator<FavoriteLanguage> iterator = favoriteLanguages.iterator();

        System.out.println("-----Ordem inserção-----");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Ordem natural(nome)
        Set<FavoriteLanguage> favoriteLanguages2 = new TreeSet<>();
        favoriteLanguages2.add(new FavoriteLanguage("Python", "1989", "Pycharm"));
        favoriteLanguages2.add(new FavoriteLanguage("C", "1970", "codeBlocks"));
        favoriteLanguages2.add(new FavoriteLanguage("Javascript", "1995", "VSCode"));
        favoriteLanguages2.add(new FavoriteLanguage("Javascript", "1995", "VSCode"));
        Iterator<FavoriteLanguage> iterator2 = favoriteLanguages2.iterator();

        System.out.println("-----Ordem Natural(nome)-----");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
