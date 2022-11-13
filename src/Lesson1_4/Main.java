package Lesson1_4;

public class Main {

    public static void main(String[] args) {

        String[] computerNames = {"Intel Core I3", "AMD Ryzen 5", "Intel Xeon", "Intel Core I7", "AMD Ryzen 7"};
        Computer[] comps = new Computer[5];

        for (int i = 0; i < comps.length; i++){
            comps[i] = new Computer(computerNames[i]);
        }

        for (Computer comp: comps){
            comp.showComputer();
        }

    }
}
