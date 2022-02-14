import static afisare.print.*;
public class HelloWorld {

    public static void main(String[] args) {
        Printnl("Salut");
        double d = 12.57;
        int i = (int)d % 10000;
        Printnl(i);
        int big = Integer.MAX_VALUE;
        Printnl("big = " + big);
        int bigger = big * 4;
        Printnl("bigger = " + bigger);
        Printnl("///////////////////////");
        for(char c : "An African Swallow".toCharArray() ){
            Print(c + " "); 
        }
        Printnl("");
        for(int a : range(10)) // 0..9
            Print(a + " ");
        Printnl("");
        for(int b : range(5, 10)) // 5..9
            Print(b + " ");
        Printnl("");
        for(int c : range(5, 20, 3)) // 5..20 step 3
            Print(c + " ");
        Printnl("");
        Printnl("//////////Switch/////////////");
        for(int t = 0; t < 10; t++){
            switch(t){
                case 1: Printnl("Case 1");
                        break;
                        case 2: Printnl("Case 2");
                        break;
                        case 3: Printnl("Case 3");
                        break;
                        case 4: Printnl("Case 4");
                        break;
                        case 5: Printnl("Case 5");
                        break;
                        case 6: Printnl("Case 6");
                        break;
                        case 7: Printnl("Case 7");
                        break;
                        case 8: Printnl("Case 8");
                        break;
                        case 9: Printnl("Case 9");
                        break;
                    
            }
        }
        Printnl("/////////////////Constructors////////////////");
        int var = 2;
        int[] vct = new int[var];
        Integer[] inte = new Integer[]{2,3};
        Other.f('a', 'b', (char)127);  
    }
}

class Other {
    public static void f(char...arg){
        for(char s:arg){
            Print(s + " ");
        }
    } 
} 