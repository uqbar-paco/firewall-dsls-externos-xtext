/**
 */
package edu.tadp.firewall.firewalll.impl;

import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.Regla;
import edu.tadp.firewall.firewalll.ReglaEtiquetada;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regla Etiquetada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.ReglaEtiquetadaImpl#getLan <em>Lan</em>}</li>
 *   <li>{@link edu.tadp.firewall.firewalll.impl.ReglaEtiquetadaImpl#getRegla <em>Regla</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReglaEtiquetadaImpl extends MinimalEObjectImpl.Container implements ReglaEtiquetada
{
  /**
   * The default value of the '{@link #getLan() <em>Lan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLan()
   * @generated
   * @ordered
   */
  protected static final String LAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLan() <em>Lan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLan()
   * @generated
   * @ordered
   */
  protected String lan = LAN_EDEFAULT;

  /**
   * The cached value of the '{@link #getRegla() <em>Regla</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegla()
   * @generated
   * @ordered
   */
  protected Regla regla;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReglaEtiquetadaImpl()
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
    return FirewalllPackage.Literals.REGLA_ETIQUETADA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLan()
  {
    return lan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLan(String newLan)
  {
    String oldLan = lan;
    lan = newLan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA_ETIQUETADA__LAN, oldLan, lan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Regla getRegla()
  {
    return regla;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegla(Regla newRegla, NotificationChain msgs)
  {
    Regla oldRegla = regla;
    regla = newRegla;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA_ETIQUETADA__REGLA, oldRegla, newRegla);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegla(Regla newRegla)
  {
    if (newRegla != regla)
    {
      NotificationChain msgs = null;
      if (regla != null)
        msgs = ((InternalEObject)regla).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.REGLA_ETIQUETADA__REGLA, null, msgs);
      if (newRegla != null)
        msgs = ((InternalEObject)newRegla).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FirewalllPackage.REGLA_ETIQUETADA__REGLA, null, msgs);
      msgs = basicSetRegla(newRegla, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FirewalllPackage.REGLA_ETIQUETADA__REGLA, newRegla, newRegla));
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
      case FirewalllPackage.REGLA_ETIQUETADA__REGLA:
        return basicSetRegla(null, msgs);
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
      case FirewalllPackage.REGLA_ETIQUETADA__LAN:
        return getLan();
      case FirewalllPackage.REGLA_ETIQUETADA__REGLA:
        return getRegla();
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
      case FirewalllPackage.REGLA_ETIQUETADA__LAN:
        setLan((String)newValue);
        return;
      case FirewalllPackage.REGLA_ETIQUETADA__REGLA:
        setRegla((Regla)newValue);
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
      case FirewalllPackage.REGLA_ETIQUETADA__LAN:
        setLan(LAN_EDEFAULT);
        return;
      case FirewalllPackage.REGLA_ETIQUETADA__REGLA:
        setRegla((Regla)null);
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
      case FirewalllPackage.REGLA_ETIQUETADA__LAN:
        return LAN_EDEFAULT == null ? lan != null : !LAN_EDEFAULT.equals(lan);
      case FirewalllPackage.REGLA_ETIQUETADA__REGLA:
        return regla != null;
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
    result.append(" (lan: ");
    result.append(lan);
    result.append(')');
    return result.toString();
  }

} //ReglaEtiquetadaImpl
