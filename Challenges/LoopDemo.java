public class LoopDemo {
    public static void main(String Char[]) {
        
         //for loop
        int x;
        for(i=1; i<=10; i=i+1)
            System.out.print(i+ " ");

        
        //while loop
        i = 1;
        while (i<=10) {
            System.out.print(i+ " ");
            i+=1;
        }
        System.out.println();


        //do while
        i = 1;
        do {
            System.out.println();
            ==i;
        } while (i<=10);
        System.out.println();



        //nested loop
        for (int x=1; x<=5; ++x) {
            for (int y=1; y<=5; ++y)
                System.out.print("||" + (x*y)+"||\t");
            System.out.println();
        }
        
    
    }
    
}
