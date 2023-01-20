import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOrdenateExample {
  public static void main(String[] args) {
    Set<Serie> mySeries = new HashSet<>() {
      {
        add(new Serie("BreakingBad", "Drama", 45));
        add(new Serie("Mr.robot", "Drama", 45));
        add(new Serie("Himym", "Comedy", 25));
      }
    };

    for (Serie serie : mySeries)
      System.out.println("Titulo: " + serie.getTitle()
          + " - Genero: " + serie.getGenre() + " - Tempo episodio: " + serie.getEpisodeTime());

    Set<Serie> mySeriesLinked = new LinkedHashSet<>() {
      {
        add(new Serie("BreakingBad", "Drama", 45));
        add(new Serie("Mr.robot", "Drama", 45));
        add(new Serie("Himym", "Comedy", 25));
      }
    };

    for (Serie serie : mySeriesLinked)
      System.out.println("Titulo: " + serie.getTitle()
          + " - Genero: " + serie.getGenre() + " - Tempo episodio: " + serie.getEpisodeTime());

    Set<Serie> mySeriesTree = new TreeSet<>(mySeriesLinked);

    System.out.println(mySeriesTree);

    Set<Serie> mySeriesTree2 = new TreeSet<>(new ComparatorTitleGenreEpisodeTime());
    mySeriesTree2.addAll(mySeriesTree);

    System.out.println("Ordenando por nome, genero, tempo episodio: ");
    System.out.println(mySeriesTree2);
  }
}
