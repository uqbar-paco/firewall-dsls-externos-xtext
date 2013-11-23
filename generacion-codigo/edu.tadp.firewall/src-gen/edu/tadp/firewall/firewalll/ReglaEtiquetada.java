/**
 */
package edu.tadp.firewall.firewalll;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regla Etiquetada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.ReglaEtiquetada#getLan <em>Lan</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.ReglaEtiquetada#getRegla <em>Regla</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.tadp.firewall.firewalll.FirewalllPackage#getReglaEtiquetada()
 * @model
 * @generated
 */
public interface ReglaEtiquetada extends EObject
{
  /**
   * Returns the value of the '<em><b>Lan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lan</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lan</em>' attribute.
   * @see #setLan(String)
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getReglaEtiquetada_Lan()
   * @model
   * @generated
   */
  String getLan();

  /**
   * Sets the value of the '{@link edu.tadp.firewall.firewalll.ReglaEtiquetada#getLan <em>Lan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lan</em>' attribute.
   * @see #getLan()
   * @generated
   */
  void setLan(String value);

  /**
   * Returns the value of the '<em><b>Regla</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regla</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regla</em>' containment reference.
   * @see #setRegla(Regla)
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getReglaEtiquetada_Regla()
   * @model containment="true"
   * @generated
   */
  Regla getRegla();

  /**
   * Sets the value of the '{@link edu.tadp.firewall.firewalll.ReglaEtiquetada#getRegla <em>Regla</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regla</em>' containment reference.
   * @see #getRegla()
   * @generated
   */
  void setRegla(Regla value);

} // ReglaEtiquetada
