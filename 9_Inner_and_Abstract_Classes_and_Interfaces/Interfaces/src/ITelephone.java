public interface ITelephone {
    public void powerOn(); // Doesn't need a public access modifier because it is an Interface and all methods need to be implemented
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
