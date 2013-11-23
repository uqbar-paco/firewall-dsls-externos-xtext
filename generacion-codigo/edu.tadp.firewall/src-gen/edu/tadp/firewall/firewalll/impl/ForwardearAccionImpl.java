/**
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.ForwardearAccion;
import edu.tadp.firewall.firewalll.IP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forwardear Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.ForwardearAccionImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.ForwardearAccionImpl#getPuerto <em>Puerto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardearAccionImpl extends AccionImpl implements ForwardearAccion
{
  /**
   * The cached value of the '{@link #getIp() <em>Ip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected IP ip;

  /**
   * The default value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPuerto()
   * @generated
   * @ordered
   */
  protected static final int PUERTO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPuerto()
   * @generated
   * @ordered
   */
  protected int puerto = PUERTO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForwardearAccionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FirewalllPackage.Literals.FORWARDEAR_ACCION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IP getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIp(IP newIp, NotificationChain msgs)
  {
    IP oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FirewalllPackage.FORWARDEAR_ACCION__IP, oldIp, newIp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIp(IP newIp)
  {
    if (newIp != ip)
    {
      NotificationChain msgs = null;
      if (ip != null)
        msgs = ((InternalEObject)ip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.FORWARDEAR_ACCION__IP, null, msgs);
      if (newIp != null)
        msgs = ((InternalEObject)newIp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.FORWARDEAR_ACCION__IP, null, msgs);
      msgs = basicSetIp(newIp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.FORWARDEAR_ACCION__IP, newIp, newIp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPuerto()
  {
    return puerto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPuerto(int newPuerto)
  {
    int oldPuerto = puerto;
    puerto = newPuerto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.FORWARDEAR_ACCION__PUERTO, oldPuerto, puerto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FirewalllPackage.FORWARDEAR_ACCION__IP:
        return basicSetIp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FirewalllPackage.FORWARDEAR_ACCION__IP:
        return getIp();
      case FirewalllPackage.FORWARDEAR_ACCION__PUERTO:
        return getPuerto();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FirewalllPackage.FORWARDEAR_ACCION__IP:
        setIp((IP)newValue);
        return;
      case FirewalllPackage.FORWARDEAR_ACCION__PUERTO:
        setPuerto((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FirewalllPackage.FORWARDEAR_ACCION__IP:
        setIp((IP)null);
        return;
      case FirewalllPackage.FORWARDEAR_ACCION__PUERTO:
        setPuerto(PUERTO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FirewalllPackage.FORWARDEAR_ACCION__IP:
        return ip != null;
      case FirewalllPackage.FORWARDEAR_ACCION__PUERTO:
        return puerto != PUERTO_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (puerto: ");
    result.append(puerto);
    result.append(')');
    return result.toString();
  }

} //ForwardearAccionImpl
