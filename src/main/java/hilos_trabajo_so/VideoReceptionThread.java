package hilos_trabajo_so;

import java.util.concurrent.ConcurrentLinkedQueue;

//Hilo de Recepción de Video

class VideoReceptionThread extends Thread {
    private ConcurrentLinkedQueue<String> colaVideo;
    private ConcurrentLinkedQueue<String> colaProcesada;

    public VideoReceptionThread(ConcurrentLinkedQueue<String> colaVideo,
            ConcurrentLinkedQueue<String> colaProcesada) {
        this.colaVideo = colaVideo;
        this.colaProcesada = colaProcesada;
    }

    @Override
    public void run() {
        while (true) {
            if (!colaVideo.isEmpty()) {
                String imagenVideo = colaVideo.poll();
                System.out.println("Recibiendo video para procesamiento: " + imagenVideo);
                colaProcesada.add(imagenVideo);
                try {
                    Thread.sleep(2000); // Simula el tiempo de recepción de video
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// class VideoReceptionThread extends Thread {
// @Override
// public void run() {
// while (true) {
// // Simulación de recepción de video
// System.out.println("Recibiendo video para procesamiento...");
// // Dividir las tareas de procesamiento
// try {
// Thread.sleep(2000); // Simula el tiempo de recepción de video
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
