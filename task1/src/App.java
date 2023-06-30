public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(summN(5));
        System.out.println(factN(5));
    }

    public static int summN(int N){
        int res = 0;
        for(int i=1; i<=N; i++)
            res+=i;
        return res;
    }

    public static int factN(int N){
        int res = 1;
        for(int i=1; i<=N; i++)
            res*=i;
        return res;
    }
}

