/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Perf Value Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfValueKind()
 * @model extendedMetaData="name='PerfValueKind'"
 * @generated
 */
public enum PerfValueKind implements Enumerator {
	/**
	 * The '<em><b>Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION(0, "distribution", "distribution"), /**
	 * The '<em><b>Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(1, "max", "max"), /**
	 * The '<em><b>Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN(2, "mean", "mean"), /**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(3, "min", "min"), /**
	 * The '<em><b>Moment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOMENT(4, "moment", "moment"), /**
	 * The '<em><b>Percentile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTILE(5, "percentile", "percentile"), /**
	 * The '<em><b>Variance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANCE(6, "variance", "variance");

	/**
	 * The '<em><b>Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distribution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION
	 * @model name="distribution"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_VALUE = 0;

	/**
	 * The '<em><b>Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model name="max"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 1;

	/**
	 * The '<em><b>Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEAN
	 * @model name="mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_VALUE = 2;

	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 3;

	/**
	 * The '<em><b>Moment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOMENT
	 * @model name="moment"
	 * @generated
	 * @ordered
	 */
	public static final int MOMENT_VALUE = 4;

	/**
	 * The '<em><b>Percentile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTILE
	 * @model name="percentile"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTILE_VALUE = 5;

	/**
	 * The '<em><b>Variance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Variance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARIANCE
	 * @model name="variance"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANCE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Perf Value Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PerfValueKind[] VALUES_ARRAY =
		new PerfValueKind[] {
			DISTRIBUTION,
			MAX,
			MEAN,
			MIN,
			MOMENT,
			PERCENTILE,
			VARIANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Perf Value Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PerfValueKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Perf Value Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PerfValueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PerfValueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Perf Value Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PerfValueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PerfValueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Perf Value Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PerfValueKind get(int value) {
		switch (value) {
			case DISTRIBUTION_VALUE: return DISTRIBUTION;
			case MAX_VALUE: return MAX;
			case MEAN_VALUE: return MEAN;
			case MIN_VALUE: return MIN;
			case MOMENT_VALUE: return MOMENT;
			case PERCENTILE_VALUE: return PERCENTILE;
			case VARIANCE_VALUE: return VARIANCE;
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
	private PerfValueKind(int value, String name, String literal) {
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
	
} //PerfValueKind
