package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;
	
	public LatinSquare() {	
	}
	
	public LatinSquare(int[][] puzzle) {
		
		super();
		this.LatinSquare=puzzle;
	}
	
	public int[][] getLatinSquare() {
		
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		
		LatinSquare = latinSquare;
	}
	
	public static boolean doesElementExist(int[] arr, int ivalue) {
		
		for (int i: arr) {
			
			if (i==ivalue) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean bHasValues=false;
		for (int i1: arr1) {
			
			for (int i2: arr2) {
				
				if (i1==i2) {
					bHasValues=true;
					break;
				}
				
				else {
					bHasValues=false;
				}
			}
			if (bHasValues==false){
				break;
			}
		}
		return bHasValues;
	}
	
	public boolean ContainsZero() {
		
		for(int iRow=0; iRow<this.LatinSquare.length; iRow++) {
			
			for (int iCol=0; iCol<this.LatinSquare.length; iCol++) {
				
				if(this.LatinSquare[iRow][iCol]==0) {
					
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasDuplicates(int[] arr) {
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length-1; i++) {
			
			if (arr[i]==arr[i+1]) {
				
				return true;
			}
		}
		return false;
	}
	
	public int[] getColumn(int iCol) {
		
		int[] Column= new int[LatinSquare.length];
		
		for(int iRow=0; iRow<this.LatinSquare.length; iRow++) {
			
			Column[iRow]=this.LatinSquare[iRow][iCol];
		}
		return Column;
	}
	
	public int[] getRow(int iRow) {
		
		int[] Row= new int[LatinSquare.length];
		
		for(int iCol=0; iCol<this.LatinSquare.length; iCol++) {
			
			Row[iCol]=this.LatinSquare[iRow][iCol];
		}
		return Row;
	}
	
	public boolean isLatinSquare() {
		
		int size=LatinSquare.length;
		
		// check duplicates
		for (int index=0; index<size; index++) {
			int[] row=getRow(index);
			int[] col=getColumn(index);
			if (hasDuplicates(row)==true) {
				return false;
			}
			if (hasDuplicates(col)==true) {
				return false;
			}
		}
		
		// check columns
		int[] col1=getColumn(0);
		for(int indexCol=1; indexCol<size; indexCol++) {
			int[] iCol=getColumn(indexCol);
			if (hasAllValues(col1,iCol)==false) {
				return false;
			}
		}
		
		// check rows
		int[] row1=getRow(0);
		for(int indexRow=1; indexRow<size; indexRow++) {
			int[] iRow=getRow(indexRow);
			if (hasAllValues(row1,iRow)==false) {
				return false;
			}
		}
		return true;
	}
}
