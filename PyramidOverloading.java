public class PyramidOverloading {
    public void pyramid(int levels){
        for(int i = 0; i < levels; i++){
            for(int space = 0; space < levels-i-1; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    public void pyramid(int levels, char prefix){
        for(int i =0; i < levels; i++){
            for(int space = 0; space < levels - i - 1; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(prefix+String.valueOf(i)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("this the number pyramid");
        PyramidOverloading p = new PyramidOverloading();
        p.pyramid(4);

        System.out.println("pyramid of the char with no");
        p.pyramid(4, 'j');
    }
}
