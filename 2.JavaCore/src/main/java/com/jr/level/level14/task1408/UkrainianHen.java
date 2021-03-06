package com.jr.level.level14.task1408;

public class UkrainianHen extends Hen {
	public static String country;
	private static int count;
	static {
		country = Country.UKRAINE;
		count = 30;
	}

	@Override
	public int getCountOfEggsPerMonth() {
		return count;
	}

	@Override
	public String getDescription(){
		StringBuffer sb = new StringBuffer(super.getDescription());
		sb.append(" Моя страна - ");
		sb.append(country);
		sb.append(". Я несу ");
		sb.append(count);
		sb.append(" яиц в месяц.");
		return sb.toString();
	}
}

