package Unit_4;

public class Review {
    public static class AClass{
        public void methodX(){
            System.out.print("Super X ");
            methodY();
        }

        public void methodY(){
            System.out.print("Super Y ");
            methodZ();
        }

        public void methodZ(){
            System.out.print("Super Z");
        }
    }

    public static class BClass extends AClass{
        public void methodX(){
            super.methodX();
        }
        public void methodY(){
            System.out.print("Sub Y ");
            methodZ();
        }

    }

    public static void main(String[] arg){
        AClass thing = new BClass();
        thing.methodX();

    }
}
