/**
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.Accion;
import edu.tadp.firewall.firewalll.AceptarAccion;
import edu.tadp.firewall.firewalll.BloquearAccion;
import edu.tadp.firewall.firewalll.Condicion;
import edu.tadp.firewall.firewalll.CondicionIP;
import edu.tadp.firewall.firewalll.CondicionPuerto;
import edu.tadp.firewall.firewalll.Firewall;
import edu.tadp.firewall.firewalll.FirewalllFactory;
import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.ForwardearAccion;
import edu.tadp.firewall.firewalll.Regla;
import edu.tadp.firewall.firewalll.ReglaEtiquetada;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FirewalllPackageImpl extends EPackageImpl implements FirewalllPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass firewallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reglaEtiquetadaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reglaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forwardearAccionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aceptarAccionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bloquearAccionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass condicionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass condicionPuertoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass condicionIPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ipEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.tadp.firewall.firewalll.FirewalllPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FirewalllPackageImpl()
  {
    super(eNS_URI, FirewalllFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FirewalllPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FirewalllPackage init()
  {
    if (isInited) return (FirewalllPackage)EPackage.Registry.INSTANCE.getEPackage(FirewalllPackage.eNS_URI);

    // Obtain or create and register package
    FirewalllPackageImpl theFirewalllPackage = (FirewalllPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FirewalllPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FirewalllPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFirewalllPackage.createPackageContents();

    // Initialize created meta-data
    theFirewalllPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFirewalllPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FirewalllPackage.eNS_URI, theFirewalllPackage);
    return theFirewalllPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFirewall()
  {
    return firewallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFirewall_Reglas()
  {
    return (EReference)firewallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReglaEtiquetada()
  {
    return reglaEtiquetadaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReglaEtiquetada_Lan()
  {
    return (EAttribute)reglaEtiquetadaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReglaEtiquetada_Regla()
  {
    return (EReference)reglaEtiquetadaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegla()
  {
    return reglaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegla_Condicion()
  {
    return (EReference)reglaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegla_Accion()
  {
    return (EReference)reglaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccion()
  {
    return accionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForwardearAccion()
  {
    return forwardearAccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForwardearAccion_Ip()
  {
    return (EReference)forwardearAccionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForwardearAccion_Puerto()
  {
    return (EAttribute)forwardearAccionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAceptarAccion()
  {
    return aceptarAccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBloquearAccion()
  {
    return bloquearAccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondicion()
  {
    return condicionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondicionPuerto()
  {
    return condicionPuertoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondicionPuerto_Puerto()
  {
    return (EAttribute)condicionPuertoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondicionIP()
  {
    return condicionIPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondicionIP_Ip()
  {
    return (EReference)condicionIPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIP()
  {
    return ipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIP_Primero()
  {
    return (EAttribute)ipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIP_Segundo()
  {
    return (EAttribute)ipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIP_Tercero()
  {
    return (EAttribute)ipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIP_Cuarto()
  {
    return (EAttribute)ipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirewalllFactory getFirewalllFactory()
  {
    return (FirewalllFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    firewallEClass = createEClass(FIREWALL);
    createEReference(firewallEClass, FIREWALL__REGLAS);

    reglaEtiquetadaEClass = createEClass(REGLA_ETIQUETADA);
    createEAttribute(reglaEtiquetadaEClass, REGLA_ETIQUETADA__LAN);
    createEReference(reglaEtiquetadaEClass, REGLA_ETIQUETADA__REGLA);

    reglaEClass = createEClass(REGLA);
    createEReference(reglaEClass, REGLA__CONDICION);
    createEReference(reglaEClass, REGLA__ACCION);

    accionEClass = createEClass(ACCION);

    forwardearAccionEClass = createEClass(FORWARDEAR_ACCION);
    createEReference(forwardearAccionEClass, FORWARDEAR_ACCION__IP);
    createEAttribute(forwardearAccionEClass, FORWARDEAR_ACCION__PUERTO);

    aceptarAccionEClass = createEClass(ACEPTAR_ACCION);

    bloquearAccionEClass = createEClass(BLOQUEAR_ACCION);

    condicionEClass = createEClass(CONDICION);

    condicionPuertoEClass = createEClass(CONDICION_PUERTO);
    createEAttribute(condicionPuertoEClass, CONDICION_PUERTO__PUERTO);

    condicionIPEClass = createEClass(CONDICION_IP);
    createEReference(condicionIPEClass, CONDICION_IP__IP);

    ipEClass = createEClass(IP);
    createEAttribute(ipEClass, IP__PRIMERO);
    createEAttribute(ipEClass, IP__SEGUNDO);
    createEAttribute(ipEClass, IP__TERCERO);
    createEAttribute(ipEClass, IP__CUARTO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    forwardearAccionEClass.getESuperTypes().add(this.getAccion());
    aceptarAccionEClass.getESuperTypes().add(this.getAccion());
    bloquearAccionEClass.getESuperTypes().add(this.getAccion());
    condicionPuertoEClass.getESuperTypes().add(this.getCondicion());
    condicionIPEClass.getESuperTypes().add(this.getCondicion());

    // Initialize classes and features; add operations and parameters
    initEClass(firewallEClass, Firewall.class, "Firewall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFirewall_Reglas(), this.getReglaEtiquetada(), null, "reglas", null, 0, -1, Firewall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reglaEtiquetadaEClass, ReglaEtiquetada.class, "ReglaEtiquetada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReglaEtiquetada_Lan(), ecorePackage.getEString(), "lan", null, 0, 1, ReglaEtiquetada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReglaEtiquetada_Regla(), this.getRegla(), null, "regla", null, 0, 1, ReglaEtiquetada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reglaEClass, Regla.class, "Regla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegla_Condicion(), this.getCondicion(), null, "condicion", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegla_Accion(), this.getAccion(), null, "accion", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accionEClass, Accion.class, "Accion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forwardearAccionEClass, ForwardearAccion.class, "ForwardearAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForwardearAccion_Ip(), this.getIP(), null, "ip", null, 0, 1, ForwardearAccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForwardearAccion_Puerto(), ecorePackage.getEInt(), "puerto", null, 0, 1, ForwardearAccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aceptarAccionEClass, AceptarAccion.class, "AceptarAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bloquearAccionEClass, BloquearAccion.class, "BloquearAccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(condicionEClass, Condicion.class, "Condicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(condicionPuertoEClass, CondicionPuerto.class, "CondicionPuerto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondicionPuerto_Puerto(), ecorePackage.getEInt(), "puerto", null, 0, 1, CondicionPuerto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(condicionIPEClass, CondicionIP.class, "CondicionIP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondicionIP_Ip(), this.getIP(), null, "ip", null, 0, 1, CondicionIP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ipEClass, edu.tadp.firewall.firewalll.IP.class, "IP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIP_Primero(), ecorePackage.getEInt(), "primero", null, 0, 1, edu.tadp.firewall.firewalll.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIP_Segundo(), ecorePackage.getEInt(), "segundo", null, 0, 1, edu.tadp.firewall.firewalll.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIP_Tercero(), ecorePackage.getEInt(), "tercero", null, 0, 1, edu.tadp.firewall.firewalll.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIP_Cuarto(), ecorePackage.getEInt(), "cuarto", null, 0, 1, edu.tadp.firewall.firewalll.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FirewalllPackageImpl
