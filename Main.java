public class Main {
    public static void main(String[] args) {
        Priority pq = new Priority();

        pq.addEmergency("Health Emergency", 1);
        pq.addEmergency("Child Prank Call", 10);
        pq.addEmergency("House Fire", 2);
        pq.addEmergency("Car Breakdown", 4);
        pq.addEmergency("Motor Accident", 3);
        pq.addEmergency("Mental Breakdown", 6);
        pq.addEmergency("Small Fire", 5);
        pq.addEmergency("Gas Leak", 8);
        pq.addEmergency("Runaway Dog", 7);
        pq.addEmergency("Power Outage", 9);

        System.out.println("Priority Queue with all descriptions:");
        System.out.println(pq);
        pq.bubbleSortHeap();
        
        System.out.println("\nEmergencies in order of severity: ");
        while (true) {
            Emergency emergency = pq.popMostUrgent();
            if (emergency == null) {
                break;
            }
            System.out.println(emergency);
        }
    }
}
