/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepKind()
 * @model extendedMetaData="name='StepKind'"
 * @generated
 */
public enum StepKind implements Enumerator {
	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "normal", "normal"),

	/**
	 * The '<em><b>External Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_OPERATION(1, "externalOperation", "externalOperation"),

	/**
	 * The '<em><b>Behavior Demand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_DEMAND_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOR_DEMAND(2, "behaviorDemand", "behaviorDemand"),

	/**
	 * The '<em><b>Service Demand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DEMAND_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DEMAND(3, "serviceDemand", "serviceDemand"),

	/**
	 * The '<em><b>Null Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_STEP_VALUE
	 * @generated
	 * @ordered
	 */
	NULL_STEP(4, "nullStep", "nullStep");

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>External Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External Operation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_OPERATION
	 * @model name="externalOperation"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_OPERATION_VALUE = 1;

	/**
	 * The '<em><b>Behavior Demand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behavior Demand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_DEMAND
	 * @model name="behaviorDemand"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_DEMAND_VALUE = 2;

	/**
	 * The '<em><b>Service Demand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Demand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DEMAND
	 * @model name="serviceDemand"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DEMAND_VALUE = 3;

	/**
	 * The '<em><b>Null Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Null Step</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL_STEP
	 * @model name="nullStep"
	 * @generated
	 * @ordered
	 */
	public static final int NULL_STEP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Step Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StepKind[] VALUES_ARRAY =
		new StepKind[] {
			NORMAL,
			EXTERNAL_OPERATION,
			BEHAVIOR_DEMAND,
			SERVICE_DEMAND,
			NULL_STEP,
		};

	/**
	 * A public read-only list of all the '<em><b>Step Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StepKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Step Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StepKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Step Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepKind get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case EXTERNAL_OPERATION_VALUE: return EXTERNAL_OPERATION;
			case BEHAVIOR_DEMAND_VALUE: return BEHAVIOR_DEMAND;
			case SERVICE_DEMAND_VALUE: return SERVICE_DEMAND;
			case NULL_STEP_VALUE: return NULL_STEP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StepKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StepKind
