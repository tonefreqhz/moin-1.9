/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.jhotdraw.test.framework;

import java.awt.Rectangle;

import junit.framework.TestCase;
// JUnitDoclet begin import
import org.jhotdraw.framework.DrawingChangeEvent;
import org.jhotdraw.standard.StandardDrawing;
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase DrawingChangeEventTest is generated by
 * JUnitDoclet to hold the tests for DrawingChangeEvent.
 * @see org.jhotdraw.framework.DrawingChangeEvent
 */
// JUnitDoclet end javadoc_class
public class DrawingChangeEventTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private DrawingChangeEvent drawingchangeevent;
	// JUnitDoclet end class

	/**
	 * Constructor DrawingChangeEventTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public DrawingChangeEventTest(String name) {
		// JUnitDoclet begin method DrawingChangeEventTest
		super(name);
		// JUnitDoclet end method DrawingChangeEventTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public DrawingChangeEvent createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new DrawingChangeEvent(new StandardDrawing(), new Rectangle(10, 10, 100, 100));
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		drawingchangeevent = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		drawingchangeevent = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method getDrawing()
	/**
	 * Method testGetDrawing is testing getDrawing
	 * @see org.jhotdraw.framework.DrawingChangeEvent#getDrawing()
	 */
	// JUnitDoclet end javadoc_method getDrawing()
	public void testGetDrawing() throws Exception {
		// JUnitDoclet begin method getDrawing
		// JUnitDoclet end method getDrawing
	}

	// JUnitDoclet begin javadoc_method getInvalidatedRectangle()
	/**
	 * Method testGetInvalidatedRectangle is testing getInvalidatedRectangle
	 * @see org.jhotdraw.framework.DrawingChangeEvent#getInvalidatedRectangle()
	 */
	// JUnitDoclet end javadoc_method getInvalidatedRectangle()
	public void testGetInvalidatedRectangle() throws Exception {
		// JUnitDoclet begin method getInvalidatedRectangle
		// JUnitDoclet end method getInvalidatedRectangle
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

}
