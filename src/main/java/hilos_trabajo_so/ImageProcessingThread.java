package hilos_trabajo_so;

//Hilo de procesamiento de imágenes (CNN)

class ImageProcessingThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de procesamiento de imágenes usando CNN
            System.out.println("Procesando imágenes y realizando reconocimiento facial...");
            try {
                Thread.sleep(3000); // Simula el tiempo de procesamiento de imágenes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
