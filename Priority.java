import java.util.ArrayList;

public class Priority {
    private ArrayList<Emergency> heap;

    public Priority() {
        heap = new ArrayList<>();
    }

    public void addEmergency(String description, int priority) {
        Emergency emergency = new Emergency(description, priority);
        heap.add(emergency);
    }

    // Bubble Sort 
    public void bubbleSortHeap() {
        int n = heap.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heap.get(j).priority > heap.get(j + 1).priority) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int i, int j) {
        Emergency temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public int size() {
        return heap.size();
    }

    @Override
    public String toString() {
        return heap.toString();
    }

    public Emergency popMostUrgent() {
        if (heap.size() == 0) {
            return null;
        }
        return heap.remove(0);
    }
}
