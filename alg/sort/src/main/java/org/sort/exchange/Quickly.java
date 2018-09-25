package org.sort.exchange;

import java.util.Arrays;

//快排
public class Quickly {

	
	/**
	 * 
	 * 快速排序使用的是分治思想，将原问题分成若干个子问题进行递归解决。
	 * 通过一趟排序将要排序的数据分割成独立的两部分，
	 * 其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，
	 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
	 * 1) (one-pivot) Quicksort 单轴
	 * 
	 * 
	 * 2) Dual-Pivot Quicksort 双轴
	 * 
	 * 
	 * 
	 * 
	 *  4 6  7  5   2  1  
	 *  
	 *  1 2 4 5 6 7  3
	 *  
	 *  https://blog.csdn.net/Holmofy/article/details/71168530
	 *  //https://www.cnblogs.com/dapeng-bupt/p/7922719.html
	 */
	
	
	public static void main(String[] args) {
		Arrays.sort(args);
	}
}
