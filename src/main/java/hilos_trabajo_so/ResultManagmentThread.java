package hilos_trabajo_so;

//Hilo de gestión de resultados

class ResultManagementThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de gestión de resultados
            System.out.println("Gestionando resultados de reconocimiento facial...");
            try {
                Thread.sleep(1000); // Simula el tiempo de gestión de resultados
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
