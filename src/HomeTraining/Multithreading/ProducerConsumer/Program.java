package HomeTraining.Multithreading.ProducerConsumer;

/*
 Возьмем стандартную задачу из прошлой темы - "Производитель-Потребитель"
 ("Producer-Consumer"): пока производитель не произвел продукт,
 потребитель не может его купить. Пусть производитель должен произвести 5 товаров,
 соответственно потребитель должен их все купить.
 Но при этом одновременно на складе может находиться не более 3 товаров.
 Для решения этой задачи задействуем методы wait() и notify():
*/

/*
Получается:
1. поток consumer захватывает монитор
2. так как product=0 срабатывает wait() и монитор освобождается а consumer засыпает
3. поток producer захватывает монитор
4. poducer вызывает notify() consumer просыпается, но монитор захвачен producer-ом, поэтому он ждет.
5. producer создает 3 продукта и вызывается метод wait - монитор освобождается.
6. поток consumer захватывает монитор

В результате потоки работают по очереди.
 */

public class Program {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
