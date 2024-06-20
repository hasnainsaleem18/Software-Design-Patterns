

public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("news");
		post.abc()
		System.out.println(post);

	}

}
