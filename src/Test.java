public class Test {
    public static void main(String[] args) {
        new Ccc(false);
    }

}
class Aaa{
    public Aaa() {
        System.out.println("Konstruktor Aaa");
    }
    public Aaa(boolean isSilent) {
        if(!isSilent){
            System.out.println("Konstruktor Aaa(boolean is silent)" );
    }

    }
}
class Bbb extends Aaa {
    public Bbb() {
        System.out.println("Konstruktor Bbb");
    }

    public Bbb(boolean isSilent) {
        super(isSilent);
        if (!isSilent) {
            System.out.println("Konstruktor Bbb(boolean is silent)");

        }
    }
}

    class Ccc extends Bbb {
        public Ccc() {
            System.out.println("Konstruktor Ccc");
        }

        public Ccc(boolean isSilent) {
            super(isSilent);
            if (!isSilent) {
                System.out.println("Konstruktor Ccc(boolean is silent)");

            }
        }
    }


