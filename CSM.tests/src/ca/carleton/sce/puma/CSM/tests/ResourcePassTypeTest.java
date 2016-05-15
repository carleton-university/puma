/**
 */
package ca.carleton.sce.puma.CSM.tests;

import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.ResourcePassType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Pass Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePassTypeTest extends StepTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourcePassTypeTest.class);
	}

	/**
	 * Constructs a new Resource Pass Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePassTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Pass Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourcePassType getFixture() {
		return (ResourcePassType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CSMFactory.eINSTANCE.createResourcePassType());
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

} //ResourcePassTypeTest
