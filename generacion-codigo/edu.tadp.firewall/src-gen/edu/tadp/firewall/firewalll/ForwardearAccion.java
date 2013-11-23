/**
 */
package edu.tadp.firewall.firewalll;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forwardear Accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.ForwardearAccion#getIp <em>Ip</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.ForwardearAccion#getPuerto <em>Puerto</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.tadp.firewall.firewalll.FirewalllPackage#getForwardearAccion()
 * @model
 * @generated
 */
public interface ForwardearAccion extends Accion
{
  /**
   * Returns the value of the '<em><b>Ip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip</em>' containment reference.
   * @see #setIp(IP)
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getForwardearAccion_Ip()
   * @model containment="true"
   * @generated
   */
  IP getIp();

  /**
   * Sets the value of the '{@link edu.tadp.firewall.firewalll.ForwardearAccion#getIp <em>Ip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip</em>' containment reference.
   * @see #getIp()
   * @generated
   */
  void setIp(IP value);

  /**
   * Returns the value of the '<em><b>Puerto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Puerto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Puerto</em>' attribute.
   * @see #setPuerto(int)
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#getForwardearAccion_Puerto()
   * @model
   * @generated
   */
  int getPuerto();

  /**
   * Sets the value of the '{@link edu.tadp.firewall.firewalll.ForwardearAccion#getPuerto <em>Puerto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Puerto</em>' attribute.
   * @see #getPuerto()
   * @generated
   */
  void setPuerto(int value);

} // ForwardearAccion
