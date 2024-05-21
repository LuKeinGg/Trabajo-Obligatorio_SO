package hilos_trabajo_so;

import java.util.concurrent.ConcurrentLinkedQueue;

//Hilo de captura y transmisión de videos

class VideoCaptureThread extends Thread {
    private String camaraId;
    private ConcurrentLinkedQueue<String> colaVideo;

    public VideoCaptureThread(String camaraId, ConcurrentLinkedQueue<String> colaVideo) {
        this.camaraId = camaraId;
        this.colaVideo = colaVideo;
    }

    @Override
    public void run() {
        while (true) {
            // Simulación de captura de video
            String imagenVideo = "Imagen de " + camaraId;
            System.out.println("Capturando video desde la cámara: " + camaraId);
            colaVideo.add(imagenVideo);
            // Simulación de transmisión de video al servidor
            try {
                Thread.sleep(1000); // Simula el tiempo de captura de video
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// class VideoCaptureThread extends Thread {
// private String cameraId;

// public VideoCaptureThread(String cameraId) {
// this.cameraId = cameraId;
// }

// @Override
// public void run() {
// while (true) {
// // Simulación de captura de video
// System.out.println("Capturando video desde la cámara: " + cameraId);
// // Simulación de transmisión de video al servidor
// // Aquí podrías utilizar sockets o alguna otra forma de comunicación
// try {
// Thread.sleep(1000); // Simula el tiempo de captura de video
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
