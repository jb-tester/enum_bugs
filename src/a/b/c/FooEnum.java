package a.b.c;

/**
 * Created by irina on 6/10/2015.
 */
public enum FooEnum {
    FOO1(0){
        // some body
    },
    FOO2(1),
    FOO3(2);
    int arg;

    FooEnum(int arg) {
        this.arg = arg;
    }
}
