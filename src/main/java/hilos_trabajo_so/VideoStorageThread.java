package hilos_trabajo_so;

//Hilo de almacenamiento de video

class VideoStorageThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de almacenamiento de video
            System.out.println("Almacenando video en el HVR...");
            try {
                Thread.sleep(5000); // Simula el tiempo de almacenamiento de video
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
