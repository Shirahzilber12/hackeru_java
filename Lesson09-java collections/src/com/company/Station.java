package com.company;

/**
 * Created by hackeru on 2/26/2017.
 */
public class Station {
    int charge;
    int distanceToNext;

    public Station(int charge, int distanceToNext) {
        this.charge = charge;
        this.distanceToNext = distanceToNext;
    }

    public static int findStation(Station[] stations) {
        boolean vaildPath;
        for (int i = 0; i < stations.length; i++) {
            int sum = 0;
            int j = i;
            vaildPath=true;
            do {
                sum += stations[j].charge;
                sum -= stations[j].distanceToNext;
                if (sum < 0) {
                    vaildPath=false;
                    break;
                }
                j++;
                if (j == stations.length)
                    j = 0;
            } while (j != i);
            if (vaildPath)
            return i;
        }
        return -1;
    }
}
