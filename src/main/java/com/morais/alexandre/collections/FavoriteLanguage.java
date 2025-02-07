package com.morais.alexandre.collections;

public class FavoriteLanguage implements Comparable<FavoriteLanguage> {
  private String name;
  private String createdAt;
  private String ide;

  public FavoriteLanguage(String name, String createdAt, String ide) {
    this.name = name;
    this.createdAt = createdAt;
    this.ide = ide;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getIde() {
    return ide;
  }

  public void setIde(String ide) {
    this.ide = ide;
  }

  @Override
  public String toString() {
    return "[name=" + name + ", createdAt=" + createdAt + ", ide=" + ide + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
    FavoriteLanguage other = (FavoriteLanguage) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (createdAt == null) {
      if (other.createdAt != null)
        return false;
    } else if (!createdAt.equals(other.createdAt))
      return false;
    if (ide == null) {
      if (other.ide != null)
        return false;
    } else if (!ide.equals(other.ide))
      return false;
    return true;
  }

  @Override
  public int compareTo(FavoriteLanguage favoriteLanguage) {
    int nome = this.getName().compareTo(favoriteLanguage.getName());
    if (nome != 0) {
      return nome;
    }
    int ide = this.getIde().compareTo(favoriteLanguage.getIde());
    if (ide != 0) {
      return ide;
    }

    return this.getCreatedAt().compareTo(favoriteLanguage.getCreatedAt());
  }

}
