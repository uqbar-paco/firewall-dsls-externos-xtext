/**
 */
package edu.tadp.firewall.firewalll;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firewall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.Firewall#getReglas <em>Reglas</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.tadp.firewall.firewalll.FirewalllPackage#getFirewall()
 * @model
 * @generated
 */
public interface Firewall extends EObject
{
  /**
   * Returns the value of the '<em><b>Reglas</b></em>' containment reference list.
   * The list contents are of type {@link edu.tadp.firewall.firewalll.Regla}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reglas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reglas</em>' containment reference list.
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getFirewall_Reglas()
   * @model containment="true"
   * @generated
   */
  EList<Regla> getReglas();

} // Firewall
