/**
 */
package edu.tadp.firewall.firewalll.util;

import edu.tadp.firewall.firewalll.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.tadp.firewall.firewalll.FirewalllPackage
 * @generated
 */
public class FirewalllSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FirewalllPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirewalllSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FirewalllPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FirewalllPackage.FIREWALL:
      {
        Firewall firewall = (Firewall)theEObject;
        T result = caseFirewall(firewall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.REGLA_ETIQUETADA:
      {
        ReglaEtiquetada reglaEtiquetada = (ReglaEtiquetada)theEObject;
        T result = caseReglaEtiquetada(reglaEtiquetada);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.REGLA:
      {
        Regla regla = (Regla)theEObject;
        T result = caseRegla(regla);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.ACCION:
      {
        Accion accion = (Accion)theEObject;
        T result = caseAccion(accion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.FORWARDEAR_ACCION:
      {
        ForwardearAccion forwardearAccion = (ForwardearAccion)theEObject;
        T result = caseForwardearAccion(forwardearAccion);
        if (result == null) result = caseAccion(forwardearAccion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.ACEPTAR_ACCION:
      {
        AceptarAccion aceptarAccion = (AceptarAccion)theEObject;
        T result = caseAceptarAccion(aceptarAccion);
        if (result == null) result = caseAccion(aceptarAccion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.BLOQUEAR_ACCION:
      {
        BloquearAccion bloquearAccion = (BloquearAccion)theEObject;
        T result = caseBloquearAccion(bloquearAccion);
        if (result == null) result = caseAccion(bloquearAccion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.CONDICION:
      {
        Condicion condicion = (Condicion)theEObject;
        T result = caseCondicion(condicion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.CONDICION_PUERTO:
      {
        CondicionPuerto condicionPuerto = (CondicionPuerto)theEObject;
        T result = caseCondicionPuerto(condicionPuerto);
        if (result == null) result = caseCondicion(condicionPuerto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.CONDICION_IP:
      {
        CondicionIP condicionIP = (CondicionIP)theEObject;
        T result = caseCondicionIP(condicionIP);
        if (result == null) result = caseCondicion(condicionIP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FirewalllPackage.IP:
      {
        IP ip = (IP)theEObject;
        T result = caseIP(ip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Firewall</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Firewall</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirewall(Firewall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regla Etiquetada</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regla Etiquetada</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReglaEtiquetada(ReglaEtiquetada object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Regla</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Regla</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegla(Regla object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccion(Accion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forwardear Accion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forwardear Accion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForwardearAccion(ForwardearAccion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aceptar Accion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aceptar Accion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAceptarAccion(AceptarAccion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bloquear Accion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bloquear Accion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBloquearAccion(BloquearAccion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condicion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condicion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondicion(Condicion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condicion Puerto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condicion Puerto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondicionPuerto(CondicionPuerto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condicion IP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condicion IP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondicionIP(CondicionIP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIP(IP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FirewalllSwitch
