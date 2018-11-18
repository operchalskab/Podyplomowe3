public class Klasy {
        public static void main(String[] args) {
            new Bb();
        }
    }

    class Aa {
        Aa() {
            System.out.println("Działą konstruktor klasy Aa");
        }
        Aa(boolean arg){
            System.out.println("Działą konstruktor (z argumentem) " +arg + " klasy Aa");
        }
    }
    class Bb extends Aa {
        public Bb() {
            System.out.println("Działą bezargumentowy konstruktor klasy Bb");
        }

        Bb(boolean argg){
            super(true);
            System.out.println("Działą konstruktor klasy Bb");
        }
    }
    class Cc extends Bb {
        Cc(){
            super(false);
            System.out.println("Działą konstruktor klasy Cc");
    }
}

