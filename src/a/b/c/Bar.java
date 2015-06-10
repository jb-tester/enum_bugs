package a.b.c;

/**
 * Created by irina on 6/10/2015.
 */
public enum Bar  {
    B1(1){

        public int getAaa() {
            return aaa;
        }
    },
    B2(2){

        public int getAaa() {
            return aaa;
        }
    },
    B3(3){

        public int getAaa() {
            return aaa;
        }
    };

    Bar(int aaa) {
        this.setAaa(aaa);
    }

    int aaa;


    public static Bar getB1() {
        return B1;
    }

    public static Bar getB2() {
        return B2;
    }

    public static Bar getB3() {
        return B3;
    }

    public abstract int getAaa() ;

    public void setAaa(int aaa) {
        this.aaa = aaa;
    }
}
