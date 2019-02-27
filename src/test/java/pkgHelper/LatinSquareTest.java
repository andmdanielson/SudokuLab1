package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void DoesElementExist_Test1() {
		
		int[] array1= {1,2,3,4,5};
		int iValue=2;
		boolean bExpectedCondition=true;
		boolean bActualCondition;
		
		bActualCondition=LatinSquare.doesElementExist(array1,iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	
	@Test
	public void DoesElementExist_Test2() {
		
		int[] array1= {1,2,3,4,5};
		int iValue=7;
		boolean bExpectedCondition=false;
		boolean bActualCondition;
		
		bActualCondition=LatinSquare.doesElementExist(array1,iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	
	@Test
	public void hasAllValues_Test1() {
		int[] array1= {1,2,3,4,5};
		int[] array2= {3,5,2,1,4};
		boolean bExpected=true;
		boolean bActual;
		
		bActual=LatinSquare.hasAllValues(array1, array2);
		assertEquals(bExpected,bActual);
	}
	
	@Test
	public void hasAllValues_Test2() {
		int[] array1= {1,2,3,4,5};
		int[] array2= {3,1,2,6,4};
		boolean bExpected=false;
		boolean bActual;
		
		bActual=LatinSquare.hasAllValues(array1, array2);
		assertEquals(bExpected,bActual);
	}
	
	@Test
	public void ContainsZero_Test1() {
			
		int[][] puzzle= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls=new LatinSquare(puzzle);
		boolean bExpected=false;
		boolean bActual=ls.ContainsZero();
		
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void ContainsZero_Test2() {
			
		int[][] puzzle= {{1,2,3},{0,3,1},{3,1,2}};
		LatinSquare ls=new LatinSquare(puzzle);
		boolean bExpected=true;
		boolean bActual=ls.ContainsZero();
		
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void hasDuplicates_Test1() {
		
		int[] array= {1,2,3,4,6};
		boolean expected=false;
		boolean actual=LatinSquare.hasDuplicates(array);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void hasDuplicates_Test2() {
		
		int[] array= {1,2,3,4,4};
		boolean expected=true;
		boolean actual=LatinSquare.hasDuplicates(array);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void getColumn_Test1() {
		int[][] puzzle= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare lats=new LatinSquare(puzzle);
		int[] expected= {1,2,3};
		int[] actual=lats.getColumn(0);
		
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void getRow_Test1() {
		int[][] puzzle= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare lats=new LatinSquare(puzzle);
		int[] expected= {2,3,1};
		int[] actual=lats.getRow(1);
		
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void isLatinSquare_Test1() {
		//success test
		int[][] puzzle= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare lats=new LatinSquare(puzzle);
		boolean expected=true;
		boolean actual=lats.isLatinSquare();
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void isLatinSquare_Test2() {
		//test for duplicates in columns
		int[][] puzzle= {{1,2,3},{2,3,1},{1,3,2}};
		LatinSquare lats=new LatinSquare(puzzle);
		boolean expected=false;
		boolean actual=lats.isLatinSquare();
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void isLatinSquare_Test3() {
		//test for duplicates in rows
		int[][] puzzle= {{1,2,3},{2,1,1},{3,3,2}};
		LatinSquare lats=new LatinSquare(puzzle);
		boolean expected=false;
		boolean actual=lats.isLatinSquare();
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void isLatinSquare_Test4() {
		//test for rows and columns having different values
		int[][] puzzle= {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare lats=new LatinSquare(puzzle);
		boolean expected=false;
		boolean actual=lats.isLatinSquare();
		
		assertEquals(expected,actual);
	}
}

