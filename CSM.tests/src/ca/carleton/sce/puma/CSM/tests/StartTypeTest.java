/**
 */
package ca.carleton.sce.puma.CSM.tests;

import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.StartType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartTypeTest extends PathConnectionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartTypeTest.class);
	}

	/**
	 * Constructs a new Start Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StartType getFixture() {
		return (StartType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CSMFactory.eINSTANCE.createStartType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StartTypeTest
