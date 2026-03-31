import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void addPost(Post post) throws Exception {
        for (Post p : posts) {
            if (p.getAuthor().equals(post.getAuthor()) &&
                p.getTitle().equals(post.getTitle())) {
                throw new Exception("Post already exists");
            }
        }
        posts.add(post);
    }

    public Set<Author> getAllAuthors() {
        Set<Author> authors = new TreeSet<>();
        for (Post post : posts) {
            authors.add(post.getAuthor());
        }
        return authors;
    }

    public Map<Categories, Integer> getCountByCategory() {
        Map<Categories, Integer> map = new HashMap<>();

        for (Post post : posts) {
            Categories cat = post.getCategory();
            map.put(cat, map.getOrDefault(cat, 0) + 1);
        }

        return map;
    }

    public Set<Post> getPostsByAuthor(Author author) {
        Set<Post> result = new TreeSet<>();

        for (Post post : posts) {
            if (post.getAuthor().equals(author)) {
                result.add(post);
            }
        }

        return result;
    }

    public Set<Post> getPostsByCategory(Categories category) {
        Set<Post> result = new TreeSet<>();

        for (Post post : posts) {
            if (post.getCategory() == category) {
                result.add(post);
            }
        }

        return result;
    }

    public Map<Categories, Set<Post>> getAllPostsByCategories() {
        Map<Categories, Set<Post>> map = new HashMap<>();

        for (Post post : posts) {
            map.putIfAbsent(post.getCategory(), new TreeSet<>());
            map.get(post.getCategory()).add(post);
        }

        return map;
    }

    public Map<Author, Set<Post>> getAllPostsByAuthor() {
        Map<Author, Set<Post>> map = new HashMap<>();

        for (Post post : posts) {
            map.putIfAbsent(post.getAuthor(), new TreeSet<>());
            map.get(post.getAuthor()).add(post);
        }

        return map;
    }
}
