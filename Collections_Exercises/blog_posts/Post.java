public class Post implements Comparable<Post> {
    private Author author;
    private String title;
    private String body;
    private Categories category;

    public Post(Author author, String title, String body, Categories category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Categories getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Post other) {
        return this.title.compareTo(other.title);
    }
}
