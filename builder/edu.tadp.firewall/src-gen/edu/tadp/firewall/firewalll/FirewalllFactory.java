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
   * Returns a new object of class '<em>Regla</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regla</em>'.
   * @generated
   */
  Regla createRegla();

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
