package hilos_trabajo_so;

import java.util.concurrent.ConcurrentLinkedQueue;

//Hilo de gestión de resultados

class ResultManagementThread extends Thread {
    private ConcurrentLinkedQueue<String> resultadoCola;

    public ResultManagementThread(ConcurrentLinkedQueue<String> resultadoCola) {
        this.resultadoCola = resultadoCola;
    }

    @Override
    public void run() {
        while (true) {
            if (!resultadoCola.isEmpty()) {
                String resultado = resultadoCola.poll();
                System.out.println("Gestionando resultados de reconocimiento facial: " + resultado);
                // Aquí se pueden generar alertas o tomar acciones basadas en los resultados
                try {
                    Thread.sleep(1000); // Simula el tiempo de gestión de resultados
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// class ResultManagementThread extends Thread {
// @Override
// public void run() {
// while (true) {
// // Simulación de gestión de resultados
// System.out.println("Gestionando resultados de reconocimiento facial...");
// try {
// Thread.sleep(1000); // Simula el tiempo de gestión de resultados
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
