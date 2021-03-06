/**
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FirewalllFactoryImpl extends EFactoryImpl implements FirewalllFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FirewalllFactory init()
  {
    try
    {
      FirewalllFactory theFirewalllFactory = (FirewalllFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tadp.edu/firewall/Firewalll"); 
      if (theFirewalllFactory != null)
      {
        return theFirewalllFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FirewalllFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirewalllFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FirewalllPackage.FIREWALL: return createFirewall();
      case FirewalllPackage.REGLA_ETIQUETADA: return createReglaEtiquetada();
      case FirewalllPackage.REGLA: return createRegla();
      case FirewalllPackage.ACCION: return createAccion();
      case FirewalllPackage.FORWARDEAR_ACCION: return createForwardearAccion();
      case FirewalllPackage.ACEPTAR_ACCION: return createAceptarAccion();
      case FirewalllPackage.BLOQUEAR_ACCION: return createBloquearAccion();
      case FirewalllPackage.CONDICION: return createCondicion();
      case FirewalllPackage.CONDICION_PUERTO: return createCondicionPuerto();
      case FirewalllPackage.CONDICION_IP: return createCondicionIP();
      case FirewalllPackage.IP: return createIP();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Firewall createFirewall()
  {
    FirewallImpl firewall = new FirewallImpl();
    return firewall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReglaEtiquetada createReglaEtiquetada()
  {
    ReglaEtiquetadaImpl reglaEtiquetada = new ReglaEtiquetadaImpl();
    return reglaEtiquetada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Regla createRegla()
  {
    ReglaImpl regla = new ReglaImpl();
    return regla;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accion createAccion()
  {
    AccionImpl accion = new AccionImpl();
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardearAccion createForwardearAccion()
  {
    ForwardearAccionImpl forwardearAccion = new ForwardearAccionImpl();
    return forwardearAccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AceptarAccion createAceptarAccion()
  {
    AceptarAccionImpl aceptarAccion = new AceptarAccionImpl();
    return aceptarAccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BloquearAccion createBloquearAccion()
  {
    BloquearAccionImpl bloquearAccion = new BloquearAccionImpl();
    return bloquearAccion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condicion createCondicion()
  {
    CondicionImpl condicion = new CondicionImpl();
    return condicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondicionPuerto createCondicionPuerto()
  {
    CondicionPuertoImpl condicionPuerto = new CondicionPuertoImpl();
    return condicionPuerto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondicionIP createCondicionIP()
  {
    CondicionIPImpl condicionIP = new CondicionIPImpl();
    return condicionIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IP createIP()
  {
    IPImpl ip = new IPImpl();
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirewalllPackage getFirewalllPackage()
  {
    return (FirewalllPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FirewalllPackage getPackage()
  {
    return FirewalllPackage.eINSTANCE;
  }

} //FirewalllFactoryImpl
