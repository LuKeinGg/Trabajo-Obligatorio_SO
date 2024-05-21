package hilos_trabajo_so;

//Hilo de Recepción de Video

class VideoReceptionThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de recepción de video
            System.out.println("Recibiendo video para procesamiento...");
            // Dividir las tareas de procesamiento
            try {
                Thread.sleep(2000); // Simula el tiempo de recepción de video
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
