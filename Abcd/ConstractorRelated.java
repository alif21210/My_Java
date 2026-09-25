package Abcd;

public class ConstractorRelated {
    static void main() {
        ConstractorOverloading teacher1 = new ConstractorOverloading();

        ConstractorOverloading teacher2 = new ConstractorOverloading("alif","male");
        teacher2.displayinfo();

        ConstractorOverloading teacher3 = new ConstractorOverloading("amit","female",231212);
        teacher3.displayinfo();
    }
}
