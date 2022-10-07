public interface ITelephone {
    public void powerOn(); // Hoeft geen access modifier (public) te hebben want een interface moet altijd geimplementeerd worden
    void dial(int phoneNumber); // Hier access modifier weggelaten
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
