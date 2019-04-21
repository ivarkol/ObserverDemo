class Subscriber1 implements Subscriber {
  @Override
  public void receive(Mail mail) {
    System.out.println(String.format("Subscriber1 received %s", mail));
  }
}
