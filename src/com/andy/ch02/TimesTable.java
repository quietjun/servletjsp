package com.andy.ch02;

public class TimesTable {
	public String getTimesTable(int dan) {
		StringBuilder builder = new StringBuilder("<html><body>");
		builder.append("times table for " + dan);
		builder.append("<table border='1'><tr><th>first num</th><th>second num</th><th>result</th></tr>");
		for (int i = 1; i < 10; i++) {
			builder.append("<tr><td>").append(dan).append("</td><td>");
			builder.append(i).append("</td><td>").append(dan * i);
			builder.append("</td></tr>");
		}
		builder.append("</table></body></html>");
		return builder.toString();

	}
}
