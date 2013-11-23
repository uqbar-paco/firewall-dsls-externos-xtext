/**
 */
package edu.tadp.firewall.firewalll;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.tadp.firewall.firewalll.FirewalllPackage
 * @generated
 */
public interface FirewalllFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FirewalllFactory eINSTANCE = edu.tadp.firewall.firewalll.impl.FirewalllFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Firewall</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Firewall</em>'.
   * @generated
   */
  Firewall createFirewall();

  /**
   * Returns a new object of class '<em>Regla Etiquetada</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regla Etiquetada</em>'.
   * @generated
   */
  ReglaEtiquetada createReglaEtiquetada();

  /**
   * Returns a new object of class '<em>Regla</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regla</em>'.
   * @generated
   */
  Regla createRegla();

  /**
   * Returns a new object of class '<em>Accion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accion</em>'.
   * @generated
   */
  Accion createAccion();

  /**
   * Returns a new object of class '<em>Forwardear Accion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forwardear Accion</em>'.
   * @generated
   */
  ForwardearAccion createForwardearAccion();

  /**
   * Returns a new object of class '<em>Aceptar Accion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aceptar Accion</em>'.
   * @generated
   */
  AceptarAccion createAceptarAccion();

  /**
   * Returns a new object of class '<em>Bloquear Accion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bloquear Accion</em>'.
   * @generated
   */
  BloquearAccion createBloquearAccion();

  /**
   * Returns a new object of class '<em>Condicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condicion</em>'.
   * @generated
   */
  Condicion createCondicion();

  /**
   * Returns a new object of class '<em>Condicion Puerto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condicion Puerto</em>'.
   * @generated
   */
  CondicionPuerto createCondicionPuerto();

  /**
   * Returns a new object of class '<em>Condicion IP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condicion IP</em>'.
   * @generated
   */
  CondicionIP createCondicionIP();

  /**
   * Returns a new object of class '<em>IP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IP</em>'.
   * @generated
   */
  IP createIP();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FirewalllPackage getFirewalllPackage();

} //FirewalllFactory
