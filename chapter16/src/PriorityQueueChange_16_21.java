//(Changing a PriorityQueue’s Sort Order) The output of Fig. 16.15 shows that Priority
//Queue orders Double elements in ascending order. Rewrite Fig. 16.15 so that it orders Double ele
//ments in descending order (i.e., 9.8 should be the highest-priority element rather than 3.2).

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueChange_16_21
{
    public static void main(String[] args)
    {
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        while (queue.size() > 0)
        {
            System.out.printf("%.1f ", queue.peek());
            queue.poll();
        }
    }
}