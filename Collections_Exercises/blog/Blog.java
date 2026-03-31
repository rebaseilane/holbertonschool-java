import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Set<String> getAllAuthors() {
        Set<String> authors = new TreeSet<>();

        for (Post post : posts) {
            authors.add(post.getAuthor());
        }

        return authors;
    }

    public Map<String, Integer> getCountByCategory() {
        Map<String, Integer> map = new TreeMap<>();

        for (Post post : posts) {
            String category = post.getCategory();
            map.put(category, map.getOrDefault(category, 0) + 1);
        }

        return map;
    }
}
