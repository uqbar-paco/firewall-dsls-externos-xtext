/**
 */
package edu.tadp.firewall.firewalll;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.tadp.firewall.firewalll.FirewalllFactory
 * @model kind="package"
 * @generated
 */
public interface FirewalllPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "firewalll";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tadp.edu/firewall/Firewalll";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "firewalll";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FirewalllPackage eINSTANCE = edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.FirewallImpl <em>Firewall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.FirewallImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getFirewall()
   * @generated
   */
  int FIREWALL = 0;

  /**
   * The feature id for the '<em><b>Reglas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIREWALL__REGLAS = 0;

  /**
   * The number of structural features of the '<em>Firewall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIREWALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.ReglaEtiquetadaImpl <em>Regla Etiquetada</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.ReglaEtiquetadaImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getReglaEtiquetada()
   * @generated
   */
  int REGLA_ETIQUETADA = 1;

  /**
   * The feature id for the '<em><b>Lan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGLA_ETIQUETADA__LAN = 0;

  /**
   * The feature id for the '<em><b>Regla</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGLA_ETIQUETADA__REGLA = 1;

  /**
   * The number of structural features of the '<em>Regla Etiquetada</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGLA_ETIQUETADA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.ReglaImpl <em>Regla</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.ReglaImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getRegla()
   * @generated
   */
  int REGLA = 2;

  /**
   * The feature id for the '<em><b>Condicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGLA__CONDICION = 0;

  /**
   * The feature id for the '<em><b>Accion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGLA__ACCION = 1;

  /**
   * The number of structural features of the '<em>Regla</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGLA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.AccionImpl <em>Accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.AccionImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getAccion()
   * @generated
   */
  int ACCION = 3;

  /**
   * The number of structural features of the '<em>Accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.ForwardearAccionImpl <em>Forwardear Accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.ForwardearAccionImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getForwardearAccion()
   * @generated
   */
  int FORWARDEAR_ACCION = 4;

  /**
   * The feature id for the '<em><b>Ip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARDEAR_ACCION__IP = ACCION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Puerto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARDEAR_ACCION__PUERTO = ACCION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Forwardear Accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARDEAR_ACCION_FEATURE_COUNT = ACCION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.AceptarAccionImpl <em>Aceptar Accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.AceptarAccionImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getAceptarAccion()
   * @generated
   */
  int ACEPTAR_ACCION = 5;

  /**
   * The number of structural features of the '<em>Aceptar Accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACEPTAR_ACCION_FEATURE_COUNT = ACCION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.BloquearAccionImpl <em>Bloquear Accion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.BloquearAccionImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getBloquearAccion()
   * @generated
   */
  int BLOQUEAR_ACCION = 6;

  /**
   * The number of structural features of the '<em>Bloquear Accion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOQUEAR_ACCION_FEATURE_COUNT = ACCION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.CondicionImpl <em>Condicion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.CondicionImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getCondicion()
   * @generated
   */
  int CONDICION = 7;

  /**
   * The number of structural features of the '<em>Condicion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDICION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.CondicionPuertoImpl <em>Condicion Puerto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.CondicionPuertoImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getCondicionPuerto()
   * @generated
   */
  int CONDICION_PUERTO = 8;

  /**
   * The feature id for the '<em><b>Puerto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDICION_PUERTO__PUERTO = CONDICION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Condicion Puerto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDICION_PUERTO_FEATURE_COUNT = CONDICION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.CondicionIPImpl <em>Condicion IP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.CondicionIPImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getCondicionIP()
   * @generated
   */
  int CONDICION_IP = 9;

  /**
   * The feature id for the '<em><b>Ip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDICION_IP__IP = CONDICION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Condicion IP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDICION_IP_FEATURE_COUNT = CONDICION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.tadp.firewall.firewalll.impl.IPImpl <em>IP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.tadp.firewall.firewalll.impl.IPImpl
   * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getIP()
   * @generated
   */
  int IP = 10;

  /**
   * The feature id for the '<em><b>Primero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP__PRIMERO = 0;

  /**
   * The feature id for the '<em><b>Segundo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP__SEGUNDO = 1;

  /**
   * The feature id for the '<em><b>Tercero</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP__TERCERO = 2;

  /**
   * The feature id for the '<em><b>Cuarto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP__CUARTO = 3;

  /**
   * The number of structural features of the '<em>IP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IP_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.Firewall <em>Firewall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Firewall</em>'.
   * @see edu.tadp.firewall.firewalll.Firewall
   * @generated
   */
  EClass getFirewall();

  /**
   * Returns the meta object for the containment reference list '{@link edu.tadp.firewall.firewalll.Firewall#getReglas <em>Reglas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reglas</em>'.
   * @see edu.tadp.firewall.firewalll.Firewall#getReglas()
   * @see #getFirewall()
   * @generated
   */
  EReference getFirewall_Reglas();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.ReglaEtiquetada <em>Regla Etiquetada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regla Etiquetada</em>'.
   * @see edu.tadp.firewall.firewalll.ReglaEtiquetada
   * @generated
   */
  EClass getReglaEtiquetada();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.ReglaEtiquetada#getLan <em>Lan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lan</em>'.
   * @see edu.tadp.firewall.firewalll.ReglaEtiquetada#getLan()
   * @see #getReglaEtiquetada()
   * @generated
   */
  EAttribute getReglaEtiquetada_Lan();

  /**
   * Returns the meta object for the containment reference '{@link edu.tadp.firewall.firewalll.ReglaEtiquetada#getRegla <em>Regla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Regla</em>'.
   * @see edu.tadp.firewall.firewalll.ReglaEtiquetada#getRegla()
   * @see #getReglaEtiquetada()
   * @generated
   */
  EReference getReglaEtiquetada_Regla();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.Regla <em>Regla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regla</em>'.
   * @see edu.tadp.firewall.firewalll.Regla
   * @generated
   */
  EClass getRegla();

  /**
   * Returns the meta object for the containment reference '{@link edu.tadp.firewall.firewalll.Regla#getCondicion <em>Condicion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condicion</em>'.
   * @see edu.tadp.firewall.firewalll.Regla#getCondicion()
   * @see #getRegla()
   * @generated
   */
  EReference getRegla_Condicion();

  /**
   * Returns the meta object for the containment reference '{@link edu.tadp.firewall.firewalll.Regla#getAccion <em>Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accion</em>'.
   * @see edu.tadp.firewall.firewalll.Regla#getAccion()
   * @see #getRegla()
   * @generated
   */
  EReference getRegla_Accion();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.Accion <em>Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accion</em>'.
   * @see edu.tadp.firewall.firewalll.Accion
   * @generated
   */
  EClass getAccion();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.ForwardearAccion <em>Forwardear Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forwardear Accion</em>'.
   * @see edu.tadp.firewall.firewalll.ForwardearAccion
   * @generated
   */
  EClass getForwardearAccion();

  /**
   * Returns the meta object for the containment reference '{@link edu.tadp.firewall.firewalll.ForwardearAccion#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ip</em>'.
   * @see edu.tadp.firewall.firewalll.ForwardearAccion#getIp()
   * @see #getForwardearAccion()
   * @generated
   */
  EReference getForwardearAccion_Ip();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.ForwardearAccion#getPuerto <em>Puerto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Puerto</em>'.
   * @see edu.tadp.firewall.firewalll.ForwardearAccion#getPuerto()
   * @see #getForwardearAccion()
   * @generated
   */
  EAttribute getForwardearAccion_Puerto();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.AceptarAccion <em>Aceptar Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aceptar Accion</em>'.
   * @see edu.tadp.firewall.firewalll.AceptarAccion
   * @generated
   */
  EClass getAceptarAccion();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.BloquearAccion <em>Bloquear Accion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bloquear Accion</em>'.
   * @see edu.tadp.firewall.firewalll.BloquearAccion
   * @generated
   */
  EClass getBloquearAccion();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.Condicion <em>Condicion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condicion</em>'.
   * @see edu.tadp.firewall.firewalll.Condicion
   * @generated
   */
  EClass getCondicion();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.CondicionPuerto <em>Condicion Puerto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condicion Puerto</em>'.
   * @see edu.tadp.firewall.firewalll.CondicionPuerto
   * @generated
   */
  EClass getCondicionPuerto();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.CondicionPuerto#getPuerto <em>Puerto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Puerto</em>'.
   * @see edu.tadp.firewall.firewalll.CondicionPuerto#getPuerto()
   * @see #getCondicionPuerto()
   * @generated
   */
  EAttribute getCondicionPuerto_Puerto();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.CondicionIP <em>Condicion IP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condicion IP</em>'.
   * @see edu.tadp.firewall.firewalll.CondicionIP
   * @generated
   */
  EClass getCondicionIP();

  /**
   * Returns the meta object for the containment reference '{@link edu.tadp.firewall.firewalll.CondicionIP#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ip</em>'.
   * @see edu.tadp.firewall.firewalll.CondicionIP#getIp()
   * @see #getCondicionIP()
   * @generated
   */
  EReference getCondicionIP_Ip();

  /**
   * Returns the meta object for class '{@link edu.tadp.firewall.firewalll.IP <em>IP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IP</em>'.
   * @see edu.tadp.firewall.firewalll.IP
   * @generated
   */
  EClass getIP();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.IP#getPrimero <em>Primero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primero</em>'.
   * @see edu.tadp.firewall.firewalll.IP#getPrimero()
   * @see #getIP()
   * @generated
   */
  EAttribute getIP_Primero();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.IP#getSegundo <em>Segundo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Segundo</em>'.
   * @see edu.tadp.firewall.firewalll.IP#getSegundo()
   * @see #getIP()
   * @generated
   */
  EAttribute getIP_Segundo();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.IP#getTercero <em>Tercero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tercero</em>'.
   * @see edu.tadp.firewall.firewalll.IP#getTercero()
   * @see #getIP()
   * @generated
   */
  EAttribute getIP_Tercero();

  /**
   * Returns the meta object for the attribute '{@link edu.tadp.firewall.firewalll.IP#getCuarto <em>Cuarto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cuarto</em>'.
   * @see edu.tadp.firewall.firewalll.IP#getCuarto()
   * @see #getIP()
   * @generated
   */
  EAttribute getIP_Cuarto();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FirewalllFactory getFirewalllFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.FirewallImpl <em>Firewall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.FirewallImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getFirewall()
     * @generated
     */
    EClass FIREWALL = eINSTANCE.getFirewall();

    /**
     * The meta object literal for the '<em><b>Reglas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIREWALL__REGLAS = eINSTANCE.getFirewall_Reglas();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.ReglaEtiquetadaImpl <em>Regla Etiquetada</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.ReglaEtiquetadaImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getReglaEtiquetada()
     * @generated
     */
    EClass REGLA_ETIQUETADA = eINSTANCE.getReglaEtiquetada();

    /**
     * The meta object literal for the '<em><b>Lan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGLA_ETIQUETADA__LAN = eINSTANCE.getReglaEtiquetada_Lan();

    /**
     * The meta object literal for the '<em><b>Regla</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGLA_ETIQUETADA__REGLA = eINSTANCE.getReglaEtiquetada_Regla();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.ReglaImpl <em>Regla</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.ReglaImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getRegla()
     * @generated
     */
    EClass REGLA = eINSTANCE.getRegla();

    /**
     * The meta object literal for the '<em><b>Condicion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGLA__CONDICION = eINSTANCE.getRegla_Condicion();

    /**
     * The meta object literal for the '<em><b>Accion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGLA__ACCION = eINSTANCE.getRegla_Accion();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.AccionImpl <em>Accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.AccionImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getAccion()
     * @generated
     */
    EClass ACCION = eINSTANCE.getAccion();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.ForwardearAccionImpl <em>Forwardear Accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.ForwardearAccionImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getForwardearAccion()
     * @generated
     */
    EClass FORWARDEAR_ACCION = eINSTANCE.getForwardearAccion();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARDEAR_ACCION__IP = eINSTANCE.getForwardearAccion_Ip();

    /**
     * The meta object literal for the '<em><b>Puerto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORWARDEAR_ACCION__PUERTO = eINSTANCE.getForwardearAccion_Puerto();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.AceptarAccionImpl <em>Aceptar Accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.AceptarAccionImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getAceptarAccion()
     * @generated
     */
    EClass ACEPTAR_ACCION = eINSTANCE.getAceptarAccion();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.BloquearAccionImpl <em>Bloquear Accion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.BloquearAccionImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getBloquearAccion()
     * @generated
     */
    EClass BLOQUEAR_ACCION = eINSTANCE.getBloquearAccion();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.CondicionImpl <em>Condicion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.CondicionImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getCondicion()
     * @generated
     */
    EClass CONDICION = eINSTANCE.getCondicion();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.CondicionPuertoImpl <em>Condicion Puerto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.CondicionPuertoImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getCondicionPuerto()
     * @generated
     */
    EClass CONDICION_PUERTO = eINSTANCE.getCondicionPuerto();

    /**
     * The meta object literal for the '<em><b>Puerto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDICION_PUERTO__PUERTO = eINSTANCE.getCondicionPuerto_Puerto();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.CondicionIPImpl <em>Condicion IP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.CondicionIPImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getCondicionIP()
     * @generated
     */
    EClass CONDICION_IP = eINSTANCE.getCondicionIP();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDICION_IP__IP = eINSTANCE.getCondicionIP_Ip();

    /**
     * The meta object literal for the '{@link edu.tadp.firewall.firewalll.impl.IPImpl <em>IP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.tadp.firewall.firewalll.impl.IPImpl
     * @see edu.tadp.firewall.firewalll.impl.FirewalllPackageImpl#getIP()
     * @generated
     */
    EClass IP = eINSTANCE.getIP();

    /**
     * The meta object literal for the '<em><b>Primero</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP__PRIMERO = eINSTANCE.getIP_Primero();

    /**
     * The meta object literal for the '<em><b>Segundo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP__SEGUNDO = eINSTANCE.getIP_Segundo();

    /**
     * The meta object literal for the '<em><b>Tercero</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP__TERCERO = eINSTANCE.getIP_Tercero();

    /**
     * The meta object literal for the '<em><b>Cuarto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IP__CUARTO = eINSTANCE.getIP_Cuarto();

  }

} //FirewalllPackage
