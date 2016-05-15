/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perf Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfValueType#getKind <em>Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfValueType#getSource <em>Source</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfValueType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfValueType()
 * @model extendedMetaData="name='PerfValueType' kind='empty'"
 * @generated
 */
public interface PerfValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"mean"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.PerfValueKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.PerfValueKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(PerfValueKind)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfValueType_Kind()
	 * @model default="mean" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	PerfValueKind getKind();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.PerfValueKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PerfValueKind value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(PerfValueKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(PerfValueKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The default value is <code>"required"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.PerfValueSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.PerfValueSource
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(PerfValueSource)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfValueType_Source()
	 * @model default="required" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	PerfValueSource getSource();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.PerfValueSource
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PerfValueSource value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(PerfValueSource)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(PerfValueSource)
	 * @generated
	 */
	boolean isSetSource();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfValueType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PerfValueType
