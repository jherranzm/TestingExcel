/**
 * 
 */
package telefonica.aaee.excel.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import telefonica.aaee.excel.UtilGetRange;

/**
 * @author jherranzm
 *
 */
public class UtilGetRangeTest {

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRangeZeroZero() {
		assertTrue(UtilGetRange.getRange(0, 0).equals("$A$1"));
	}

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRangeNegZero() {
		assertTrue(UtilGetRange.getRange(-1, 0).equals("$A$1"));
	}

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRangePosPos() {
		assertTrue(UtilGetRange.getRange(1, 1).equals("$A$1:$A$1"));
	}

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRange_2_2() {
		assertTrue(UtilGetRange.getRange(2, 2).equals("$A$1:$B$2"));
	}

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRange_26_26() {
		assertTrue(UtilGetRange.getRange(26, 26).equals("$A$1:$Z$26"));
	}

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRange_27_27() {
		assertTrue(UtilGetRange.getRange(27, 27).equals("$A$1:$AA$27"));
	}

	/**
	 * Test method for {@link telefonica.aaee.excel.UtilGetRange#getRange(int, int)}.
	 */
	@Test
	public void testGetRange_54_54() {
		assertTrue(UtilGetRange.getRange(54, 54).equals("$A$1:$BB$54"));
	}

}
