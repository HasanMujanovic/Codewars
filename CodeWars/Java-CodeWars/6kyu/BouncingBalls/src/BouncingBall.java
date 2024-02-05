public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        double currentHeight = h;
        int sum = 0;

        if (h > 0 && (bounce > 0 && bounce < 1) && window < h){
            while (currentHeight > window){
                currentHeight *= bounce;
                if (currentHeight > window) sum++;
                sum++;
            }
            return sum;
        } else return -1;


    }
}