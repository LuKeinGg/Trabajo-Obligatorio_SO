package hilos_trabajo_so;

import java.util.concurrent.ConcurrentLinkedQueue;

//Hilo de procesamiento de imágenes (CNN)

class ImageProcessingThread extends Thread {
    private ConcurrentLinkedQueue<String> colaProcesada;
    private ConcurrentLinkedQueue<String> resultadoCola;

    public ImageProcessingThread(ConcurrentLinkedQueue<String> colaProcesada,
            ConcurrentLinkedQueue<String> resultadoCola) {
        this.colaProcesada = colaProcesada;
        this.resultadoCola = resultadoCola;
    }

    @Override
    public void run() {
        while (true) {
            if (!colaProcesada.isEmpty()) {
                String imagenVideo = colaProcesada.poll();
                System.out.println("Procesando imágenes y realizando reconocimiento facial: " + imagenVideo);
                // Simulación del procesamiento de la imagen
                String resultado = "Resultado de " + imagenVideo;
                resultadoCola.add(resultado);
                try {
                    Thread.sleep(3000); // Simula el tiempo de procesamiento de imágenes
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// class ImageProcessingThread extends Thread {
// @Override
// public void run() {
// while (true) {
// // Simulación de procesamiento de imágenes usando CNN
// System.out.println("Procesando imágenes y realizando reconocimiento
// facial...");
// try {
// Thread.sleep(3000); // Simula el tiempo de procesamiento de imágenes
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
