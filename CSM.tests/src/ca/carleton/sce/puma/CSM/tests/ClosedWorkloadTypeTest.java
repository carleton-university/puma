/**
 */
package ca.carleton.sce.puma.CSM.tests;

import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.ClosedWorkloadType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Closed Workload Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClosedWorkloadTypeTest extends WorkloadTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClosedWorkloadTypeTest.class);
	}

	/**
	 * Constructs a new Closed Workload Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedWorkloadTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Closed Workload Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClosedWorkloadType getFixture() {
		return (ClosedWorkloadType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CSMFactory.eINSTANCE.createClosedWorkloadType());
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

} //ClosedWorkloadTypeTest
