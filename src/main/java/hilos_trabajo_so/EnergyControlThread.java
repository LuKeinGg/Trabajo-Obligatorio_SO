package hilos_trabajo_so;

//Hilo de control de energía

class EnergyControlThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de control de energía
            System.out.println("Controlando suministro de energía...");
            try {
                Thread.sleep(10000); // Simula el tiempo de monitoreo de energía
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
