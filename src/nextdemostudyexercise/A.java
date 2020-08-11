package nextdemostudyexercise;

class A {
    int i;
}

class B extends A{
    int i;

    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("variable i with class base " + super.i );
        System.out.println("variable i with class derivative " + i);
    }

}

class UseSuper{
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
