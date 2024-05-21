package hilos_trabajo_so;

public final class Main {

    public static void main(String[] args) {

        // Inicializar y arrancar los hilos
        new VideoCaptureThread("Camera1").start();
        new VideoReceptionThread().start();
        new ImageProcessingThread().start();
        new ResultManagementThread().start();
        new VideoStorageThread().start();
        new DatabaseUpdateThread().start();
        new EnergyControlThread().start();
        new RealTimeMonitoringThread().start();

        // Puedes inicializar más hilos de captura para otras cámaras
        new VideoCaptureThread("Camera2").start();
        new VideoCaptureThread("Camera3").start();
        // Y así sucesivamente para cada cámara

    }
}
