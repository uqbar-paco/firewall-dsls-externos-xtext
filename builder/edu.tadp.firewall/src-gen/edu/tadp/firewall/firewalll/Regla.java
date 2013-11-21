/**
 */
package edu.tadp.firewall.firewalll;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.Regla#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.Regla#getAccion <em>Accion</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.tadp.firewall.firewalll.FirewalllPackage#getRegla()
 * @model
 * @generated
 */
public interface Regla extends EObject
{
  /**
   * Returns the value of the '<em><b>Condicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condicion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condicion</em>' containment reference.
   * @see #setCondicion(Condicion)
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getRegla_Condicion()
   * @model containment="true"
   * @generated
   */
  Condicion getCondicion();

  /**
   * Sets the value of the '{@link edu.tadp.firewall.firewalll.Regla#getCondicion <em>Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condicion</em>' containment reference.
   * @see #getCondicion()
   * @generated
   */
  void setCondicion(Condicion value);

  /**
   * Returns the value of the '<em><b>Accion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accion</em>' attribute.
   * @see #setAccion(String)
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getRegla_Accion()
   * @model
   * @generated
   */
  String getAccion();

  /**
   * Sets the value of the '{@link edu.tadp.firewall.firewalll.Regla#getAccion <em>Accion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accion</em>' attribute.
   * @see #getAccion()
   * @generated
   */
  void setAccion(String value);

} // Regla
