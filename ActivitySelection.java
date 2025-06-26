import java.util.*;
public class ActivitySelection {
    static class Activity {
        int start, end;
        Activity(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};

        int n = start.length;
        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], end[i]));
        }

        activities.sort(Comparator.comparingInt(a -> a.end));

        int count = 1;
        int lastEnd = activities.get(0).end;

        for (int i = 1; i < n; i++) {
            if (activities.get(i).start >= lastEnd) {
                count++;
                lastEnd = activities.get(i).end;
            }
        }

        System.out.println("Maximum number of activities: " + count);
    }
}
    
