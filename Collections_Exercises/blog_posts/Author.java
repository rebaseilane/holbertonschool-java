public class Author implements Comparable<Author> {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public int compareTo(Author other) {
        return this.toString().compareTo(other.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author a = (Author) obj;
        return name.equals(a.name) && surname.equals(a.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }
}
