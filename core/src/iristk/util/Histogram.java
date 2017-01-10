package iristk.util;

import java.util.Arrays;

public class Histogram {

	private int[] histogram;
	private Integer adaptRate = null;
	private int values = 0;
	
	public Histogram(int max) {
		histogram = new int[max];
		reset();
	}
	
	public Histogram(int max, int rate) {
		this(max);
		setAdaptRate(rate);
	}

	public void setAdaptRate(int rate) {
		adaptRate  = rate;
	}

	public void add(int value) {
			if(value>=100){//Added to handle odd occurences that pass bad data.
				System.err.println("High value passed into histogram" + value + ". Readjusting down.");
				value=0;
			}
			histogram[value]++;
			values++;
			//if (adaptRate != null && values > adaptRate) {
			if (adaptRate != null && histogram[value] >= adaptRate) {
				//System.out.println("XXX");
				values = 0;
				for (int i = 0; i < histogram.length; i++) {
					histogram[i] /= 2;
					values += histogram[i];
				}
			}
	}
	
	public void addAll(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
	}

	public Integer getPercentile(double perc) {
		double sum = 0;
		for (int i = 0; i < histogram.length; i++) {
			sum += histogram[i];
			if ((sum / values) >= perc) {
				return i;
			}
		}
		return histogram.length-1;
	}

	public void reset() {
		Arrays.fill(histogram, 0);
		values = 0;
	}

	public int getMax() {
		int index = -1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < histogram.length; i++) {
			if (histogram[i] > max) {
				max = histogram[i];
				index = i;
			}
		}
		return index;
	}

	public double getNegStdDev(int level) {
		double tot = 0;
		int num = 0;
		for (int i = 0; i < level; i++) {
			tot += histogram[i] * Math.pow((level-i),2);
			num += histogram[i];
		}
		if (num > 0) {
			return Math.sqrt(tot / num);
		} else {
			return 0;
		}
	}

	public int size() {
		return values;
	}

}