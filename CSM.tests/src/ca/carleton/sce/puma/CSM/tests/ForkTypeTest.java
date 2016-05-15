/**
 */
package ca.carleton.sce.puma.CSM.tests;

import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.ForkType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fork Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForkTypeTest extends PathConnectionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForkTypeTest.class);
	}

	/**
	 * Constructs a new Fork Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fork Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForkType getFixture() {
		return (ForkType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CSMFactory.eINSTANCE.createForkType());
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

} //ForkTypeTest
