class Q1Main {
    public static void main(String[] args) {
    QuestionOne q1;
    q1 = new QuestionOne( );
    q1.A = 12;
    q1.b = 12;
    q1.setC(12);
    q1.methodOne(12);
    q1.methodOne( );
    System.out.println(q1.methodTwo(12));
    q1.setC(q1.methodTwo( ));
    }
}