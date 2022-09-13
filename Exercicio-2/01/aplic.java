public class aplic {

    public static void main(String[] args) {
        int col;
        int[] tabNum; //ponteiro para matriz
        tabNum = new int[5]; //alocação da matriz na memória
        
        tabNum[0] = 18;
        tabNum[1] = 42;
        tabNum[2] = 28;
        tabNum[3] = 37;
        tabNum[4] = 25;
        
        for(col=0; col<5; col++){
            System.out.println("tabNum[" + col + "] = " + tabNum[col]);
        }
        System.out.println("");
    }
    
}
