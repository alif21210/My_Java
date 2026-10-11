public class WrapperDemo {
    static void main() {

        //primitive -> object
        int x = 30;
        Integer y = Integer.valueOf(x);
        // Integer y = x; uporer line ar ei line same kaj kore
        System.out.println("y :"+y);

        Integer z = x;
        System.out.println("z :"+z);



        //object -> primitive
        Double d = new Double(10.2);
        System.out.println("d :"+d);

        double e = d.doubleValue();
        // double e = d; uporer line ar ei line same kaj kore
        System.out.println("e :"+e);


        // primitive -> String
        int ii = 100; // for double: double ii = 10.0;
        String ss = Integer.toString(ii); // for double: String ss = Double.toString(ii);
        System.out.println("ss :"+ss);

        boolean bb = true;
        String bs = Boolean.toString(bb);
        System.out.println("bs :"+bs);

        // String -> primitive
        String rr = "90";
        int rs = Integer.parseInt(rr);
        // int rs = Integer.valueOf(rr); uporer line ar ei line same kaj kore
        System.out.println("rs :"+rs);
    }
}
