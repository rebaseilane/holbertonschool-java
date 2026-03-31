import java.util.*;

public class Program {
    public static void main(String[] args) {
        Blog blog1 = new Blog();

        Author author1 = new Author("John", "Bannons");
        Author author2 = new Author("Jane", "Doe");
        Author author3 = new Author("Peter", "Dirkly");

        try {
            blog1.addPost(new Post(author1, "How to Implement Terraform", "", Categories.DEVOPS));
            blog1.addPost(new Post(author1, "Working with the Set Interface in Java", "", Categories.DEVELOPMENT));
            blog1.addPost(new Post(author2, "Publishing GitLab Pipelines", "", Categories.DEVOPS));
            blog1.addPost(new Post(author2, "Azure Service Bus Where to Start", "", Categories.DEVOPS));
            blog1.addPost(new Post(author2, "TDD Made Simple", "", Categories.DEVELOPMENT));
            blog1.addPost(new Post(author3, "Hadoop: The Tool That Will Ease Your Data Processing", "", Categories.DATA_SCIENCE));

            blog1.addPost(new Post(author3, "Hadoop: The Tool That Will Ease Your Data Processing", "", Categories.DATA_SCIENCE));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(blog1.getAllAuthors());
        System.out.println(blog1.getCountByCategory());
        System.out.println(blog1.getPostsByCategory(Categories.DEVOPS));
        System.out.println(blog1.getPostsByCategory(Categories.DEVELOPMENT));
        System.out.println(blog1.getPostsByCategory(Categories.DATA_SCIENCE));
        System.out.println(blog1.getPostsByAuthor(new Author("Jane", "Doe")));
        System.out.println(blog1.getAllPostsByCategories());
        System.out.println(blog1.getAllPostsByAuthor());
    }
}
