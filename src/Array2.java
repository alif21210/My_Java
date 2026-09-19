public class Array2 {
    static void main() {

        String[] name = new String[4];
        //String[] name = {"mehedi","hasan","alif","messi"}; eivabe initialize kora jay
        name[0] = "Mehedi";
        name[1] = "Hasan";
        name[2] = "Alif";
        name[3] = "Messi";

        for(int i=0; i<4; i++)
        {
            System.out.println(name[i]);
        }

        // eivabeo print kora jay
        for(String x : name)
        {
            System.out.println(x);
        }

    }
}
