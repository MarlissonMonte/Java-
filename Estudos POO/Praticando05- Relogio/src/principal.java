public class principal {
    public static void main(String[] args) {
        RelogioDigital r1 = new RelogioDigital();
        r1.setTempo(19,20);
        String telaString = r1.getTempo();
        System.out.println(telaString);
    }
}

