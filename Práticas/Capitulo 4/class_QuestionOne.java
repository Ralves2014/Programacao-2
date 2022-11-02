class QuestionOne {
    public final int A = 345;
    public int b;
    private float c;

    private void methodOne( int a) {
        b = a;
    }
    public float methodTwo( ) {
        return 23;
    }

    public boolean testC(){
        return (c>0.0 && c >= 10000);
    }

    public void setC(float c){      //temos dois c, o this e a instancia 
        if (c<0.0 || c>=10000)return;       //se for negativo ou maior que 10000 nao devolve nada
        this.c = c;
    }
}



