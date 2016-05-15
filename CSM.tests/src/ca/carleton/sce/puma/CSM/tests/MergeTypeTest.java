/**
 */
package ca.carleton.sce.puma.CSM.tests;

import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.MergeType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Merge Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MergeTypeTest extends PathConnectionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MergeTypeTest.class);
	}

	/**
	 * Constructs a new Merge Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Merge Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MergeType getFixture() {
		return (MergeType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CSMFactory.eINSTANCE.createMergeType());
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

} //MergeTypeTest
