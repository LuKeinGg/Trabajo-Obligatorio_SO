package hilos_trabajo_so;

//Hilo de monitoreo en tiempo real

class RealTimeMonitoringThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de monitoreo en tiempo real
            System.out.println("Monitoreando en tiempo real...");
            try {
                Thread.sleep(7000); // Simula el tiempo de monitoreo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
