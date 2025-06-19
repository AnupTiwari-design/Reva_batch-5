package Java.Constructor;
class ex{
    int a;
    int b;
    ex(int a,int b){

        this.a=a;
        this.b=b;

    }

    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    public static void main(String[] args) {
        ex ob =new ex(5,7);
        System.out.println(ob.add());
        

}
}