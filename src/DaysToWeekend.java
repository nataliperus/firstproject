/*ДЗ
Вывести дни недели, оставшиеся от текущего
дня недели до её конца. Например, в пятницу выводим: суббота,
воскресенье. А в воскресенье: «последний день».
Как получить текущий день недели.
int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
Дальше можно его сравнивать с Calendar.SUNDAY и т.д.
(да, воскресенье — первый по числовому порядку день недели, а мы-то считаем с понедельника)
 */
class DaysToWeekend {
    public String getDaysToEndOfWeek( int day){
        String rezult ="";
        final String[] dayList ={"Воскресенье","Понедельник","Вторник","Среда","Четверг","Пятница","Суббота"};
        for (int k = day; k < dayList.length; k++) {
            rezult += dayList[k]+ " , ";
        }
         rezult +=  dayList[0];
         return rezult ;
    }
}
