/** Класс реализует калкулятор
*/
public class Calku {

/** Результат вычисления
*/

private int result;

/** сумируем аргументы  = param ,params Это Аргументы суммирования
*/

public void add(int ... params) {
  for (Integer param : params) {
    this.result += param;
  }
}

/** получить результат 
return результат вычисления 
*/

public int getResult() {
 return this.result;
}

/** Очистить результат нашего вычисления
*/

public void cleanResult() {
  this.result = 0;
}
 }