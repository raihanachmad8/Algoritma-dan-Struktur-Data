public class Main {
    public static void main(String[] args) {
        // Initialization
        Queue truckQueue = new Queue();
        Stack woodStack = new Stack();


        // Memasukkan Queue dari Truck
        for (int i = 1; i <= 5; i++) {
            Truck truck = new Truck(i);
            truckQueue.enqueue(truck);
        }

        while (!truckQueue.isEmpty()) {
            truckQueue.printQueue();
            woodStack.printStack();
            System.out.println("Prosess...");

                Truck truck = truckQueue.dequeue();
                System.out.println("Truck " + truck.getId() + " Sedang menumpuk Kayu");
                // memindahkan kayu dari truck ke woodStack
                System.out.println("Truck " + truck.getId() + " Berhasil menumpuk kayu.");
                woodStack.push(truck);


            System.out.println();
        }

        woodStack.printStack();
    }

}