package one.week.prep.day.three;

public class TowerBreakers {
//    n - number of towers
//    m - height of each tower

    public static int towerBreakers(int n, int m) {
       if(n % 2 == 0 || m == 1) {
           return 2;
       } else
           return 1;
    }
}
