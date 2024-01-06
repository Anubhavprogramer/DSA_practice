public class henoitower {
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
    
            towerOfHanoi(n - 1, source, destination, auxiliary);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            towerOfHanoi(n - 1, auxiliary, source, destination);
        }
    
    public static void main(String[] args) {
        int numberOfDisks = 3;
        char sourceTower = 'A';
        char auxiliaryTower = 'B';
        char destinationTower = 'C';

        towerOfHanoi(numberOfDisks, sourceTower, auxiliaryTower, destinationTower);
    }
}
    

