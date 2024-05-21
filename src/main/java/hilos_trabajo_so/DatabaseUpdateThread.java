package hilos_trabajo_so;

//Hilo de actualización de base de datos de rostros
class DatabaseUpdateThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // Simulación de actualización de la base de datos de rostros
            System.out.println("Actualizando base de datos de rostros...");
            try {
                Thread.sleep(6000); // Simula el tiempo de actualización de la base de datos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
