class Subscriber2 implements Subscriber {
  @Override
  public void receive(Mail mail) {
    System.out.println(String.format("Subscriber2 received %s", mail));
  }
}
