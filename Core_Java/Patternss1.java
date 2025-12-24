class Patternss1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <=2*n-1; j++) {
                if ((i+j>=3*n-1)||(j-i>=n-1)||(i+j)<=n+1||(i-j)>=n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


