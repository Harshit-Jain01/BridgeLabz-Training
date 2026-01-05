package com.stackandqueue.circulartour;

import java.util.LinkedList;
import java.util.Queue;

class CircularTour {

    public static int findStart(PetrolPump[] pumps) {
        Queue<Integer> queue = new LinkedList<>();
        int currentPetrol = 0;
        int n = pumps.length;
        int i = 0;

        while (queue.size() < n) {
            int index = i % n;
            int surplus = pumps[index].petrol - pumps[index].distance;

            queue.add(index);
            currentPetrol += surplus;

           
            while (currentPetrol < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                currentPetrol -= (pumps[removed].petrol - pumps[removed].distance);
            }

            i++;

         
            if (i >= n * 2 && queue.isEmpty()) {
                return -1;
            }
        }

        return queue.peek(); 
    }
}
