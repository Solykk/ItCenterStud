package hw5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	private static final long MILLISECONDS_IN_A_DAY = 86400000;
	private static final long SECONDS_IN_A_YEAR = 31557600;
	private static final long SECONDS_IN_A_MONTH = 2629800;

	public static long getDiffInMillis(Calendar c1, Calendar c2) {
		// учитываем перевод времени
		long time1 = c1.getTimeInMillis() + c1.getTimeZone().getOffset(c1.getTimeInMillis());
		long time2 = c2.getTimeInMillis() + c2.getTimeZone().getOffset(c2.getTimeInMillis());
		return Math.abs(time1 - time2);

	}

	public static int getDiffInDays(Calendar c1, Calendar c2) {
		Calendar gc1 = (Calendar) c1.clone();
		Calendar gc2 = (Calendar) c2.clone();

		// обнуляем часы, минуты и секунды
		gc1.set(Calendar.HOUR, 0);
		gc2.set(Calendar.HOUR, 0);
		gc1.set(Calendar.SECOND, 0);
		gc2.set(Calendar.SECOND, 0);
		gc1.set(Calendar.MILLISECOND, 0);
		gc2.set(Calendar.MILLISECOND, 0);

		return (int) (getDiffInMillis(c1, c2) / MILLISECONDS_IN_A_DAY);
	}
	public static int getDiffInYear(Calendar c1, Calendar c2) {
		Calendar gc1 = (Calendar) c1.clone();
		Calendar gc2 = (Calendar) c2.clone();

		// обнуляем часы, минуты и секунды
		gc1.set(Calendar.HOUR, 0);
		gc2.set(Calendar.HOUR, 0);
		gc1.set(Calendar.SECOND, 0);
		gc2.set(Calendar.SECOND, 0);
		gc1.set(Calendar.MILLISECOND, 0);
		gc2.set(Calendar.MILLISECOND, 0);

		return (int) ((getDiffInMillis(c1, c2)/1000)/ SECONDS_IN_A_YEAR);
	}
	public static int getDiffInMonths(Calendar c1, Calendar c2) {
		Calendar gc1 = (Calendar) c1.clone();
		Calendar gc2 = (Calendar) c2.clone();

		// обнуляем часы, минуты и секунды
		gc1.set(Calendar.HOUR, 0);
		gc2.set(Calendar.HOUR, 0);
		gc1.set(Calendar.SECOND, 0);
		gc2.set(Calendar.SECOND, 0);
		gc1.set(Calendar.MILLISECOND, 0);
		gc2.set(Calendar.MILLISECOND, 0);

		return (int) ((getDiffInMillis(c1, c2)/1000) / SECONDS_IN_A_MONTH);
	}
	/**
	 * 
	 * Высчитывает разницу между двумя временами, в зависимости от значения
	 * field. field - это константное значение из java.util.Calendar,
	 * обозначающее конкретную временную метрику(год, месяц и т.д.).
	 *
	 * 
	 * 
	 * Устанавливает поля, заданные в массиве clearFields равными 0.
	 * 
	 * 
	 * @param field
	 *            константное значение из java.util.Calendar(YEAR, MONTH...)
	 * @param c1
	 *            первая дата
	 * @param c2
	 *            вторая дата
	 * @param clearFields
	 *            поля даты, которые не учитываются при сравнении. Задаются
	 *            массивом констант из из java.util.Calendar. Например, можно не
	 *            учитывать миллисекунды, секунды и часы. Данные поля будут
	 *            обнулены.
	 * @return разницу между c1 и c2 в метрике, заданной field
	 */
	public static int getTimeDifference(int field, Calendar c1, Calendar c2, int... clearFields) {
		Calendar gc1, gc2;

		if (c2.after(c1)) {
			gc1 = (Calendar) c1.clone();
			gc2 = (Calendar) c2.clone();
		} else {
			gc1 = (Calendar) c2.clone();
			gc2 = (Calendar) c1.clone();
		}

		if (clearFields != null) {
			// очищаем поля, которые мы не будем учитывать при сравнении дат
			for (int clearField : clearFields) {
				gc1.clear(clearField);
				gc2.clear(clearField);
			}
		}

		int count = 0;
		for (gc1.add(field, 1); gc1.compareTo(gc2) <= 0; gc1.add(field, 1)) {
			count++;
		}
		return count;
	}

	/**
	 * Возвращает слово, добавляющееся к временной единице, когда указывается
	 * сколько прошло временных единиц. В русском языке для временных единиц
	 * достаточно трех слов. Значение time берется по модулю.
	 * 
	 * @param time
	 *            количество временной единицы
	 * @param timeUnitName1
	 *            Название временной единицы, которое используется с 1.
	 *            Например, 1 "минута".
	 * @param timeUnitName2
	 *            Название временной единицы, которое используется с 2.
	 *            Например, 2 "минуты".
	 * @param timeUnitName5
	 *            Название временной единицы, которое используется с 5.
	 *            Например, 5 "минут".
	 * @return слово для единицы времени
	 */
	public static String getTimeUnitPeriodName(long time, String timeUnitName1, String timeUnitName2,
			String timeUnitName5) {
		String result;
		time = Math.abs(time); // для отрицательных чисел
		int small = (int) (time % 10);
		int middle = (int) (time % 100);

		// если заканчивается на 11, то всегда оформляется словом timeUnitName5
		if (small == 1 && middle != 11) {
			result = timeUnitName1;
		}
		// если оканчиваются на 2, 3, 4, за исключением 12, 13 и 14
		else if (small >= 2 && small <= 4 && (middle < 12 || middle > 14)) {
			result = timeUnitName2;
		} else {
			result = timeUnitName5;
		}

		return result;
	}

	public static void timeOfWorking(Calendar from, Calendar to) {
		 
		
		if (from.after(to)) {
			to = from;
		}

		int diffInYears = TestDate.getDiffInYear(from, to);
		to.add(Calendar.YEAR, -diffInYears); // вычитаем учтенные года
		
		int diffInMonths = TestDate.getDiffInMonths(from, to);
		to.add(Calendar.MONTH, -diffInMonths); // вычитаем учтенные месяцы
		
		int diffInDays = TestDate.getDiffInDays(from, to);
		to.add(Calendar.DATE, -diffInDays);
		
		System.out.println();
	}

	public static void main(String[] args) {

		GregorianCalendar calen = new GregorianCalendar(2014, 4, 15);
		Date d = calen.getTime();

		GregorianCalendar calen1 = new GregorianCalendar(2010, 3, 10);
		Date d1 = calen1.getTime();

		Calendar t = Calendar.getInstance();
		t.setTime(d);
		System.out.println(t.getTime());
		Calendar v = Calendar.getInstance();
		v.setTime(d1);

		long f = t.getTime().getTime() - v.getTime().getTime();

		DateFormat TIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(f);
		System.out.println();
		System.out.println(getDiffInMillis(t, v));
		System.out.println(getDiffInDays(t, v));
		System.out.println(getTimeUnitPeriodName(getDiffInMillis(t, v), "минута", "минуты", "минут"));
		System.out.println(getDiffInYear(t, v));
		timeOfWorking(t,v);

        Calendar calOne = Calendar.getInstance();
        Calendar calTwo = Calendar.getInstance();
        
        calOne.add(Calendar.DATE, -2);
        calOne.add(Calendar.HOUR, -4);
        calOne.add(Calendar.MINUTE, -32);
        calOne.add(Calendar.SECOND, -6);
        calOne.add(Calendar.MILLISECOND, -17);
        
        Calendar distinct = Calendar.getInstance();
        distinct.setTime(new Date(v.getTime().getTime() - t.getTime().getTime()));
        
        System.out.println(((distinct.get(Calendar.DAY_OF_YEAR) - 1 ) * 24)  + (distinct.get(Calendar.HOUR_OF_DAY) - 4) + ":" + 
                distinct.get(Calendar.MINUTE) + ":" + distinct.get(Calendar.SECOND));
        
        GregorianCalendar yui = new GregorianCalendar(2015, 6, 26);
        yui.add(Calendar.WEEK_OF_MONTH, - 2);
        Date tr =  yui.getTime();
        System.out.println(tr);
	}

}
