package school.mjc.stage0.module3.task4;

public class IntRepresentation {
    public static void main(String[] args) {
        char[] chars = {'c', 'h', 'a', 'r'};

        for (char ch: chars){
            int intValue = (int) ch;
            System.out.println("Character: " + ch + ", Integer representation: " + intValue);

        }
    }
}
