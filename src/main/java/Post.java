import java.util.ArrayList;
import java.util.List;

public class Post {

  private final List<Subscriber> subscribers = new ArrayList<>();

  void subscribe(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  void unsubscribe(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  void sendNewspaper() {

    subscribers.forEach(s -> s.receive(Mail.NEWSPAPER));

  }

  void sendMagazine() {

    subscribers.forEach(s -> s.receive(Mail.MAGAZINE));

  }

}

enum Mail {

  NEWSPAPER,
  MAGAZINE

}
