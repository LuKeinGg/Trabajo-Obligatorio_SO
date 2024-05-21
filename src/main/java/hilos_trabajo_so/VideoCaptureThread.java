package hilos_trabajo_so;

//Hilo de captura y transmisión de videos

class VideoCaptureThread extends Thread {
    private String cameraId;

    public VideoCaptureThread(String cameraId) {
        this.cameraId = cameraId;
    }

    @Override
    public void run() {
        while (true) {
            // Simulación de captura de video
            System.out.println("Capturando video desde la cámara: " + cameraId);
            // Simulación de transmisión de video al servidor
            // Aquí podrías utilizar sockets o alguna otra forma de comunicación
            try {
                Thread.sleep(1000); // Simula el tiempo de captura de video
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
