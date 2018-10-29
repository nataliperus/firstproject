/*
• Создайте абстрактный класс Animal, от которого унаследуйте Cat и Dog
• От Cat и Dog унаследуйте по несколько пород кошек и собак (гугл в помощь!).
Пусть они печатаются в консоль в формате «вид порода имя» («Собака, овчарка, Рекс»).
Попробуйте использовать минимум дублируемого кода и максимум абстракции.
• У Animal должен быть метод talk, и все должны мяукать и гавкать.
• Реализуйте equals() и hashCode() корректно: если двух псов зовут Бобик, но они бассет и овчарка,
то это разные собаки; тем более — если это собака и кот. Не используйте шаблоны IDE.
• Добавьте Animal final-методы sleep(), awake() и die().
Если животное спит или умерло, то вызов talk() ни к чему не приводит.
20.10
1. В ранее созданном классе Animal использовать enum { SLEEPING, AWAKEN,
DEAD } вместо пары флагов boolean, оставить ту же функциональность
• Многие уже так и сделали, те сразу следуют к пункту 2
2. Завести ещё несколько видов животных: корова, волк, рысь, медведь и т.п.,
обязательно несколько диких.
3. Добавить runtime-аннотацию Domesticated. Пометить ей классы
одомашненных животных.
4. Проверить одомашненность у случайно взятого животного через аннотацию
 */
package animals;

public class Animal {

    enum Status {
        SLEEPING,
        AWAKE,
        DEAD
    }
    Status status = Status.AWAKE;
    String name = "";
    public void talk() {}
    final public void sleep(){
        this.status = Status.SLEEPING;
    }
    final public void awake(){
        this.status = Status.AWAKE;
    }
    final public void die(){
        this.status = Status.DEAD;
    }

    public boolean equals(Animal b){
        return (this.getClass() == b.getClass() && String.valueOf(this.name) == String.valueOf(b.name));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
