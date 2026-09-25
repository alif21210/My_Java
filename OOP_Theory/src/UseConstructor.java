public class UseConstructor {
    static void main() {
        Constructor teacher1  = new Constructor("Alif","male",1231231);
        teacher1.displayinfo();

        Constructor teacher2  = new Constructor("Amit","male",242341);
        teacher2.displayinfo();

        Constructor teacher3  = new Constructor();
        teacher3.displayinfo();
    }
}
