package hilos_trabajo_so;

import java.util.concurrent.ConcurrentLinkedQueue;

//Hilo de almacenamiento de video

class VideoStorageThread extends Thread {
    private ConcurrentLinkedQueue<String> colaVideo;

    public VideoStorageThread(ConcurrentLinkedQueue<String> colaVideo) {
        this.colaVideo = colaVideo;
    }

    @Override
    public void run() {
        while (true) {
            if (!colaVideo.isEmpty()) {
                String imagenVideo = colaVideo.poll();
                System.out.println("Almacenando video en el HVR: " + imagenVideo);
                // Simulación del almacenamiento de video
                try {
                    Thread.sleep(5000); // Simula el tiempo de almacenamiento de video
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// class VideoStorageThread extends Thread {
// @Override
// public void run() {
// while (true) {
// // Simulación de almacenamiento de video
// System.out.println("Almacenando video en el HVR...");
// try {
// Thread.sleep(5000); // Simula el tiempo de almacenamiento de video
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
