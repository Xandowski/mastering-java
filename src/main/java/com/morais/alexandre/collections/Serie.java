import java.util.Comparator;

public class Serie implements Comparable<Serie> {
  private String title;
  private String genre;
  private Integer episodeTime;

  public Serie(String title, String genre, Integer episodeTime) {
    this.title = title;
    this.genre = genre;
    this.episodeTime = episodeTime;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Integer getEpisodeTime() {
    return episodeTime;
  }

  public void setEpisodeTime(Integer episodeTime) {
    this.episodeTime = episodeTime;
  }

  @Override
  public String toString() {
    return "{" +
        "title='" + title + '\'' +
        ", genre='" + genre + '\'' +
        ", episodeTime=" + episodeTime +
        "}";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    result = prime * result + ((genre == null) ? 0 : genre.hashCode());
    result = prime * result + ((episodeTime == null) ? 0 : episodeTime.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Serie other = (Serie) obj;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    if (genre == null) {
      if (other.genre != null)
        return false;
    } else if (!genre.equals(other.genre))
      return false;
    if (episodeTime == null) {
      if (other.episodeTime != null)
        return false;
    } else if (!episodeTime.equals(other.episodeTime))
      return false;
    return title.equals(other.title) && genre.equals(other.genre) && episodeTime.equals(other.episodeTime);
  }

  @Override
  public int compareTo(Serie serie) {
    int episodeTime = Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());

    if (episodeTime != 0)
      return episodeTime;

    int genre = this.getGenre().compareTo(serie.getGenre());

    if (genre != 0)
      return genre;

    return this.getTitle().compareTo(serie.getTitle());
  }

}

class ComparatorTitleGenreEpisodeTime implements Comparator<Serie> {

  @Override
  public int compare(Serie s1, Serie s2) {
    int title = s1.getTitle().compareTo(s2.getTitle());
    if (title != 0)
      return title;

    int genre = s1.getGenre().compareTo(s2.getGenre());

    if (genre != 0)
      return genre;

    return Integer.compare(s1.getEpisodeTime(), s2.getEpisodeTime());
  }

}