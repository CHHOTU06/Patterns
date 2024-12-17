public class Main{
    public static void hallow_rectangle(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||j==1||i==rows||j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    // INVERTED & ROTATED HALF-PYRAMID
    public static void invStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invStar(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==rows||j==cols||((i==3) && (j==2 || j==3))||((i==2) && (j==3)) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //inverted number pyramid
    public static void invNumPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // FLOYD'S Triangle
     public static void floyTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
     }
     //0-1 Triangle
    public static void binaryTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
    //ButterFly Pattern
    public static void butterFly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();}
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();}
    }
    //SOLID RHOMBUS
    public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i);
            //for(int j=1;j<=n;j++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(".");
                }
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==n||j==1)
                        System.out.print("*");
                    else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
        public static void DIAMOND(int n){
        for(int i=1;i<=n/2;i++) {
//            System.out.print(i+".");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i-1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
            for(int i=n/2;i>=1;i--) {
//                System.out.print(i+".");
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
    }
    }
    public static void numDiamond(int n){
        for(int i=1;i<=n;i++) {
//            System.out.print(i+".");
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    //Number Pyramid
    public static void numTriangle(int n){
        for(int i=1;i<=n;i++){
            int j;
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                int k=0;
                if(i>j){
                    System.out.print(i-j+1);
                }
                else{
                    for(j=1;j<=i;j++){
                        System.out.print(j);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void numTriangle2(int n){
        for(int i=1;i<=n;i++){
            int j;
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            for(j=2;j<=i;j++){
                        System.out.print(j);
                    }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //invStar(10);
        //invNumPyramid(10);
        //floyTriangle(11);
        //binaryTriangle(10);
        //butterFly(10);
        //solidRhombus(10);
        //DIAMOND(12);
        //numDiamond(5);
        numTriangle(9);
        numTriangle2(9);
    }
}