public class ObserverExample {

  public static void main(String[] args) {
    Post post = new Post();
    Subscriber subscriber1 = new Subscriber1();
    Subscriber subscriber2 = new Subscriber2();
    post.subscribe(subscriber1);
    post.subscribe(subscriber2);

    post.sendMagazine();

  }

}






