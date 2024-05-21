package hilos_trabajo_so;

import java.util.concurrent.ConcurrentLinkedQueue;

public final class Main {

    public static void main(String[] args) {

        // Crear colas de mensajes para comunicación entre hilos
        ConcurrentLinkedQueue<String> colaVideo = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedQueue<String> colaProcesada = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedQueue<String> resultadoCola = new ConcurrentLinkedQueue<>();

        // Inicializar y arrancar los hilos
        new VideoCaptureThread("Camara1", colaVideo).start();
        new VideoCaptureThread("Camara2", colaVideo).start();
        new VideoCaptureThread("Camara3", colaVideo).start();

        new VideoReceptionThread(colaVideo, colaProcesada).start();
        new ImageProcessingThread(colaProcesada, resultadoCola).start();
        new ResultManagementThread(resultadoCola).start();

        new VideoStorageThread(colaVideo).start();
        new DatabaseUpdateThread().start();
        new EnergyControlThread().start();
        new RealTimeMonitoringThread().start();

        // Inicializar y arrancar los hilos
        // new VideoCaptureThread("Camera1").start();
        // new VideoReceptionThread().start();
        // new ImageProcessingThread().start();
        // new ResultManagementThread().start();
        // new VideoStorageThread().start();
        // new DatabaseUpdateThread().start();
        // new EnergyControlThread().start();
        // new RealTimeMonitoringThread().start();

        // // Puedes inicializar más hilos de captura para otras cámaras
        // new VideoCaptureThread("Camera2").start();
        // new VideoCaptureThread("Camera3").start();
        // // Y así sucesivamente para cada cámara

    }
}
