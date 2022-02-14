package afisare;
public class print {
    public static void Printnl(Object obj){
        System.out.println(obj);
    }  
    public static void Print(Object obj){
        System.out.print(obj);
    }
    public static int[] range(int range){
        int[] ret = new int[range];
        for(int i= 0;i<range;i++)
        ret[i]=i;
        return ret;
    }
    public static int[] range(int range1, int range2){
        if(range1>range2){
            range1 ^= range2;
            range2 ^= range1;
            range1 ^= range2;
        }
        int aux  = range1;
        int[] ret = new int[range2-range1];
        for(int i = 0;i < (range2-range1); i++){
        ret[i] = aux++;
        }
        return ret;
    }
    public static int[] range(int range1, int range2, int step){
        if(range1>range2){
            range1 ^= range2;
            range2 ^= range1;
            range1 ^= range2;
        }
        int aux = range1;
        int[] ret = new int[(range2-range1)/step];
        for(int i= 0;i < (range2-range1)/step; i++){
        ret[i] = aux;
        aux+=step;
        }
        return ret;
    }
}
